'''
Problem: https://open.kattis.com/problems/pot
Author:  Bivash Pandey
'''
n = int(input())
sum = 0
for i in range(n):
    num = int(input())
    sum += (num//10) ** (num%10)
print(sum)

