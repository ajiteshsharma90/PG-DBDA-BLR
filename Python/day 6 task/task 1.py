"""
1) Write a NumPy program to read a CSV data file and store records in an array.

"""

import numpy as np

with open("data.csv", "w") as f1:
    f1.write("1,2,3\n")
    f1.write("4,5,6\n")
    f1.write("7,8,9\n")

f1 = np.loadtxt("data.csv", delimiter=",")
print(f1)
