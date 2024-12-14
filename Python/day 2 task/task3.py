"""
Task3:-
=======
data = "15-aug-1947 10:30:45"

using split method split the above data

display the following data

Expected:-
-----------
date is = 15-aug-1947
day = 15
month = aug
year = 1947
time is = 10:30:45
hours = 10
mins = 30
secs = 45
"""
data = "15-aug-1947 10:30:45"
flst = data.split()[0]
print("Date is :", flst)

flst1 = flst.split("-")
print("Day = ",flst1[0])
print("Month = ",flst1[1])
print("year = ",flst1[2])

time = data.split()[1]
print("time is =", time)
t1 = time.split(":")
print("hours = ",t1[0])
print("mins = ",t1[1])
print("secs = ",t1[2])

