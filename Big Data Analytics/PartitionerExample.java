/*
Objective - use custom paritioner to 

copy as PartitionerExample.java
hdfs dfs -put /src/salary.csv /salary
mkdir -m 755 partitionerexample_classes
javac -classpath $(hadoop classpath) -d partitionerexample_classes PartitionerExample.java
jar -cvf ${HOME}/scripts/partitionerexample.jar -C partitionerexample_classes/ .
hadoop jar ${HOME}/scripts/partitionerexample.jar PartitionerExample /volres /v1
*/

import java.io.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.conf.*; 
import org.apache.hadoop.conf.*;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.mapreduce.lib.input.*;
import org.apache.hadoop.mapreduce.lib.output.*;
import org.apache.hadoop.util.*;

public class PartitionerExample extends Configured implements Tool
{
   //Map class
   public static class MapClass extends Mapper<LongWritable,Text,Text,Text>
   {
      public void map(LongWritable key, Text value, Context context)
      {
         try{
            String[] str = value.toString().split("[,]");
            String dt=str[0];
            context.write(new Text(dt), new Text(dt));
         }
         catch(Exception e)
         {
            System.out.println(e.getMessage());
         }
      }
   }

   //Reducer class
   public static class ReduceClass extends Reducer<Text,Text,Text,IntWritable>
   {
      public int max = 1;
      public void reduce(Text key, Iterable <Text> values, Context context) throws IOException, InterruptedException
      {
         /*max = -1;
         for (Text val : values)
         {
            String [] str = val.toString().split("\t");
            if(Integer.parseInt(str[4])>max)
               max=Integer.parseInt(str[4]);
         }*/
         context.write(new Text(key), new IntWritable(max));
      }
   }
   
   public static class CaderPartitioner extends Partitioner < Text, Text >
   {
      public int getPartition(Text key, Text value, int numReduceTasks)
      {
         String[] str = value.toString().split("[-]");
         int vl = Integer.parseInt(str[0]);
         if(numReduceTasks == 0)
         {
            return 0;
         }
         if(vl<=2000)
         {
            return 0;
         }
         else if(vl>2000 && vl<=2010)
         {
            return 1 % numReduceTasks;
         }
         else
         {
            return 2 % numReduceTasks;
         }
      }
   }

   @Override
   public int run(String[] arg) throws Exception
   {
      Configuration conf = getConf();
      Job job = new Job(conf, "cust part");
      job.setJarByClass(PartitionerExample.class);
      FileInputFormat.setInputPaths(job, new Path(arg[0]));
      FileOutputFormat.setOutputPath(job,new Path(arg[1]));
      job.setMapperClass(MapClass.class);
      job.setMapOutputKeyClass(Text.class);
      job.setMapOutputValueClass(Text.class);
      //set partitioner statement
      
      job.setReducerClass(ReduceClass.class);
      job.setPartitionerClass(CaderPartitioner.class);
      job.setNumReduceTasks(3);
      job.setInputFormatClass(TextInputFormat.class);
      job.setOutputFormatClass(TextOutputFormat.class);
      job.setOutputKeyClass(Text.class);
      job.setOutputValueClass(Text.class);
      System.exit(job.waitForCompletion(true)? 0 : 1);
      return 0;
   }
   public static void main(String ar[]) throws Exception
   {
      int res = ToolRunner.run(new Configuration(), new PartitionerExample(),ar);
      System.exit(0);
   }
}