"""Task9:-
=======
Given:-
-------
names = ["ravi", "arun", "raja", "amit", "ankur", "harish"]

Problem:-
---------
>> Convert the first and last letter to upper case each string

Expected:-
----------
print(res) # ["RavI", "AruN", "RajA", "AmiT", "AnkuR", "HarisH"]

"""

names = ["ravi", "arun", "raja", "amit", "ankur", "harish"]
res = [name[0].upper() + name[1:-1] + name[-1].upper() for name in names]
print(res)