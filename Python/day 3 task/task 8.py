"""Task8:-
=======
grps = ["alpha", "beta", "delta", "alpha", "beta", "omega","alpha"]

Problem:-
---------
find the unique & duplicate values in above list

Expected:-
----------
print(unique)      # ["delta", "omega"]
print(duplicates)  # ["alpha", "beta"]
"""

grps = ["alpha", "beta", "delta", "alpha", "beta", "omega","alpha"]

uniq = []
dupli = []
for elem in grps:
    count = grps.count(elem)
    if count > 1:
        if elem not in dupli:
            dupli.append(elem)
    else:
        uniq.append(elem)

print(uniq)
print(dupli)
