/*
hdfs dfs -put /volcheck /volcheck
mkdir -m 755 counterchk
javac -classpath $(hadoop classpath) -d counterchk CounterChk.java
jar -cvf ${HOME}/scripts/counterchk.jar -C counterchk/ .
hadoop jar ${HOME}/scripts/counterchk.jar CounterChk /volcheck /cntchk.res666
*/


	import java.io.IOException;
	import java.util.*;
	
	import org.apache.hadoop.fs.Path;
	import org.apache.hadoop.conf.*;
	import org.apache.hadoop.io.*;
	import org.apache.hadoop.mapred.*;
	import org.apache.hadoop.util.*;
    import java.lang.Math;
	
	public class CounterChk {
	    public static class Map extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable> {
            Text vol = new Text();
            IntWritable one = new IntWritable(1);
            static enum DataCounters {MISSING, TOTAL};
			// user defined variables as enumerators
			// to be used as counters
			// you can have anything you want
	     
            public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter reporter) throws IOException {
            String[] parts = value.toString().split("[,]");
            if(!(parts[6].matches("^[a-zA-Z]*$"))){
                int voli=Integer.valueOf(parts[6])/1000000;
                vol=new Text(String.valueOf(voli));
                if (voli > 2 ){
					// increment the counter named TOTAL
					// whenever the 7th column in input contains
					// a number more than 2 million
                    reporter.incrCounter(DataCounters.TOTAL, 1);
					/*
						Increment the enumerator
						Pass the updated value of enumerator to the Reporter
						Reporter uses it to report
					*/
                }
                output.collect(vol, one);
            }
	     }
	   }
	
	   public static class Reduce extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable> {
            public void reduce(Text key, Iterator<IntWritable> values, OutputCollector<Text, IntWritable> output, Reporter reporter) throws IOException
            {
                int sum = 0;
	            while (values.hasNext()) {
	                sum += values.next().get();
	            }
                output.collect(key, new IntWritable(sum));
            }
        }
	
	   public static void main(String[] args) throws Exception {
	     JobConf conf = new JobConf(CounterChk.class);
         //Job job=new Job(conf,"counters");
	     conf.setJobName("counter check");
	
	     conf.setOutputKeyClass(Text.class);
	     conf.setOutputValueClass(IntWritable.class);
	
	     conf.setMapperClass(Map.class);
	     conf.setCombinerClass(Reduce.class);
	     conf.setReducerClass(Reduce.class);
	
	     conf.setInputFormat(TextInputFormat.class);
	     conf.setOutputFormat(TextOutputFormat.class);
	
	     FileInputFormat.setInputPaths(conf, new Path(args[0]));
	     FileOutputFormat.setOutputPath(conf, new Path(args[1]));
	
	     JobClient.runJob(conf);

	   }
	}



