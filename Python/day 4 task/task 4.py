"""
Task4:-
-------
A pangram is a sentence that contains all the letters of the English alphabet at
least once, for example: The quick brown fox jumps over the lazy dog. Your task here is
to write a function to check a sentence to see if it is a pangram or not.
"""
def is_pangoram(sentance):
    alphabets = "abcdefghijklmnopqrstuvwxyz"
    ns = sentance.lower()
    for letter in alphabets:
        if letter not in ns:
            print("false")
        else:
            print("true")
string = input("enetr : ")
is_pangoram(string)