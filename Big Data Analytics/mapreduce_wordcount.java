   
/*
Objective - count all words occuring in input data

save file as WordCount.java
hdfs dfs -put /src/iliad.csv /wordcount
mkdir -m 755 wordcount_classes
javac -classpath $(hadoop classpath) -d wordcount_classes WordCount.java
jar -cvf ${HOME}/scripts/wordcount.jar -C wordcount_classes/ .
hadoop jar ./wordcount.jar org.myorg.WordCount /wordcount /wordcount.res
*/

   package org.myorg;
	
	import java.io.IOException;
	import java.util.*;
	
	import org.apache.hadoop.fs.Path;
	import org.apache.hadoop.conf.*;
	import org.apache.hadoop.io.*;
	import org.apache.hadoop.mapred.*;
	import org.apache.hadoop.util.*;
	
	public class WordCount {
	
	   public static class Map extends MapReduceBase implements Mapper<LongWritable, Text, Text, IntWritable> {
	     /*
		 	function: convert input into kay value pairs
			LongWritable, Text, Text, IntWritable
				-	LongWritable, Text = 2 Inputs in this format
				-	Text, IntWritable = 2 outputs in this format
		 */
		 private final static IntWritable one = new IntWritable(1);
	     private Text word = new Text();
	
	     public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter reporter) throws IOException {
	       /*
				Inputs:
					LongWritable key = binary position of every line read in the input file
					Text value = complete line itself
					Input ex:
						My name is AA
						Your name is BB
		   */
		   String line = value.toString();
	       StringTokenizer tokenizer = new StringTokenizer(line);
		   // break line into words
	       while (tokenizer.hasMoreTokens()) {
			// put the below section in an if block which
			// would only processes if the first letter of the input was
			// a,e,i,o,u
			
				word.set(tokenizer.nextToken());
				output.collect(word, one);
				/*
					Output - Round 1 - input to loop =[My, name, is, AA]:
					(My,1)
					(name,1)
					(is,1)
					(AA,1)
					Output - Round 2 - input to loop =[My, name, is, BB]:
					(Your,1)
					(name,1)
					(is,1)
					(BB,1)
				*/
	       }
	     }
	   }
	
	   public static class Reduce extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable> {
	     /*
				partitioning/shuffling/sorting before Reduce started
				My, [(My,1)] => My, 1
				name, [
					1
					1
				] => name, 2
				is, [
					(is,1)
					(is,1)
				] => is, 2
				AA, [(AA,1)] => AA, 1
				Your,[(Your,1)] => Your, 1
				BB,[(BB,1)] => BB, 1
		 */
		 private IntWritable result = new IntWritable();
		 public void reduce(Text key, Iterator<IntWritable> values, OutputCollector<Text, IntWritable> output, Reporter reporter) throws IOException {
	       int sum=0;
	       while (values.hasNext()) {
	         sum += values.next().get();
	       }
		   result.set(sum);
	       output.collect(key, result);
	     }
	   }
	
	   public static void main(String[] args) throws Exception {
	     JobConf conf = new JobConf(WordCount.class);
	     conf.setJobName("wordcount");
	
	     conf.setMapperClass(Map.class);
	     conf.setCombinerClass(Reduce.class);
	     conf.setReducerClass(Reduce.class);
	
	     conf.setInputFormat(TextInputFormat.class);
	     conf.setOutputFormat(TextOutputFormat.class);

	     conf.setOutputKeyClass(Text.class);
	     conf.setOutputValueClass(IntWritable.class);
	
	     FileInputFormat.setInputPaths(conf, new Path(args[0]));
		 /*
			/userdata/input
		 */
	     FileOutputFormat.setOutputPath(conf, new Path(args[1]));
		 /*
			/userdata/output
		 */

	     JobClient.runJob(conf);
	   }
	}



