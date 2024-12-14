'''
Task3:-
=======
sales = ["dvd-50", "prn-30", "mon-10", "hdd-55", "cpu-20"]

Problem:-
---------
>>filter out product name if quantity >=40
>>Store the resultant in a new list
>>filter out product name if quantity <40
>>Store the resultant in a new list

Expected:-
-----------
above40 = ["dvd", "hdd"]
below40 = ["prn", "mon", "cpu"]
'''
above40 = []
below40 = []
sales = ["dvd-50", "prn-30", "mon-10", "hdd-55", "cpu-20"]
above40  = [elem.split("-")[0] for elem in sales if int(elem.split("-")[1]) >= 40 ]
below40  = [elem.split("-")[0] for elem in sales if int(elem.split("-")[1]) < 40 ]
print(above40)
print(below40)
