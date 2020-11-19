'''
Problem: https://open.kattis.com/problems/grassseed
Author:  Bivash Pandey
'''
perCost = float(input())
totalArea = 0.0
noOfLawn = int(input())
for i in range(noOfLawn):
    width, length = map(float, input().split())
    totalArea += width * length
print(f'{totalArea*perCost:.7f}')