str1 = input()
str2 = input()
s1 = str2[:len(str2)//2]
s2 = str2[len(str2)//2:]
print("Yes" if s2+s1==str1 else "No")