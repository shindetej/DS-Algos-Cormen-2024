import sys


def main():
    list = [4,5,2,3,6]
    while list:
         print(f"PICK of from list as priority on min first {list}: ",pickWithMin(list))
    
    print("\n******************* ")
    list = [4,5,2,3,6]
    while list:
        print(f"PICK of from list as priority on max first{list}: ",pickWithMax(list)) 
    sys.exit(0)


def get_min(list)->int:
    n = list[0]
    for i in list :
           if i < n : 
                n =  i
    return n

def get_max(list)->int:
    n = list[0]
    for i in list :
           if i > n : 
                n =  i
    return n

def pickWithMin(list):
    num = get_min(list)
    list.remove(num)
    return num

def pickWithMax(list):
    num = get_max(list)
    list.remove(num)
    return num

main()