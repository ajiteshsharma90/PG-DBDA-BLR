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

f1 = open("data.csv", "w")
f1.write("name,loc,salary\n")
f1.write("arun,blr,25000\n")
f1.write("hari,chn,45000\n")
f1.write("john,mum,30000\n")
f1.write("manu,hyd,35000")
f1.close()

fr = open("data.csv", "r")
# ins = fr.readlines()[1:]
# print(ins)



import mysql.connector
from mysql.connector import Error
 # type: ignore
# conn = mysql.connector.connect(
#     host='localhost', 
#     port = 3306,
#     user='root',
#     password='ajitesh',
#     database='pythondata')

# cur = conn.cursor()

# for line in ins:
#     name,location,salary = line.split(",")
#     cur.execute("INSERT INTO employees (name, location, salary) VALUES (%s, %s, %s)", (name, location, int(salary)))
# conn.commit()
# cur.close()
# conn.close()

# try:
#     conn = mysql.connector.connect(host = 'localhost', port = 3306,user = 'root', password='ajitesh',database = 'pythondata')

# except Error as e:
#     print("Error while connecting to MySQL", e)

# else:
#     cur = conn.cursor()
#     for record in fr:
#         name,loc,sal = record.split(",")
#         cur.execute("insert into task_1(name,location,salary) values(%s,%s,%s)",(name,loc,int(sal)))
#     conn.commit()


# finally:
#     cur.close()
#     conn.close()
# fr.close()

# import mysql.connector
# from mysql.connector import Error
# fr = open("data.csv", "r")
# insert_data = fr.readlines()[1:]
# print(insert_data)
# for ele in insert_data:
#     print(type(ele))

# try:
#     conn = mysql.connector.connect(host = 'localhost', port = 3306,user = 'root', password='ajitesh',database = 'pythondata')

# except Error as e:
#     print("Error while connecting to MySQL", e)

# else:
#     cur = conn.cursor()
#     for record in insert_data:
#         name,loc,sal = record.split(",")
#         cur.execute("insert into task_1(name,location,salary) values(%s,%s,%s)",(name,loc,int(sal)))
#     conn.commit()


# finally:
#     cur.close()
#     conn.close()
import mysql.connector
from mysql.connector import Error

# Open the CSV file and read data
with open("data.csv", "r") as fr:
    insert_data = fr.readlines()[1:]  # Skip the header
    print("Data to insert:", insert_data)  # Print data for verification

# Check the type of each line
for ele in insert_data:
    print(type(ele))

try:
    # Establish the MySQL connection
    conn = mysql.connector.connect(
        host='localhost', 
        port=3306,
        user='root', 
        password='ajitesh',
        database='pythondata'
    )
except Error as e:
    print("Error while connecting to MySQL:", e)
else:
    cur = conn.cursor()
    for record in insert_data:
        # Strip whitespace and split by comma
        name, loc, sal = map(str.strip, record.split(","))
        cur.execute("INSERT INTO task_1 (name, location, salary) VALUES (%s, %s, %s)", (name, loc, int(sal)))
    conn.commit()
    print("Data inserted successfully.")
finally:
    # Ensure proper cleanup
    if cur:
        cur.close()
    if conn:
        conn.close()






