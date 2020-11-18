'''
Problem: https://open.kattis.com/problems/planina
Author:  Bivash Pandey
'''
n = int(input())
sum = 2
for i in range(n):
    sum += sum - 1
print(sum * sum)