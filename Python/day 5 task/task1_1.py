""" 
Task1:
========
f1 = open("data.csv", "w")
f1.write("name,loc,salary\n")
f1.write("arun,blr,25000\n")
f1.write("hari,chn,45000\n")
f1.write("john,mum,30000\n")
f1.write("manu,hyd,35000")
f1.close()
>>run the above program- it will create a csv file
>>read the csv file store this data in a DATABASE TABLE
"""
import mysql.connector

with open("data.csv", "w") as f1:
    f1.write("name,location,salary\n")
    f1.write("arun,blr,25000\n")
    f1.write("hari,chn,45000\n")
    f1.write("john,mum,30000\n")
    f1.write("manu,hyd,35000")
    
conn = mysql.connector.connect(
    host='localhost', 
    port=3306,
    user='root', 
    password='ajitesh',
    database='pythondata')

with open("data.csv", "r") as f1:
    next(f1) 
    cur = conn.cursor()
# inr  = f1.readline()
# print(inr)
    for l1 in f1:
        name,location,salary= l1.split(",")
        cur.execute("INSERT INTO employees (name, location, salary) VALUES (%s, %s, %s)", (name, location, int(salary)))



conn.commit()
cur.close()
conn.close()
f1.close()