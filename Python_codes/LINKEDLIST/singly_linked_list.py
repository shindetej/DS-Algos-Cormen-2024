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
        run = self.head_node
        while run.next != None :
               if run.next.data == existing_data:
                      break
               run = run.next
        else:
               raise ValueError(f"{existing_data} not found")
        # create new node
        new_node = Node(new_data)
        new_node.next = run.next
        run.next = new_node
        return True
    
    
    def get_start(self):
        if self.head_node.next is None :
                raise ValueError("Can not get the start as list is empty")
        return self.head_node.next.data
  
    def get_end(self):
        if self.head_node.next is None :
                raise ValueError("Can not get the start as list is empty")
        run =  self.head_node
        while  run.next is not None:
                run = run.next
        return run.data

    def pop_start(self):
        if self.head_node.next is None : 
                raise ValueError("list is empty!!")
        data = self.head_node.next.data 
        self.head_node.next =self.head_node.next.next
        return data
    
    def pop_end(self):
        if self.head_node.next is None:
              raise ValueError("list is empty !!!")
        run =  self.head_node
        while  run.next.next is not None:
              run = run.next
        data = run.next.data
        run.next = run.next.next
        return data

    def remove_start(self):
        if self.head_node.next is None : 
                raise ValueError("list is empty!!")
        self.head_node.next =self.head_node.next.next

    
    def remove_end(self):
        if self.head_node.next is None:
         raise ValueError("list is empty !!!")
        run =  self.head_node
        while  run.next.next is not None:
              run = run.next
        run.next = run.next.next

    def remove_data(self,new_data):
        if self.head_node.next is None:
         raise ValueError("list is empty !!!")
        run =  self.head_node
        while  run.next is not None and run.next.data != new_data:
              run = run.next
        run.next = run.next.next


    def show(self,s:str):
        if type(s) != str:
              raise TypeError("arg not a string")
        print(s)    
        print("[START] ->",end= ' ')
        trav =  self.head_node.next
        while trav is not None:
                print(f"{trav.data} ->",end=' ')
                trav=trav.next
        print("[END]")

   


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
        L.insert_end(101)
        L.insert_before(15,45)
        L.show("after adding data")
        data1 = L.get_start()
        data2 = L.get_end()
        L.show("after get data")
        print(f"get data ata start {data1}")
        print(f"get data ata start {data2}")
        data3 = L.pop_start()
        L.show("after pop_start() data")
        data4 = L.pop_end()
        L.show("after pop_end() data")
        L.remove_end()
        L.show("after L.remove_end() data")
        L.remove_data(60)
        L.show("after L.remove_data(15) data")
        L.remove_start()
        L.show("after L.remove_start() data")

main()