'''
Task1:-
=======
Given:-
=======
name = "harshavardhan"

Expected:-
==========
res1 = "harshavardhaN" # convert the last letter to upper case
res2 = "HarshavardhaN" # convert the first & last letter to upper case
res3 = "harshavar-DHAN"# Convert the last 4 letters to upper case
res4 = "harshavar-NAHD"# Convert the last 4 letters to upper case & reverse it
'''
name = "harshavardhan"

res1 = name[:-1]+name[-1].upper()
print(res1)

res2 = name[0].upper()+ name[1:-1] + name[-1].upper()
print(res2)
'''
p1 = name[:9]
p2 = name[-4:].upper()
res3 = p1 +"-"+p2
print(res3)
'''
list = [name[:9],name[-4:].upper()]
res3 = "-".join(list)
print(res3)

list = [name[:-4], name[-4:][::-1].upper()]
res4 = "-".join(list)
print(res4)