"""
2) Write a NumPy program to convert a PIL Image into a NumPy array. Also convert
   a NumPy array to an image. Display the image.

Sample Output:
[[[255 255 255 0]
.......
[255 255 255 0]]]
"""


import pandas as pd

# Sample DataFrames
df1 = pd.DataFrame({
    'ID': [1, 2],
    'Name': ['Alice', 'Bob']
})

df2 = pd.DataFrame({
    'ID': [3, 4],
    'Name': ['Charlie', 'David']
})

# Concatenate vertically (stack rows)
result = pd.concat([df1, df2], axis=0, ignore_index=True)

print(result)



