"""Task6:-
-------
Write a Python program to sort a tuple by its float element.
Sample data: 
  [('item1', '12.20'), ('item2', '15.10'), ('item3', '24.5')]
Expected Output: 
  [('item3', '24.5'), ('item2', '15.10'), ('item1', '12.20')]"""

data=[('item1', '12.20'), ('item2', '15.10'), ('item3', '24.5')]

data.sort(key = lambda fl: float(fl[-1]),reverse=True)
print(data)

data.sort(key = lambda f: float(f[-1]),reverse=True)