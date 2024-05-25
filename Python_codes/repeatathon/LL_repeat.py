class Node:
    def __init__(self,new_data):
        self.data = new_data
        self.next = None
    
n = Node(100)
print(n.data , n.next)

class Node1:
    def __init__(self,data):
        self.data =data
        self.next = None
n =  Node(200)
print(n.data , n.next)


class Node3:
    def __init__(self,new_data):
        self.data = new_data
        self.next = None

N1 = Node(100)
N2 = Node(200)
N3 = Node(300)
N4 = Node(400)

N1.next = N2
N2.next = N3
N3.next = N4

run =N1
while run !=  None:
    print(run.data)
    run = run.next

print("----------")
class Node3:
    def __init__(self,new_data):
        self.data = new_data
        self.next = None

n1 = Node(101)
n2 = Node(102)
n3 = Node(103)
n4 = Node(104)




n1.next = n2
n2.next = n3
n3.next = n4

run = n1
while run != None:
    print(run.data)
    run = run.next

print("---------")

class Node :
    def __init__(self,new_data):
        self.data = new_data
        self.next = None
    
class SinglyLinkedList: 
    def __init__(self):
        self.head_node = Node(None)

L = SinglyLinkedList()

L.__dict__

print("2")

class Node :
    def __init__(self,new_data):
        self.data = new_data
        self.next = None

class SinglyLinkedList:
    def __init__(self):
        self.head_node = Node(None)

L = SinglyLinkedList()
L.__dict__
print("3")
class Node:
    def __init__(self,data):
        self.data = data
        self.next = None

class SinglyLinkedList():
    def __init__(self):
        self.head_node = Node(None)

L = SinglyLinkedList()
print(L.__dict__)
print("4")

class Node : 
    def __init__(self,new_data):
        self.data = new_data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self):
        self.head_node = Node(None)
L  = SinglyLinkedList()

print(L.__dict__)