def sum_of_elements_in_list(L:[int] , i:int):
    if i == len(L):
        return 0
    return L[i] + sum_of_elements_in_list(L,i+1) 

sum = sum_of_elements_in_list([10,20,30,2],0)

print("SUM :", sum)
