String = input()
count = 0
unique = []
for i in String:
    if i not in unique:
        unique.append(i)
    else:
        if(len(unique)>count):
            count = len(unique)
            unique.clear()
            unique.append(i)
print(count)