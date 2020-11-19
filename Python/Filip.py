'''
Problem: https://open.kattis.com/problems/filip
Author:  Bivash Pandey
'''
a, b = input().split()
revA, revB = int(a[::-1]), int(b[::-1])
print(revA if revA > revB else revB)
