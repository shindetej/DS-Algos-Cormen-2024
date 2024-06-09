class Node:
    def __init__(self,new_data):
        self.data=  new_data
        self.next = None


class singlyCircularLinkedList:
    def __init__(self):
        self.head_node = Node(None)
        self.head_node.next = self.head_node  # circular property


    def insert_start(self,new_data):
        new_node =  Node(new_data)

        new_node.next = self.head_node.next
        self.head_node.next = new_node

        
    def insert_end(self,new_data):
        new_node = Node(new_data)
        run = self.head_node
        while run.next is not self.head_node :
                run = run.next
        new_node.next = run.next 
        run.next = new_node


    def insert_before(self,existing_data,new_data):
        run =  self.head_node

        while run.next != self.head_node :
              if  run.next.data == existing_data:
                   break
              run_prev = run
              run =run.next
        else : 
             raise ValueError(f"{existing_data} not found")
        new_node =  Node(new_data)
        run_prev.next =  new_node
        new_node.next  =  run

    def __str__(self):
        output = "[START] ->"
        trav =  self.head_node.next
        while trav is not self.head_node:
                output += f" {trav.data} ->"
                trav=trav.next
        output +="[END]"
        return output


def main():
        L = singlyCircularLinkedList()
        
        L.insert_start(10)
        L.insert_end(20)
        L.insert_start(90)
        L.insert_end(230)
        L.insert_end(60)
        print(L)
main()