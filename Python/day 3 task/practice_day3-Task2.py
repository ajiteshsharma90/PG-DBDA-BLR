'''Task2:-
========
Given:-
-------
names = ["ravi", "arun", "raja", "amit", "Ankur", "hari"]

Problem:-
---------
>>filter out names starting with "a"
>>Ignore the case
>>Store the resultant in a new list

Expected:-
-----------
res = ["arun", "amit", "Ankur"]'''

res=[]
names = ["ravi", "arun", "raja", "amit", "Ankur", "hari"]
for elem in names:
    if(elem[0].lower() == "a"):
        res.append(elem)
print(res)

res1 = []
res1 = [elem for elem in names if elem[0].lower() == "a" ]
print(res1)

res2 = []
res2 = list(filter(lambda ele : ele[0].lower() == "a",names) )
print(res2)
