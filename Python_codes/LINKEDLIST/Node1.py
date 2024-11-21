class Node:
    def __init__(self):
        print("Inside node : __init__()")
        print("Node.__init__():id(self): ",id(self))
    
N = Node() # () is call operator
print("type(N) :",type(N),"id(N) :", id(N))