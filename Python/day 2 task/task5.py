"""
Task5:-
=======
 Using for loop, write and run a Python program for this algorithm.
Here is an algorithm to print out n! (n factorial) from 0! to 10! :
1. Set f = 1
2. Set n = 0
3. Repeat the following 10 times:
a. Output n, "! = ", f
b. Add 1 to n
c. Multiply f by n
"""

f = 1
n = 0

for i in range(11):
    print(f"{n}! = {f}")
    n =n+1
    f =f*n