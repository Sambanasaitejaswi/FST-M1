import pandas as pd

# Create a Dictionary that will hold our data
data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}
# Create a DataFrame using that data
dataframe = pd.DataFrame(data)

# write to the csv file
# dataframe.to_csv(".../inputs/creds.csv")

"""
 Write the DataFrame to a CSV file
 To avoid writing the index numbers to the file as well
 the index property is set to false
"""
dataframe.to_csv("sample.csv", index=True)

# read csv file
creds =pd.read_csv("sample.csv")
print(creds)
# print only the usernames in the coloumn
print(creds["Usernames"])
# print username and password of 2nd row
print("usernames:", creds["Usernames"][1],"passwords:",creds["Passwords"][1])

print(creds.sort_values("Usernames",ascending=True))

print(creds.sort_values("Passwords",ascending=False))
