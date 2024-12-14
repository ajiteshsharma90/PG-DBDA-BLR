'''
Task6:-
========
grp1 = ["red=10", "blue=20", "green=30", "black=40"]
grp2 = ["orange=50", "brown=45", "red=5", "black=33"]

Problem:-
----------
>> using set operations - find the common colours b/w them

Expected:-
==========
print(res)  # {"red", "black"}
'''
grp1 = ["red=10", "blue=20", "green=30", "black=40"]
grp2 = ["orange=50", "brown=45", "red=5", "black=33"]

set1 = {ele.split("=")[0] for ele in grp1}
print(set1)
set2 = {ele.split("=")[0] for ele in grp2}
print(set2)
res = set1 & set2
print(res)