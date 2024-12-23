/*
mkdir -m 755 cust_combiner
javac -classpath $(hadoop classpath) -d cust_combiner CombinerClass.java
jar -cvf ${HOME}/scripts/custcombiner.jar -C cust_combiner/ .
hadoop jar ${HOME}/scripts/custcombiner.jar CombinerClass /volcheck /combiner.res1
*/

import java.io.IOException;
 
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.fs.Path;
import java.lang.Math;
 
public class CombinerClass {
    public static class Map extends Mapper<LongWritable,Text,Text,IntWritable>
    {
        public void map(LongWritable key,Text value,Context context) throws IOException, InterruptedException
        {
            int i=1;
            String S[]=value.toString().split("[,]");
            //context.write(new Text(S[0]),new IntWritable(i));
            //if (S[1].matches("[0-9]+")) {
            if(!(S[1].matches("^[a-zA-Z]*$"))){
                context.write(new Text(S[0]),new IntWritable(Math.round(Float.valueOf(S[1])*100 )));
            }
        }
    }

    public static class Combiner extends Reducer<Text,IntWritable,Text,IntWritable>
    {
        public void reduce(Text key,Iterable<IntWritable> value,Context context) throws IOException, InterruptedException
        {
            int sum=1000;
            for(IntWritable v:value)
                sum+=v.get();
            
            context.write(key,new IntWritable(sum));
        }    
    }
    
    public static class Reduce extends Reducer<Text,IntWritable,Text,IntWritable>
    {
        public void reduce(Text key,Iterable<IntWritable> value,Context context) throws IOException, InterruptedException
        {
            int sum=0;
            for(IntWritable v:value)
                sum+=v.get();
            
            context.write(key,new IntWritable(sum));
        }
    }
    
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws Exception
    {
    
        Configuration conf= new Configuration();
        
        Job job = new Job(conf,"My Combiner Program");
        
        job.setJarByClass(CombinerClass.class);
        job.setMapperClass(Map.class);
        job.setReducerClass(Reduce.class);
        job.setCombinerClass(Combiner.class);
        
        job.setOutputKeyClass(Text.class);
        job.setOutputValueClass(IntWritable.class);
        
        job.setInputFormatClass(TextInputFormat.class);
        job.setOutputFormatClass(TextOutputFormat.class);
        
        FileInputFormat.addInputPath(job, new Path(args[0]));
        FileOutputFormat.setOutputPath(job, new Path(args[1]));
        
        //exiting the job only if the flag value becomes false
        
        System.exit(job.waitForCompletion(true) ? 0 : 1);
    } 
}