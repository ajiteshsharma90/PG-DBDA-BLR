"""Task10:-
=========
Given:-
========
data = "10-50-25-12-85"

Expected:-
==========
res = "11-51-26-13-86"
"""
data = "10-50-25-12-85"
str_data = list()
for elem in data.split("-"):
    str_data.append(str(int(elem) +1))
res = "-".join(str_data)
print(res)