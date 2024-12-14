"""Task8:-
-------
Write a Python program to compute element-wise sum of given tuples, using
“zip()” function

Original tuples:
(1, 2, 3, 4)
(3, 5, 2, 1)
(2, 2, 3, 1)

Element-wise sum of the said tuples:
(6, 9, 8, 6)"""

tuple1 = (1, 2, 3, 4)
tuple2 = (3, 5, 2, 1)
tuple3 = (2, 2, 3, 1)

# elem = tuple(map(sum, zip(tuple1, tuple2, tuple3)))
# print(elem)
t =()
for elem in zip(tuple1, tuple2, tuple3):
    t = t + (sum(elem),)
print(t)