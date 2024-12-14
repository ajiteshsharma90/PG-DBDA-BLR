'''
Task4:-
=======
cities = ["blr", "chn", "mum", "hyd", "del"]
grps = ["blr", "del", "noida"]

Problem:-
---------
>>find the common city names between two lists 
>>Don't use set operations

Expected:-
-----------
common = ["blr", "del"]
'''
cities = ["blr", "chn", "mum", "hyd", "del"]
grps = ["blr", "del", "noida"]
common = []
for city in cities:
    for grp in grps:
        if(city == grp):
            common.append(city)

print(common)

common1 =[]
common1 = [city for city in cities  if city in grps ]
print(common1)

common2 = []
common2 = list(filter(lambda city: city in grps , cities))
print(common2)