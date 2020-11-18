'''
Problem: https://open.kattis.com/problems/pieceofcake2
Author:  Bivash Pandey
'''
length, horCut, verCut = map(int, input().split())
firstVol = 4 * horCut * verCut
secondVol = 4 * verCut * (length - horCut)
thirdVol = 4 * (length - horCut) * (length - verCut)
fourthVol = 4 * (length - verCut) * horCut
print(max(max(firstVol, secondVol), max(thirdVol, fourthVol)))