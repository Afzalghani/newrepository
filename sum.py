import numpy as np

def matrix (arr):
    n=len(arr)
    sum==0
    for i in range(0, n):
        if(i+i!=n-i-1):
            sum+=mat[i][i]
            sum+=mat[i][n-i-1]

    return sum
        # principal += mat[i][i]
        # secondary += mat[i][n - i - 1]



n=int(input("Enter the number row"))
matrix = []

for i in range(n):
   
   row = []
   for j in range(n):
     
      element = int(input())
 
      row.append(element)

   matrix.append(row)
myarray=np.array(matrix)
print(myarray)
print(matrix(myarray))
