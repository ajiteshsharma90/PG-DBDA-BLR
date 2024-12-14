"""
Task7:-
-------
Write a Python program to count the elements in a list until an element is a tuple.

Sample input : list = [10, 20, 30, (40,50), 60]

Sample output = 3
"""
list = [10, 20, 30, (40,50), 60]
count = 0
for elem in list:
    if type(elem) != tuple:
        count += 1
    else:
        break
print(count)


# for ele in list:
#     if type(ele) != tuple:
#         count = count +1
#     else:
#         break

# print(count)