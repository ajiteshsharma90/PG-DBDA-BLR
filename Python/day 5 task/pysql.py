# Create a CSV file and write employee data to it
f1 = open("data.csv", "w")  # Open file in write mode
f1.write("name,loc,salary\n")  # Write headers
f1.write("arun,blr,25000\n")   # Write data for arun
f1.write("hari,chn,45000\n")   # Write data for hari
f1.write("john,mum,30000\n")   # Write data for john
f1.write("manu,hyd,35000")     # Write data for manu
f1.close()  # Close the file

import mysql.connector
from mysql.connector import Error
import csv
try:
    conn = mysql.connector.connect(
        host='localhost',
        user='root',
        password='password',
        database='employee_db'
        )

    if conn.is_connected():
        print("Connection is created with MySql")

        with open('data.csv', 'r') as file:
            csv_read = csv.reader(file)

            cur = conn.cursor()
        for row in csv.reader:
            name,loc,salary = row
            cur.execute('''INSERT INTO employee(name,loc,salary) VALUE (%s,%s,%s)''', (name, loc, int(salary)))
        conn.commit()
        print("data inserted")
except Error as e:
    print("connection error", e)

finally:
    if conn.is_connected():
        cur.close()
        conn.close()
        print("slq connection close")
try:
    connection = mysql.connector.connect(
        host='localhost',
        user='root',
        password='password',
        database='employee_db'
    )
    if conn.is_connected():
            cursor = conn.cursor()
            cursor.execute("SELECT * FROM employees")

            row = cur.fetchall()
            for row in row:
                print(row)
except Error as e:
    print("Error while fetching data", e)

finally:
    if conn.is_connected():
        cursor.close()
        conn.close()

try:
    connection = mysql.connector.connect(
        host='localhost',
        user='root',
        password='password',
        database='employee_db'
    )
