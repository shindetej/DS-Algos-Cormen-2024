## Insert at position in sorted array
{10,20,30,40,50,15}
Assumption : Left side array is always sorted 
if array A of size N 
then :
    1. A[0] to A[N-2] is sorted
    2. A[N-1] element not at sorted position
- Take A[N-1] value in variable ***key***
Algorithm :
-  While[ I >= 0 And  Value At A[I] > ***key*** ]  Where I is Index From N-2 To 0  
    1. move  A[i+1] = A[i]
    2. i = i-1

-  After Break of while loop add ***key*** to to A[i+1] position 

## Using Above Logic Implement Insertion Sort
Assumption :
1. Single element always sorted 
2. Left side array is always sorted 

A[] = {40,50,30,10,20,15}
ITERATE FROM INDEX 1 TO N-1 : ***for i in range(1,n):***

- **ITERATION 1 :**  
    1. *SET* Key and jth index for condition : i=1  : 
        - key is A[i] = 50  ,j = i-1 i.e j = 0
    2. [ 40 ] is sorted  | key 50 
    3. **WHILE**  *j > -1 (TRUE) and A[j] i.e A[0] > key  --> 40 > 50 --> False --> Out of while loop*
    4. **SET** Key at A[j+1] --> A[1] = 50


- **ITERATION 2 :**  
    1. **SET** Key and jth index for condition : i=2  : 
        - key is A[i] = 30  ,j = i-1 i.e j = 1
    2. [ 40,50 ] is sorted  | key 50 
    3. **WHILE**  j > -1 (TRUE) and A[j] i.e A[1] > key  --> 50 > 30 --> True --> In loop --> 
        - **SET** A[j+1] =  A[j] i.e A[2] = A[1] i.e A[2] = 50
        - **DECREMENT** j  --> j = 0 
    3. **WHILE**  j > -1 (TRUE) and A[j] i.e A[0] > key  --> 40 > 30 --> True --> In loop --> 
        - **SET** A[j+1] =  A[j] i.e A[1] = A[0] i.e A[1] = 40
        - **DECREMENT** j  --> j = -1
    3. **WHILE**  j > -1 (FALSE) --> Out of while loop*

    4. **SET** Key at A[j+1]  --> A[0] =  30

In similar manner ITERATION TILL N-1 CAN GO each time we get sorted array till j-1

```py 
for i in range(1,n):
    key = L[i]
    j = i-1
    print(f"key : {key} ,i {i}, j : {j}")
    while j > -1 and L[j] > key :
        L[j+1] = L[j]
        j-=1
    L[j+1] = key
```






