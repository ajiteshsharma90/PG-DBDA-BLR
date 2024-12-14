"""
Task8:-
========
Define a procedure histogram() that takes a list of integers and prints a histogram
to the screen. For example, histogram([4, 9, 7]) should print the following:

****
*********
*******
"""
h = [5,4,3,2,1]
for elem in list(h):
    print("*"*elem)