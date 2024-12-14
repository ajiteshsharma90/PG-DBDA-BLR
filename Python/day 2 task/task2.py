"""
Task2:-
=======  
sent = "today is monday workday weekday"

# using .count method display no of times "day" is repeated 
# using .index method get the index all the "day"

Expected:-
===========
Total no time "day" is repeated is = 4

first occurance index = 2
second occurance index = 12
third occurance index  = 20
fourth occurace index  = 28
"""
sent = "today is monday workday weekday"
count = sent.count("day")
print(f'Total no time "day" is repeated is = {count}')

start = 0


start = sent.index("day" , start) 
print("first occurance index =",start)
start = start +1

start = sent.index("day" , start)
print("second occurance index =",start)
start = start +1


start = sent.index("day" , start) 
print("third occurance index =",start)
start = start +1


start = sent.index("day" , start)
print("fourth occurance index =",start) 



    

    




