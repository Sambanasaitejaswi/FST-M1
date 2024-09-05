'''fruit_shop={"apple":10,"Mango":80,"Grapes":40,"Banana":20}
user=input("Enter a fruit name :").lower()
if(user in fruit_shop):
    print("Yes, this is available")
else:
    print("No, this is not available")'''

# Calculate the sum of numbers
# using recursion
def calculateSum(num):
    if num:
        return num + calculateSum(num-1)
    else:
        return 0

res = calculateSum(10)

# Print result
print(res)
