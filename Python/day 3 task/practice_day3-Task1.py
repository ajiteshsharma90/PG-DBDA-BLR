'''
Task1:-
========
Given:-
-------

data = "ravi-blr-math=50,sci=40,soc=30"

Problem:-
--------
>> find the total from the above data
Expected:-
----------
Total marks = 120
'''
res = []
data = "ravi-blr-math=50,sci=40,soc=30"
data1 = data.split(",")
res = [ int(num.split("=")[-1]) for num in data1]
print("Total marks = %d"%(sum(res)))

res2 = []
data2 = data.split(",")
res2 = [int(num.split("=")[-1] for num in data2)]
print(res2)