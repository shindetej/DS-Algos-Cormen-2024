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
    

    def add_node(self,new_data):
             """
             
             """

def main():
          L = singlyLinkedList()
          print("L.__dict__ : ",L.__dict__)
          print("L.head_node.__dict__ : ",L.head_node.__dict__)

main()