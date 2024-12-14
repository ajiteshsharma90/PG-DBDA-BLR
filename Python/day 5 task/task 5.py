"""
 Task5:
=======
 Write a function find_longest_word() that takes a list of words and returns the
 length of the longest one."""

def find_longest_word(l1):
    longwrd = 0
    for word in l1:
        if len(word) > longwrd:
            longwrd = len(word)
    return longwrd

word_list = ["apple", "banana", "cherry", "watermelon", "PriyanshuJainFromIndore"]
longwrd = find_longest_word(word_list)   
print(longwrd)