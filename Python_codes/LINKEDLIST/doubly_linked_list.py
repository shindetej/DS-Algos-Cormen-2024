"""
@Author : Tejas Shinde
@Date : 26-05-2024
@Motive :  Doubly linked list
"""
from sys import exc_info
import sys
class Node : 
        def  __init__(self, new_data):
                self.data = new_data
                self.next =  None
                self.prev = None
"""
linked list is empty when no node with data
linked list not empty - atlease one node with data

"""          
        
class DLL1:
        def __init__(self):
                self.head_node = Node(None)


        def insert_at_start(self,new_data):
                new_node = Node(new_data)
                
                new_node.next = self.head_node.next
                new_node.prev = self.head_node
                if self.head_node.next is not None: # not empty linkedlist
                    self.head_node.next.prev = new_node  # head_node next node has prev assign it to new node
                self.head_node.next =  new_node

        def insert_at_end(self,new_data):
                new_node =  Node(new_data)  
                run =  self.head_node
                while run.next is not None:
                        run =  run.next
                new_node.prev = run
                run.next = new_node

        def  insert_after(self,existing_data,new_data):
                new_node = Node(new_data)

                run  = self.head_node.next
                while run is not None:
                        if existing_data == run.data:
                                break
                        run = run.next
                else:
                    raise ValueError(f'{existing_data} not found')

                new_node.next = run.next
                new_node.prev = run
                # CRUCIAL CONDITION : check while insert at end or after is is run.next None
                # case where data found at last node and next of it is None
                if run.next is not None:
                        run.next.prev = new_node
                run.next = new_node

        def insert_before(self,existing_data,new_data):
                new_node =  Node(new_data)

                run = self.head_node
                while run.next is not None:
                        if run.next.data == existing_data:
                            break
                        run = run.next  
                else:
                    # raise ValueError(f'{existing_data} not found')
                    print(f"{existing_data} not found") 
                
                new_node.next = run.next
                new_node.prev = run
                run.next.prev = new_node # no need to check if prev exist as data inserted before
                run.next = new_node

        def get_start(self):
                if self.head_node.next is None and self.head_node.prev is None:
                        raise ValueError("List is empty")
                return self.head_node.next.data
        
        
        def get_end(self):
                if self.head_node.next is None and self.head_node.prev is None:
                        raise ValueError("List is empty")
                
                run = self.head_node
                while run.next is not None:
                        run =run.next
                return run.data
        
        
        def pop_start(self):
                if self.head_node.next is  None and self.head_node.prev is None:
                        raise ValueError("List is empty")
                
                data =  self.head_node.next.data
                r_node = self.head_node.next

                if r_node.next is not None:
                        r_node.next.prev =  r_node.next
                r_node.prev.next= r_node.next
                del r_node
                return data
        
        def pop_end(self):
                if self.head_node.next is None and self.head_node.prev is None:
                        raise ValueError("List is empty")
                
                run = self.head_node.next
                while run.next is not None:
                        run = run.next
                run.prev.next =  None
                del run

        def remove_start(self):
                if self.head_node.next is None and self.head_node.prev is None:
                        raise ValueError("List is empty")
                
                r_node = self.head_node.next
                if r_node.next is not None:
                        r_node.next.prev = r_node.prev
                r_node.prev.next =  r_node.next
                del r_node

        def remove_end(self):
                if self.head_node.next is None and self.head_node.prev is None:
                        raise ValueError("List is empty")
                
                run  = self.head_node
                while run.next is not None:
                        run = run.next
                run.prev.next =  None
                del run

        
        def remove_data(self,r_data):
                run = self.head_node.next
                while run is not None:
                        if run.data ==  r_data:
                                break
                        run =  run.next
                else:
                        raise ValueError(f"{r_data} not found")
                run.prev.next = run.next
                if run.next is not None:
                        run.next.prev = run.prev
                del run


        def find(self,f_data):
                run =  self.head_node.next
                while run is not None:
                        if run.data == f_data:
                                break
                        run =  run.next
                else:
                        return False
                return True
        
        def length(self):
                cnt = 0
                run = self.head_node.next
                while run is not None:
                        cnt+=1
                        run = run.next
                return cnt
        
        
        def show(self,msg=None):
                if msg is not None:
                        print(msg)
                
                print("[START] <-> ",end='')

                run = self.head_node.next
                while run  is not None:
                        print(f"[{run.data}] <-> ",end='')
                        run =  run.next
                
                print("[ END ]")


def main():
        L = DLL1()
        L.insert_at_end(100)
        L.insert_at_end(200)
        L.insert_at_end(300)
        L.show("DOUBLY LINKED LIST insert at end")

        L.insert_at_start(50)
        L.insert_at_start(700)
        L.show("DOUBLY LINKED LIST insert at start")
        # L.insert_after(444,55)
        # L.insert_before(444,155)
        # L.show("DOUBLY LINKED LIST insert at start")
        L.insert_after(200,155)
        L.show("DOUBLY LINKED LIST insert after")
        L.insert_before(200,235)
        L.show("DOUBLY LINKED LIST insert before")
        L.insert_after(300,5)
        L.show("DOUBLY LINKED LIST insert after at start")
        L.insert_before(700,85)
        L.show("DOUBLY LINKED LIST insert before")

        try: 
           L.insert_before(-450, 1000)
        except: 
                exc_name, exc_data, _ = exc_info() 
                print(exc_name, exc_data)
        
        try: 
          data = L.get_start()   # SinglyLinkedList.get_start(L) 
        except: 
                exc_name, exc_data, _ = exc_info() 
                print(exc_name, exc_data)

                print(f'start_data:{data}')
                L.show("after get_start()") 

        try: 
         data = L.get_end()     # SinglyLinkedList.get_end(L)
        except: 
                exc_name, exc_data, _ = exc_info() 
                print(exc_name, exc_data)

                print(f'end_data:{data}')
                L.show("after get_end()") 

        try: 
                data = L.pop_start()   # SinglyLinkedList.pop_start(L)
        except: 
                exc_name, exc_data, _ = exc_info() 
                print(exc_name, exc_data)

                print(f'start_data:{data}')
                L.show('after pop_start()') 

        try: 
                data = L.pop_end()     # SinglyLinkedList.pop_end(L)
        except: 
                exc_name, exc_data, _ = exc_info() 
                print(exc_name, exc_data)
                print(f'end_data:{data}')
                L.show('after pop_end()') 

        try: 
                data = L.remove_start() 
        except: 
                exc_name, exc_data, _ = exc_info() 
                print(exc_name, exc_data)

                L.show('after remove_start()') 

        try: 
                data = L.remove_end()  
        except: 
                exc_name, exc_data, _ = exc_info() 
                print(exc_name, exc_data)

                L.show('after remove_end()') 

        try: 
                data = L.remove_data(10)  
        except: 
                exc_name, exc_data, _ = exc_info() 
                print(exc_name, exc_data)

                L.show('after remove_data()') 

        n = L.length() 
        print(f"length(L)=={n}")

        ret = L.find(500) 
        if ret == True: 
                print(f'500 is present in list')

        ret = L.find(-1)
        if ret == False: 
                print("-1 is not present in list")
        sys.exit(0)
        
    
main()
#-----

