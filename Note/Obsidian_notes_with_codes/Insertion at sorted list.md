### This is helper algorithm for [[Insertion Sort]]
- Precondition  :
	-  All elements in list except last element in ascending sorted order 
- Postcondition
	-  sorted list

```python
L = [10,20,30,40,50,5]
print(" Before  L : ",L)

key = L[len(L) - 1]
i = len(L) - 2

while i > -1 and L[i] > key :
    L[i+1] = L[i]
    i = i - 1

L[i+1] = key

print(" After  L : ",L)
```