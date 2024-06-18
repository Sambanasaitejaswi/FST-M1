def calculatesum(num):
    if num:
        return num + calculatesum(num - 1)
    else:
        return 0
res=calculatesum(10)
print(res)


'''for i in range(11):#when i give num in range function it throws num is not defined.
     sum+= i

calculatesum(11)
sum = 0
print(sum)'''
