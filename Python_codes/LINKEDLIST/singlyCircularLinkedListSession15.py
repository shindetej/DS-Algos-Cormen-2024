class Node:
    def __init__(self,new_data:any):
        self.data=  new_data
        self.next= None



class SinglyCircularLinkedList:
    def __init__(self):
        self.head_node = Node(None)
        self.head_node.next =  self.head_node

    def insert_start(self,new_data:any)->None:
        new_node =  Node(new_data)

        new_node.next  = self.head_node.next
        self.head_node.next =  new_node


    def insert_end(self,new_data:any )->None : 
        new_node =  Node(new_data)

        run =  self.head_node
        while run.next !=  self.head_node:
            run = run.next

        new_node.next = run.next
        run.next = new_node

    def insert_after(self,e_data:any,new_data:any)->None:
        run = self.head_node.next
        while run !=  self.head_node:
            if run.data == e_data:
                break
            run =  run.next
        else:
            raise ValueError(f"{e_data} not exist")
        new_node = Node(new_data)
        new_node.next =  run.next
        run.next = new_node

    
    def insert_before(self,e_data,new_data:any)->None:
        run = self.head_node.next
        run_prev = self.head_node

        while run != self.head_node:
            if run.data == e_data
                break
            run.prev  =  run
            run =  run.next
        else : 
            raise ValueError(f"{e_data} not exist")
        
        new_node = Node(new_data)
        new_node.next = run 
        run_prev.next = new_node

    def show(self,msg = None) -> None: 
        if msg is not None:
            print(msg)

        print("[START] -> ",end='')
        run =  self.head_node.next
        while run !=  self.head_node:
            print(f" [{run.data} ->",end='')
        
        print(' [END]  ')


    def get_start(self)->any:
        if self.head_node.next ==  self.head_node:
            raise ValueError("EMPTY LIST")
        
        return self.head_node.next.data

    
    def get_end(self)->any:
        if self.head_node.next ==  self.head_node:
            raise ValueError("EMPTY LIST")

        run = self.head_node
        while run.next != self.head_node:
            run = run.next
        return run.data
        

    def pop_start(self)->any:
        if self.head_node.next ==  self.head_node:
            raise ValueError("EMPTY LIST")
        
        data =  self.head_node.next.data
        first_node_with_data= self.head_node.next
        self.head_node.next = first_node_with_data.next
        return data

    def pop_end(self)->None:
        if self.head_node.next ==  self.head_node:
            raise ValueError("EMPTY LIST")
        run =  self.head_node.next
        run_prev =  self.head_node

        while run.next != self.head_node:
            run_prev = run
            run =  run.next
        data= run.data
        run_prev.next = self.head_node
        return data

    def remove_start(self)->None:
        if self.head_node.next ==  self.head_node:
            raise ValueError("EMPTY LIST")
        
        first_node_with_data =  self.head_node.next
        self.head_node.next =  first_node_with_data.next


    def remove_end(self)->None:
        if self.head_node.next ==  self.head_node:
            raise ValueError("EMPTY LIST")
        run = self.head_node.next
        run_prev = self.head_node

        while run !=  self.head_node:
            run_prev = run
            run = run.next


        run_prev.next =  self.head_node
        del run


    def remove_data(self,r_data):
        run =  self.head_node.next
        run_prev = self.head_node

        while run != self.head_node:
            if run.data == r_data:
                break
            run_prev = run
            run =  run.next
        else :
            raise ValueError(f"{r_data not found!}")
        
        run_prev.next =  run.next
        del run


    def find(self,find_data : any) -> bool:
        run =  self.head_node.next
        while run != self.head_node:
            if run.data == find_data:
                return True
            run  = run.next

        return False
    
    def is_empty(self)->bool:
        return self.head_node.next == self.head_node

