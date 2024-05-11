"""
@Author : Tejas Shinde
@date : 11th may 2024
@aim : to implement quick sort algorithm
"""

import sys

def get_list(N:int)->list[int]:
    """
    @input  :
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
        @L :  list of integers
        @msg:  string message
    @output : 
        Displays @msg along with list on the standard output devcice 
    """
    print(msg)
    for i in range(len(L)):
        print(f"L[{i}] : {L[i]}")

def partition(L:list[int],p:int ,r:int)-> int:
    """
    @Input :  
        @L :   non-empty list of integers
        @p :   integer index in L
        @r :   integer index in L

    @Output : index q satisfying postcondition
    @precondition: 
        1) 0 <= p < r < len(L)  
    @postcondition:
        1) Element L[r] moved to index q between [p,r]
        2) Rest of elements arranged such that
            i. all elements from L[p...q-1] are less than or equal to L[q]
           ii. all elements from L[q+1...r] are greater than L[q]
    """
    i =  p-1
    pivot = L[r]
    for j in range(p,r): # itereate from p to r-1
        if L[j] <= pivot:
            i=i+1
            L[i],L[j] = L[j],L[i]
    L[i+1],L[r] = L[r],L[i+1]
    return (i+1) #index of pivot element after setting


def quick_sort(L: list[int],p : int,r : int):
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
        q = partition(L,p,r) 
        quick_sort(L,p,q-1)
        quick_sort(L,q+1,r)
    # print(f"List  : {L} , p {p} , r {r}")
    

def main():
    N =  int(input("Enter the size of list : "))
    if N < 2:
        print("Bad Size")
        sys.exit(-1)

    L= get_list(N)

    show_list(L,f"********** Before sorting ***********")
    quick_sort(L,0,len(L)-1)
    show_list(L,f"********** After sorting ***********")
    sys.exit(0)
    

main()
