```python
import sys

def get_list(N:int) -> list[int]:
    """
    @input :  
        @L : empty list
        @N : positive integer -> expected size of int
    @output :
        popuates newly created list with @N random number
    """
    from random import randint
    if type(N) != int :
        raise TypeError("N must be an int")
        
    if N <= 0 :
        raise ValueError("N must be positive")
        
    L = []
    starting_number = 0
    ending_number = 1001

    for i in range(N):
        L.append(randint(starting_number,ending_number))
    return L

  

def show_list(L: list[int],msg : str)->None:
    """
    @input :
        @L :  list of integers
        @msg:  string message
    @output :
        Displays @msg along with list on the standard output devcice
    """
    print(msg)
    for i in range(len(L)):
        print(f'L[{i}] :  {L[i]}')

def insert_at_sorting_position(L :list[int],N :int)-> None:

    """
    @input :
        @L :  non-empty list of integers
        @N :  length but not necesary length above list
    @output :  
        None
    @Precondition :
        1) N >= 2
        2) L[0] to L[N-2] are sorted order
        3) value of L[N-1] might be preventing from L[0] to L[N-1]
            from being sorted
    @postcondition :
        1) L[0] to L[N-1] is sorted

    """
    if type(L) != list or type(N) != int :
        raise TypeError("Bad type for input data")
    if N < 2 :
        raise ValueError("N must be greater than or equal to 2")
    key = L[N-1]
    i = N-2

    while i > -1 and L[i] > key:
        L[i+1] =  L[i]
        i = i - 1
        
    L[i+1] = key

  

def insertion_sort(L: list[int]) -> None:

    """
    @input :
        L is non-empty list of integers with no order
    @output :
        sorted list L

    """

    if type(L) != list:
        raise ValueError("Bad input data")
    if len(L) == 0 or len(L) == 1:
        return None

  

    N = len(L)
    for i in range(2,N+1): # iterates from 2 to N
        insert_at_sorting_position(L,i)


  
  

def main():

     N = int(input("Enter the size of the list:(greater than 2):"))
     if N < 2:
        print("Bad size")
        sys.exit(-1)

     L = get_list(N)
     
     show_list(L, "Before sort:")
     
     insertion_sort(L)
     
     show_list(L, "After sort:")


main()
```