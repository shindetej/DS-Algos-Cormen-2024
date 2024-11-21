
L = [10,30,20,5,40,35]

print(" Before  List : ",L)

n = len(L)

for i in range(1,n):
    key = L[i]
    j = i-1
    while j > -1 and L[j] > key :
        L[j+1] = L[j]
        # print(f" \t\twhile j : {j} > -1 and {L[j]} > key ({key}) , updated list :{L}")

        j-=1
   
    L[j+1] = key

print(" After  List : ",L)