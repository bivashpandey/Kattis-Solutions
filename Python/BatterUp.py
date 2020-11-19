'''
Problem: https://open.kattis.com/problems/batterup
Author:  Bivash Pandey
'''
n = int(input())
scores = input().split()
nonStrugglingScores, sumScores = 0.0, 0.0
for i in range(n):
    if int(scores[i])!= -1:
        sumScores += int(scores[i])
        nonStrugglingScores += 1
print(sumScores/nonStrugglingScores) 