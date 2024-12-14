"""
Task6:-
========
Modify the program above using a while loop so it prints out all of the factorial
values that are less than 2 billion. (You should be able to do this without looking at the
output of the previous exercise.)
"""
f = 1
n = 0

while f<2000000000:
    print(f"{n}! = {f}")
    n =n+1
    f =f*n