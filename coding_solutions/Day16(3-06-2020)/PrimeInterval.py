l = int(input("Enter start point: "))  
u = int(input("Enter end point: "))  
  
for num in range(l,u + 1):  
   if num > 1:  
       for i in range(2,num):  
           if (num % i) == 0:  
               break  
       else:
           print(num)
