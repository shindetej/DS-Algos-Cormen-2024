'''
@Author : Tejas Mahendra Shinde
@Date :  14 June 2024
@goal : Implement a package containing OO implementation of Doubly Circular Linked List
'''

class List:
     class Node :
          def __init__(self,data: any):
               self.data =  data
               self.prev = None
               self.next = None

     def __init__(self):
               self.head_node = self.Node(None)
               self.head_node.prev = self.head_node
               self.head_node.next = self.head_node

     @staticmethod
     def generic_insert(start_node,mid_node,end_node):
          mid_node.next = end_node
          mid_node.prev = start_node
          start_node.next = mid_node
          end_node.prev = mid_node
     
     @staticmethod
     def generic_delete(delete_node):
          delete_node.prev.next  = delete_node.next
          delete_node.next.prev = delete_node.prev

     def search_node(self,s_data):
          run= self.head_node.next
          while run != self.head_node:
               if run.data == s_data:
                    return run
               run = run.next
          return None
     
     def empty(self)->bool:
          return (self.head_node.next == self.head_node and self.head_node.prev == self.head_node)

     
     def insert_start(self,new_data):
          List.generic_insert(
               self.head_node,
               List.Node(new_data),
               self.head_node.next
          )

     def insert_end(self,new_data):
          List.generic_insert(self.head_node.prev,List.Node(new_data),self.head_node)

     
     def insert_after(self,existing_data,new_data):
          existing_node =  self.search_node(existing_data)
          if existing_node is None:
               raise ValueError(f'{existing_data} not present in list')
          List.generic_insert(existing_node,List.Node(new_data),existing_node.next)

     def insert_before(self,e_data,new_data):
          e_node =  self.search_node(e_data)
          if e_node is None  :
               raise  ValueError(f'{e_data} not present in the list')
          
          List.generic_insert(e_node.prev,List.Node(new_data),e_node)


     def get_start(self):
          if self.empty():
               raise ValueError("cannot invoke get_start() on emptylist")
          
          return self.head_node.next.data
     
     def get_end(self):
          if self.empty():
               raise ValueError("can not invoke get_end() on empty list")
          
          return self.head_node.prev.data
     
     def pop_start(self):
          if self.empty():
               raise ValueError("can not invoke pop_start() on empty list")
          
          data = self.head_node.next.data
          List.generic_delete(self.head_node.next)
          return data
     
     def pop_end(self):
          if self.empty():
               raise ValueError("can not invoke pop_empty() on empty list")
          
          data = self.head_node.next.data
          List.generic_delete(self.head_node.prev)
          return data
     
     def remove_start(self):
          if self.empty():
               raise ValueError("can not invoke remove_start() on empty list")
          List.generic_delete(self.head_node.next)

     
     def remove_end(self):
          if self.empty():
               raise ValueError("cannot invoke remove_end() on empty list")
          List.generic_delete(self.head_node.prev)

     def 

          