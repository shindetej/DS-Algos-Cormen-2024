import sys
def print_list(L : [int] , i : int):
    if i == len(L):
        return
    
    print(f"\tL[{i}] : {L[i]}")
    print_list(L,i+1)

def print_list_reverse(L , i):
    if i == len(L):
        return None
    
    print_list_reverse(L,i+1)
    print(f"\tL[{i}] : {L[i]}")

# call function
def main() :
    L = [10,20,30,40,50]
    print("\n------ Print Inorder --------")
    print_list(L,0)
    print("\n------ Print Reverse --------")
    print_list_reverse(L,0)
    sys.exit(0)
main()
