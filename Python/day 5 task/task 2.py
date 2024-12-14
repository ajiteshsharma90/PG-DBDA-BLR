""" Task2:
=======
 From the DATABASE TABLE, READ THE TABLE contents and
 store them in a text file"""
import mysql.connector

# Connect to the MySQL database
conn = mysql.connector.connect(
    host='localhost',
    port=3306,
    user='root',
    password='ajitesh',
    database='pythondata'
)

cur = conn.cursor()

# Execute a query to retrieve data from the 'employees' table
cur.execute("SELECT * FROM employees")

# Fetch all rows from the executed query
rows = cur.fetchall()

# Write the results to a text file
with open("employees.txt", "w") as f:
    # Write a header
    f.write("ID,Name,Location,Salary\n")
    
    # Write each row to the file
    for row in rows:
        f.write(",".join(map(str, row)) + "\n")

# Close the cursor and connection
cur.close()
conn.close()
