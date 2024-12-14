'''
Task5:-
=======
Given:-
-------
nums = [1,2,3,4,5]

Problem:-
---------
>> square each number - INPLACE OPERATION

Expected:-
----------
print(nums) # [1,4,9,16,25]
'''
nums = [1,2,3,4,5]
print(nums)

nums =[nums[index]**2 for index in range(len(nums))]

print(nums)