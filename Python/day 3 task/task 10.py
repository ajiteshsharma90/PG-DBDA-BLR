"""Task10:-
========
grp1 = {"blr" : 5, "chn": 5, "hyd": 5  , "del" : 5 }
grp2 = {"blr" : 1, "mum": 2, "noida": 3, "del" : 4 }

Expected:-
==========
print(res) # {"blr"  : 6,
              "chn"  : 5,
              "hyd"  : 5,
              "del"  : 9,
              "mum"  : 2,
              "noida": 3}  
"""

grp1 = {"blr" : 5, "chn": 5, "hyd": 5  , "del" : 5 }
grp2 = {"blr" : 1, "mum": 2, "noida": 3, "del" : 4 }
res = {elem: grp1.get(elem, 0) + grp2.get(elem, 0) for elem in set(grp1) | set(grp2) }
print(res)
print("---------------------------")
res1 = grp1.copy()
for keys,values in grp2.items():
    if keys in res1:
        res1[keys] = res1[keys] + values
    else:
        res1[keys] = values
print("\n", res1, "\n")