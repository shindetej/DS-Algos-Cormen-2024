'''
@author : Tejas Shinde
@date : 21st April 2024
@motive : Implementation of merge procedure which is helper function in merge sort
'''

def merge(L: list[int] , p:int,q:int,r:int):
    '''
        @input :
            @L :  list of integers
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
    N2 = r-q   # length of L[q+1 ... r ] both included end

    # add data to L1
    L1 = []
    i = 0
    while i < N1 :
        L1.append(L[p+i])
        i = i+1

    # add data to L2
    L2 = []
    i = 0
    
    while i < N2:
        L2.append(L[q+1+i])
        i = i + 1
    print(L1)
    print(L2)

    k = 0
    i = 0
    j = 0
    
    while True :
        # print(f"i : {i}")
        # print(f"j : {j}")
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
            
#----------------------------------

def main():
    L= [200,23,144,
        10,20,30,40,
        15,17,25,35,37,45,55,75,
        400,12,3344]

    p = L.index(10)
    q = L.index(40)
    r = L.index(75)


    print(f"BEFORE MERGE :L[p:q+1] :{L[p:q+1]}")
    print(f"BEFORE MERGE :L[q+1:r+1] :{L[q+1:r+1]}")
    print(f"BEFORE MERGE :L : {L}")
    merge(L,p,q,r)
    print(f"AFTER MERGE :L[p:r+1] :{L[p:r+1]}")
    print(f"AFTER MERGE :L : {L}")

main()
