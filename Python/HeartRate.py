'''
Problem: https://open.kattis.com/problems/heartrate
Author:  Bivash Pandey
'''
n = int(input())
for i in range(n):
    beats, time = map(float, input().split())
    print(f'{(60*beats/time-60/time):.4f} {(60*beats/time):.4f} {(60*beats/time + 60/time):.4f}')