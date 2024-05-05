"""
Precondition :  List of integers and data need to search as input
Post condition :  return True if data is found
                                    : if L[i] == data     return True  as data found
search_data(List L,i, data)  :        : if i == len(L)      return False as data not found
                                    : else                return search_in_list(L,i+1,search_data)
"""                 

def search_in_list(L,i,search_data):
    print(f" function call to  : search_in_list(L,{i},{search_data})")
    if i == len(L):
        print("Data not found\n-------")
        return False
    if L[i] == search_data:
        print(f'Data {search_data} present in {L}\n---------')
        return True

    return 


print(f"Result : of search_in_list([20,30,12,33,40],5,0,80)  : {search_in_list([20,30,12,33,40],0,80)}")
print(f"Result : of search_in_list([20,30,12,33,40],5,0,12)  : {search_in_list([20,30,12,33,40],0,12)}")
print(f"Result : of search_in_list([20,30,12,33,40],5,0,40)  : {search_in_list([20,30,12,33,40],0,40)}")