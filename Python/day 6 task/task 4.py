"""
4) Write a Pandas program to read a dataset from diamonds.csv(prepare yourself)
a)DataFrame and modify the default columns values and print the first 6 rows
b)calculate the mean of each numeric column of diamonds DataFrame.
c)calculate count, minimum, maximum price for each cut of diamonds DataFrame
d)print a concise summary of diamonds DataFrame.
e)count the duplicate rows of diamonds DataFrame.
"""

import pandas as pd
data1 = {
    'carat': [0.23, 0.21, 0.23, 0.26, 0.30, 0.21, 0.23, 0.25],
    'cut': ['Ideal', 'Premium', 'Good', 'Ideal', 'Fair', 'Doom', 'iron', 'man'],
    'color': ['E', 'E', 'G', 'G', 'I', 'R', 'Y', 'w'],
    'clarity': ['SI1', 'SI1', 'VS2', 'VS1', 'I1', 'ST1', 'SD3', 'DF5'],
    'depth': [61.5, 59.8, 56.9, 62.4, 61.2, 25.2, 52.4, 25.1],
    'table': [55, 61, 58, 59, 60, 52, 45, 85],
    'price': [326, 327, 335, 336, 345, 258, 456, 654],
    'x': [3.95, 3.89, 3.94, 4.07, 4.18, 2.5, 4.5, 6.5],
    'y': [3.98, 3.84, 3.95, 4.05, 4.16, 4.2, 3.6, 4.5],
    'z': [2.43, 2.31, 2.41, 2.52, 2.50, 2.98, 2.84, 2.95]
}

df1 = pd.DataFrame(data1)
df1.to_csv('data1.csv', index = False)
print(df1)
print("-------------------------------------")
df1 = pd.read_csv('data1.csv')

df1.columns = ['Carat', 'Cut', 'Color', 'Clarity', 'Depth', 'Table', 'Price', 'X', 'Y', 'Z']
print(df1.head(6))
print("-------------------------------------")

mean_value1 = df1[['Price', 'X', 'Y', 'Z']].mean()
print(mean_value1)
print("-------------------------------------")

cut1 = df1.groupby('cut')['Price'].agg(['count', 'min','max'])
print(cut1)
print("-------------------------------------")

print(df1.info())
print("-------------------------------------")


dupl = df1.duplicated().sum()
print(dupl)
















data = {
    'carat': [0.23, 0.21, 0.23, 0.26, 0.30, 0.21, 0.23, 0.25],
    'cut': ['Ideal', 'Premium', 'Good', 'Ideal', 'Fair', 'Doom', 'iron', 'man'],
    'color': ['E', 'E', 'G', 'G', 'I', 'R', 'Y', 'w'],
    'clarity': ['SI1', 'SI1', 'VS2', 'VS1', 'I1', 'ST1', 'SD3', 'DF5'],
    'depth': [61.5, 59.8, 56.9, 62.4, 61.2, 25.2, 52.4, 25.1],
    'table': [55, 61, 58, 59, 60, 52, 45, 85],
    'price': [326, 327, 335, 336, 345, 258, 456, 654],
    'x': [3.95, 3.89, 3.94, 4.07, 4.18, 2.5, 4.5, 6.5],
    'y': [3.98, 3.84, 3.95, 4.05, 4.16, 4.2, 3.6, 4.5],
    'z': [2.43, 2.31, 2.41, 2.52, 2.50, 2.98, 2.84, 2.95]
}

df = pd.DataFrame(data)
df.to_csv('diamonds.csv', index=False)
print(df)
print("-------------------------------------")
df = pd.read_csv('diamonds.csv')

df.columns = ['Carat', 'Cut', 'Color', 'Clarity', 'Depth', 'Table', 'Price', 'X', 'Y', 'Z']
print("First 6 rows after modifying column names:")
print(df.head(6))
print("-------------------------------------")

mean_value = df['Price'].mean()
print("\n mean of data price")
print(mean_value)
print("-------------------------------------")

cut_status = df.groupby('Cut')['Price'].agg(['count', 'min', 'max'])
print("\n cut of the data farme")
print(cut_status)
print("-------------------------------------")

print(df.info())
print("-------------------------------------")

duplicate = df.duplicated().sum()
print(duplicate)
print("-------------------------------------")
