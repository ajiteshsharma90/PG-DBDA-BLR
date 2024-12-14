"""
 Task9:
=======
 Write a program to display the first and last word of a given file
 Enter a filename : one.txt
 
 contents of one.txt:----------------------
 hello world of unix was
 the output of the above
 program which was given

 Expected output is :----------------------
 hello- was
 the- above
 program- given
""" 
f1 = open("one.txt", "w")
f1.write("hello world of unix was\n")
f1.write("the output of the above\n")
f1.write("program which was given\n")
f1.close()

# f1 = open("one.txt", "r")
# for line in f1:
#     word = line.split()
#     if word:
#         first = word[0]
#         last = word[-1]
#         print(first)
#         print(last)
# f1.close()

[print(line.split()[0]) for line in open("one.txt")]
[print(line.split()[-1]) for line in open("one.txt")]