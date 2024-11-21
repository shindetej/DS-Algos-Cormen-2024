class  Node:
        """
        @constructor
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



    def __str__(self):
        output = "[START] ->"
        trav =  self.head_node.next
        while trav is not None:
                output += f" {trav.data} ->"
                trav=trav.next
        output +="[END]"
        return output


def main():
        L = singlyLinkedList()
        
        L.insert_start(10)
        L.insert_start(20)
        L.insert_start(90)
        L.insert_start(250)
        print(L)
main()