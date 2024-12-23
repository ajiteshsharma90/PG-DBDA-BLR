/*
mkdir -m 755 cust_combiner
javac -classpath $(hadoop classpath) -d cust_combiner CombinerClass.java
jar -cvf ${HOME}/scripts/custcombiner.jar -C cust_combiner/ .
hadoop jar ${HOME}/scripts/custcombiner.jar CombinerClass /volcheck /combiner.res1
*/

/*
Map(breask into K,V) -> shuffle/sort  (all K,Vs) -> Reduce (aggregate on entire data)
Map(breask into K,V) -> Combiner (aggregate each Map's data) -> \
shuffle/sort  (all K,Vs) -> Reduce (aggregate )

scenario 1:
M1 -> (aa,1),(bb,1),(aa,1)
M2 -> (aa,1), (bb,1),(cc,1)

R -> (aa,3), (bb,2),(cc,1)

scenario 2:
M1 -> (aa,1),(bb,1),(aa,1) -> C1 -> (aa,2),(bb,1)
M2 -> (aa,1), (bb,1),(cc,1)-> C2 -> (aa,1), (bb,1),(cc,1)

R -> (aa,3), (bb,2),(cc,1)
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
 
public class CombinerClass {
    public static class Map extends Mapper<LongWritable,Text,Text,IntWritable>
    {
        public void map(LongWritable key,Text value,Context context) throws IOException, InterruptedException
        {
            int i=1;
            String S[]=value.toString().split("\t");
            context.write(new Text(S[0]),new IntWritable(i));
        }
    }

    public static class Combiner extends Reducer<Text,IntWritable,Text,IntWritable>
    {
        public void reduce(Text key,Iterable<IntWritable> value,Context context) throws IOException, InterruptedException
        {
            int sum=0;
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