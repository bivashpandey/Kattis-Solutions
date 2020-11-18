'''
Problem: https://open.kattis.com/problems/everywhere
Author:  Bivash Pandey
'''
t = int(input())
for i in range(t):
    cities = set()
    numOfCities = int(input())
    for j in range(numOfCities):
        cities.add(input())
    print(len(cities))