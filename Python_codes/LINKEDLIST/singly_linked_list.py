"""
@date : 12/05/2024
@session :  10
@motive : to implement and test singly linked list datastructure
"""

class  Node:
        """
        
        """
        def __init__(self,new_data:any):
            self.data = new_data
            self.next = None
        
        


class singlyLinkedList:
    """
    
    """
    def __init__(self):
          self.head_node = Node(None)
    

    def insert_start(self,new_data)->bool:
       new_node =  Node(new_data) # create new node
       new_node.next =  self.head_node.next # assign to new node next head node next 
       self.head_node.next =  new_node # assign to existing head node next new node

    def insert_end(self,new_data)-> bool:
        new_node = Node(new_data)
        run = self.head_node
        while run.next is not None :
                run = run.next
        new_node.next = run.next # although it None here in other list here might be different
        run.next = new_node
    
    def insert_after(self,existing_data,new_data)->bool:
        run  =  self.head_node.next
        while run != None :
               if run.data == existing_data :
                      break
               run  =  run.next
        else:
               raise ValueError(f"{existing_data} not found")

        new_node =  Node(new_data)
        new_node.next = run.next
        run.next = new_node
       
    def insert_before(self,existing_data,new_data)->bool:
            pass
       
    def pop_start(self):
             pass
  
    def pop_end(self):
             pass
    def get_start(self):
             pass
  
    def get_end(self):
             pass
    
    def remove_start(self):
             pass
    
    def remove_end(self):
             pass
    def show(self):
        print("[START] ->",end= ' ')
        trav =  self.head_node.next
        while trav is not None:
                print(f"{trav.data} ->",end=' ')
                trav=trav.next
        print("[END]")

    def remove_data(self,new_data):
             pass


def main():
        L = singlyLinkedList()
        print("L.__dict__ : ",L.__dict__)
        print("L.head_node.__dict__ : ",L.head_node.__dict__)
        L.insert_start(10)
        L.insert_start(20)
        L.insert_after(20,15)
        L.insert_end(60)
        L.insert_end(70)
        L.insert_end(80)

        L.show()
main()