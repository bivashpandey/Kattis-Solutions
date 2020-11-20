'''
Problem: https://open.kattis.com/problems/hissingmicrophone
Author:  Bivash Pandey
'''
word = input()
ans = "no hiss"
for i in range(len(word)-1):
    if word[i] == 's' and word[i+1] == 's':
        ans = "hiss"
        break
print(ans)