"""Task3:
=======
Write program to find the most repeated word in a file
Assume the file "data.txt" contains----------------------------------
this that this this this that
then that that that
that this then that
Expected:----------
Most repeated word in the file is = this
"""
# from collections import Counter
# f1 = open("data.txt", "w") 
# f1 = open("data.txt", "r")
# line = f1.read()
# word = line.split()
# count = Counter(word)
# most_common_word, most_common_count = count.most_common(1)[0]
# print(f"Most repeated word in the file is = {most_common_word}")


from collections import Counter
f1 = open("data.txt", "w")
f1.write("this that this this this that then that that that that this then that")

f1 = open("data.txt", "r")
word = f1.read().split()
print(word)

c_word = Counter(word)
print(c_word)

most_word = sorted(c_word,key= lambda k: c_word[k])[-1]
print(most_word)
