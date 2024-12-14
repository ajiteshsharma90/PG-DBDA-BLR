"""
Task3:-
-------
Write a version of a palindrome recognizer that also accepts phrase palindromes
such as "Go hang a salami I'm a lasagna hog.", "Was it a rat I saw?", "Step on no pets",
"Sit on a potato pan, Otis", "Lisa Bonet ate no basil", "Satan, oscillate my metallic
sonatas", "I roamed under it as a tired nude Maori", "Rise to vote sir", or the exclamation
"Dammit, I'm mad!". Note that punctuation, capitalization, and spacing are usually
ignored.
"""
def is_palindrome(sentance):
    clean_str = ""
    punctuation = r",!'?."
     
    for char in punctuation:
        sentance = sentance.replace(char, "")
    clean_str = sentance.replace(" ", "").lower()

    if (clean_str == clean_str[::-1]):
        print(" palindrome ")
    else:
        print("not palindrom")
string = input("enetr : ")
is_palindrome(string)