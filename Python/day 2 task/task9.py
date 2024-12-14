"""
Task9:-
=======
Given:-
========
data = [10,20,30,40,50]

Expected:-
----------
res="10-20-30-40-50"
"""
data = [10,20,30,40,50]
str_data = list()
for elem in data:
    str_data.append(str(elem))
res = "-".join(str_data)
print(res)
