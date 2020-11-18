'''
Problem: https://open.kattis.com/problems/nastyhacks
Author:  Bivash Pandey
'''
n = int(input())
for i in range(n):
    revWithoutAd, revWithAd, costOfAd = map(int, input().split())
    if revWithoutAd > (revWithAd - costOfAd):
        print("do not advertise")
    elif revWithoutAd < (revWithAd - costOfAd):
        print("advertise")
    else:
        print("does not matter")