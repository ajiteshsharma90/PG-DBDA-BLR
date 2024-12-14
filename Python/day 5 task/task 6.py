"""
Task6:
=======
Write a function filter_long_words() that takes a list of words and an integer n
and returns the list of words that are longer than n
"""
def filter_long_words(words, n):
    return[word for word in words if len(word)> n]
words = ["apple", "banana", "kiwi", "cherry", "date"]
n = 5
long_word = filter_long_words(words, n)
print(long_word)
