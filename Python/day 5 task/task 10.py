"""
 Task10:
========
 
write a program to convert the file contents of upper case
Enter the file name : one.txt
Enter the output file : out.txt
 
contents of one.txt:----------------------
hello world of unix was
the output of the above
program which was given

contents of out.txt:----------------------
HELLO WORLDOFUNIXWAS
THE OUTPUTOFTHEABOVE
PROGRAMWHICHWASGIVEN
"""
f1 = open("one.txt", "w")
f1.write("hello world of unix was\n")
f1.write("the output of the above\n")
f1.write("program which was given\n")
f1.close()

f1 = open("one.txt", "r") 
f2 = open("out.txt", "w")
for line in f1:
    upper = "".join(word.upper() for word in line.split())
    f2.write(upper + '\n')

f1.close()
f2.close()
