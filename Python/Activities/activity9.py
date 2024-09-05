list1 = [11, 20, 30, 41, 22, 33, 77]
list2 = [10, 21, 24, 35, 36, 11, 66]
thirdlist = []

for i in list1:
    if(i%2!=0):
        thirdlist.append(i)

for j in list2:
    if(j%2==0):
        thirdlist.append(j)

print("Thirdlist is:" + str(thirdlist))

