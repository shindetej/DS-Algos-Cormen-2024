"""
@Author : Tejas Shinde
@date : 27th April 2024
@motive : to implement and test partition algorithm which is helper function in quick sort algorithm
"""

import sys

def partition(L:[int],p:int ,r:int)-> int:
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


def main():
    L = [  100,200,300,
        25,60,63,23,40,45,70,30,55,50,
        1000,456,-122
    ]
    p = L.index(25)
    r = L.index(50)

    q =  partition(L,p,r)

    print(f"L[{q}] : {L[q]}")
    print(f'L[{p}:{q}] : {L[p:q]}')
    print(f"L[{q+1}:{r+1}] : {L[q+1 : r+1]}")
    print(f"{L[p:r+1]}")

    sys.exit(0)

main()