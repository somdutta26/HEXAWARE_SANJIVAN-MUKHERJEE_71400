str=input("Enter the string:")
print("reversed: ",end='')
rev=str[::-1]
print(rev)
if rev==str:
    print("It is a Palindrome.")
else:
    print("It is not a Palindrome.")