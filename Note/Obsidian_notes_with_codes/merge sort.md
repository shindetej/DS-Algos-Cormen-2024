### Merge sort is result of what we learnt earlier two concepts
-  [[Recursion]] 
- Merge algorithm 

```python
"""
@aim : to implement merge sort algorithm
"""

  

import sys
def get_list(N:int)->list[int]:

    """
    @input  :
        @L : empty list
        @N : positive integer -> expected size of int
    @output : populated list of integer with random numbers
    """

    from random import randint
    if type(N) != int :
        raise TypeError("N must be an int")

    if N <= 0 :
        raise ValueError("N must be positive")
    start_num = 0
    end_num = 1001
    L = []
    for i in range(N):
        L.append(randint(start_num,end_num))
    return L

  

def show_list(L:list[int],msg:str)-> None :

    """
    @input :
        @L :  list of integers
        @msg:  string message
    @output :
        Displays @msg along with list on the standard output devcice
    """

    print(msg)
    for i in range(len(L)):
        print(f"L[{i}] : {L[i]}")

  

def merge_proc(L : list[int],p: int,q: int,r: int):

    '''
        @input :
            @L :  list of integers
            @p : index in L
            @q : index in L
            @r : index in L

        @Output :
            None

        @Postcondition :
            L[p...r] is sorted

        @precondition :  
            0 <= p <= q < r < len(L)  

    '''
    N1 = q-p+1 # length of L[p...q] both included
    N2 = r-q   # length of L[q+1 ... r ] both included end

    # add data to L1

    L1 = []
    i = 0

    while i < N1 :
        L1.append(L[p+i])
        i = i+1
    L2 = []
    i = 0

    while i < N2:
        L2.append(L[q+1+i])
        i = i + 1

    k = 0
    i = 0
    j = 0

    while True :
        if L1[i] <= L2[j]:
            L[p+k] = L1[i]
            k = k+1
            i = i+1
            if i == N1 :
                while j < N2 :
                    L[p+k] = L2[j]
                    k=k+1
                    j=j+1
                break

        else: # L1[i] > L2[j]:
            L[p+k] = L2[j]
            k = k+1
            j = j+1


            if j == N2 :
                while i < N1 :
                    L[p+k] = L1[i]
                    k=k+1
                    i=i+1
                break

  
  

def merge_sort(L: list[int],p : int,r : int):

    """

    @input :
        @L : non empty list of integers
        @p : index to L
        @r : index to L
    @precondition :
        0 <= p <= r < len(L)

    @postcondttion :
        L is sorted list in increasing order

    """

    if p < r :
        q = (p+r) // 2 # floor division //  , true division
        merge_sort(L,p,q)
        merge_sort(L,q+1,r)
        merge_proc(L,p,q,r)

    print(f"List  : {L} , p {p} , r {r}")

  

def main():

    N =  int(input("Enter the size of list : "))
    if N < 2:
        print("Bad Size")
        sys.exit(-1)

    L= get_list(N)

    show_list(L,f"********** Before sorting ***********")
    merge_sort(L,0,len(L)-1)
    show_list(L,f"********** After sorting ***********")
    sys.exit(0)

main()
```