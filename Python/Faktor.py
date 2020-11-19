'''
Problem: https://open.kattis.com/problems/faktor
Author:  Bivash Pandey
'''
noOfArticle, impact = map(int, input().split())
print(noOfArticle * (impact - 1) + 1)