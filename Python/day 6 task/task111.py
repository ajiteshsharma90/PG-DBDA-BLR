# # import numpy as np
# # with open('data1.csv', 'w') as f1:
# #     f1.write('1,2,3\n')
# #     f1.write('4,5,6\n')
# #     f1.write('7,8,9\n')

# # f1 = np.loadtxt("data1.csv", delimiter = ',')
# # print(f1)

# # import pandas as pd
# # import numpy as np

# # data = {'Name': ['Alice', 'Bob', 'Charlie'],
# #         'Age': [25, 30, 35],
# #         'Height': [5.5, 6.0, 5.8]
# #         }

# # df = pd.DataFrame(data)
# # arr = np.array(df)
# # print(df)
# # print(arr)
# # headers = df.head(2)
# # # print(headers)

# # def test(key, value):
# #     return dict(zip(key, value))

# # l1 = ['a', 'b', 'c', 'd', 'e', 'f']
# # l2 = [1, 2, 3, 4, 5]

# # print(l1)

# # print(l2)

# # print(test(l1,l2))

# # def test(dict, val):
# #     return list(key for key, value in dict.items() if value == val)
# # students = {
# #     'Theodore': 19,
# #     'Roxanne': 20,
# #     'Mathew': 21,
# #     'Betty': 20
# # }
# # print(students)

# # print(test(students, 20))

# # Define a function 'test' that takes a list of dictionaries 'dictt' and a tuple of 'keys' as arguments.
# def test(dictt, keys):
#     # Use a list comprehension to extract values from the dictionaries for the specified 'keys' and create a list of lists.
#     return [list(d[k] for k in keys) for d in dictt]

# # Create a list of dictionaries 'students' where each dictionary represents student information.
# students = [
#     {'student_id': 1, 'name': 'Jean Castro', 'class': 'V'},
#     {'student_id': 2, 'name': 'Lula Powell', 'class': 'V'},
#     {'student_id': 3, 'name': 'Brian Howell', 'class': 'VI'},
#     {'student_id': 4, 'name': 'Lynne Foster', 'class': 'VI'},
#     {'student_id': 5, 'name': 'Zachary Simon', 'class': 'VII'}
# ]

# # Print a message indicating the start of the code section and display the original list of dictionaries.
# print("\nOriginal Dictionary:")
# print(students)

# # Print a message indicating the purpose and demonstrate the 'test' function's usage for different sets of 'keys'.
# print("\nExtract values from the said dictionaries and create a list of lists using those values:")
# print("\n", test(students, ('student_id', 'name', 'class')))
# print("\n", test(students, ('student_id', 'name')))
# print("\n", test(students, ('name', 'class')))


with open('read.txt', 'w') as f1:
    f1.write('have some fun\n')
    f1.write('no fun\n')

with open('read.txt', 'r') as f1:
    file = f1.read()
    print(file)

with open('read.txt', 'a') as f1:
    f1.write('first Study hard\n')
    f1.write('then have fun')

with open('read.txt', 'r') as f1:
    file = f1.read()
    print(file)
    print('--------------------------------')

with open('read.txt', 'r') as f1:
    while True:
        file1 = f1.readline()
        print(file1)
        if not file1:
            break
        print(file1.strip())