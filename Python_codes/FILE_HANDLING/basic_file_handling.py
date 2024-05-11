"""
@Session : 09 
@date : 11 May 2024
@motive : to implement basic file handling
"""

import sys

def main():
    # F:\work-2024\DS-Algos-Cormen-2024\Python_codes\FILE_HANDLING\abc.txt
    file_path = "abc.txt"
    try : 
        f_handle = open(file_path,"w")
        L =  [500,200,100,35,600]
        for x in L:
            print(x,file=f_handle)

        f_handle.close()
    except :
        exc_name , exc_data ,exc_tb = sys.exc_info()
        print(exc_name,exc_data)
        sys.exit(-1)
    try : 
        f_handle = open(file_path,"r")
        
        for line in f_handle:
            line = line.strip()
            print(line)
        f_handle.close()
    except :
        exc_name , exc_data ,exc_tb = sys.exc_info()
        print(exc_name,exc_data)
        sys.exit(-1)

main()

"""
try : 
    f_handle = open("f1","r")
except :
    exc_name , exc_data ,exc_tb = sys.exc_info()

"""