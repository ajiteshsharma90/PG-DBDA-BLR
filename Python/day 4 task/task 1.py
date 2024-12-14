"""
Task1:-
-------
depts={
       101 : "sales",
       102 : "purch",
       103 : "accts",
       104 : "finan"
      }
emps = {
         "arun" : "blr-101-alpha",
         "ravi" : "chn-104-beta",
         "hari" : "hyd-102-delta",
         "manu" : "del-103-omega"
       }

Expected:-
-----------
Enter the emp name : ravi
      location     : blr
      dept id      : 104
      dept name    : finan
      proj name    : beta

Enter the emp name : john
Error - Invalid emp name
"""
depts={
       101 : "sales",
       102 : "purch",
       103 : "accts",
       104 : "finan"
      }
emps = {
         "arun" : "blr-101-alpha",
         "ravi" : "chn-104-beta",
         "hari" : "hyd-102-delta",
         "manu" : "del-103-omega"
       }

empn = input("Enter the employee name: ")
if empn in emps:
     location,dept_id,project = emps[empn].split("-")
     dept_d = depts[int(dept_id)]
     print("laction = %s\n" %location)
     print("department = %s\n" %dept_id)
     print("project = %s\n" %project)
     print("dept name: %s\n" %dept_d)
else:
     print("not available")
