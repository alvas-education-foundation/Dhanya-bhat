def isPalindrome(s): 
    return s == s[::-1] 
s = str(input("Enter the string:"))
ans = isPalindrome(s) 
  
if ans: 
    print("Yes") 
else: 
    print("No")
