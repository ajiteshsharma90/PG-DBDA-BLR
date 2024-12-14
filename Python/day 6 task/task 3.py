"""
3) Write a NumPy program to convert Pandas dataframe to Numpy array with
headers.
"""

import pandas as pd
import numpy as np
data = {
    'Name': ['Alice', 'Bob', 'Charlie'],
    'Age': [25, 30, 35],
    'Height': [5.5, 6.0, 5.8]
    }
df = pd.DataFrame(data)
array_header = np.array(df)
print("Data Frame: ")
print(df)
print("\n numpy array: ")
print(array_header)
headers = df.head(1)
print("\n header : " )
print(headers)