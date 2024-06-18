
def calculate_sum(numbers):
    sum = 0
    for number in numbers:
        sum+=number
    return sum

numlist = [10, 40, 60, 90]
#temp = 0
res = calculate_sum(numlist)
print(str(res))
