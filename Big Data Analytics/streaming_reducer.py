#!/usr/bin/python3
import sys
from operator import itemgetter
# using a dictionary to map words to their counts
current_word = None
current_count = 0
word = None
# input comes from STDIN
for line in sys.stdin:
    line = line.strip()
    #print(line)
    word,count = line.split(' ',1)
    #print(word, count)
    try:
        count = int(count)
    except ValueError as e:
        #print(e)
        pass
    
    if current_word == word:
        current_count += count
    else:
        #if current_word:
            print (current_word, current_count)
            current_count = count
            current_word = word

if current_word == word:
    print (current_word,current_count)