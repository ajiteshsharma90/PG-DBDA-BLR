""" Task4:
=======
 Define a function overlapping () that takes two lists and returns True
 if they have at least one member in common, False otherwise.
"""
def overlapping(l1,l2):
    for elem in l1:
        if elem in l2:
            return True
    return False
l1 = [1,2,3,4,5]
l2 = [3,4,5,6,7]
res = overlapping(l1, l2)
print(res)

