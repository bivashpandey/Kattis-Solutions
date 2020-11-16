'''
Problem: https://open.kattis.com/problems/qaly
Author:  Bivash Pandey
'''
numOfPeriods = int(input())
qaly = 0.0
for i in range(numOfPeriods):
    qualityOfLife, years = input().split(" ")
    qaly += float(qualityOfLife) * float(years)
print(f'{qaly:.3f}')