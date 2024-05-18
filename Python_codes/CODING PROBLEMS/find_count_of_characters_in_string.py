"""


"""
import sys 


def print_frequency_count_v1(s: str) -> None:
    if type(s) !=  str: 
        raise TypeError("s must be a string object !!")
    dict = {}

    for ch in s : 
        if ch in dict:
            dict[ch] = dict[ch]+1
        else :
            dict[ch] = 1
    print(dict)

def print_frequency_count_v2(s: str)-> None :
#  from every char from index = 0 to index = N-1
    # check if the charater appeared before :  by searching it to 0 to i-1 using index j
        # if appeared already then  we have already calculated frequency --- go to next character
    #  if not appeared character then we will calculate frequency by below step 
        #  


    if type(s) !=  str: 
        raise TypeError("s must be a string object !!")
    
    i = 0
#  here while...else loop used
    while i < len(s):
        j = 0
        while j < i :
            if s[j] == s[i]:
                break
            j += 1      
        else :# if break happened
            freq_cnt = 0
            k = i # index get kela
            while k < len(s):
                if s[k] == s[i]:
                    freq_cnt+=1
                k+=1
            print(f"COUNT OF {s[i]} : {freq_cnt}")
        i+=1
def main():
    s = input("Enter a string for the freq count :")
    print_frequency_count_v2(s)
    sys.exit(0)

main()