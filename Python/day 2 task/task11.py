"""Task11:-
========
using for loop
print the following outputs

output1:-
---------
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

output2:-
--------
A
B B
C C C
D D D D
"""
for i in range(1,6):
    print(f"{i}" * i)

for k in range(1,5):
    print(f"{chr(64+k)}" * k)