"""
Task4:-
========
data = "ravi-sales-20,10,40,30"

Expected:-
----------
total sales = 100
min = 10
max = 40
avg = 20.00
"""
data = "ravi-sales-20,10,40,30"
list = data.split("-")[2].split(",")

total_sales = 0
min = int(list[0])
max = int(list[0])
for ele in list:
    total_sales = total_sales + int(ele)
print("Total Sales = ",total_sales)

for ele in list:
    if(int(ele) < min):
        min = int(ele)
print("Minimum =",min)

for ele in list:
    if(int(ele) > max):
        max = int(ele)
print("Maximum =",max)

avg = total_sales/len(list)
print("Average =",avg)