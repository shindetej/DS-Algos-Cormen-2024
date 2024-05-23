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
            pass

    def insert_end(self,new_data)-> bool:
             pass
    
    def insert_after(self,existing_data,new_data)->bool:
            pass
       
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
    def print(self):
            trav =  self.head_node.next
            while trav is not None:
                    print(trav)
                    trav=trav.next
   

    def remove_data(self,new_data):
             pass


def main():
          L = singlyLinkedList()
          print("L.__dict__ : ",L.__dict__)
          print("L.head_node.__dict__ : ",L.head_node.__dict__)

main()