print("START CODE")

L = [10,20,30,40,50,5]

print(" Before  L : ",L)

# assumption :  all elements except last in a list are sorted
# Key == last element in array
key = L[len(L) - 1]
print("key :  ",key)

i = len(L) - 2
print("index i :  ",i)

# 
while i > -1 and L[i] > key :
    L[i+1] = L[i]
    i = i - 1

L[i+1] = key

print(" After  L : ",L)