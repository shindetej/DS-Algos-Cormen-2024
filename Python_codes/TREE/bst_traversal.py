class bst_node: 
    def __init__(self):
            self.root_node = bst_node(None)
            self.num_of_elements = 0


class bst:
    def __init__(self):
        self.root_node = bst_node(None)
        self.num_of_elements = 0

    
    def inorder_successor_node(e_node:bst_node)->bst_node:
         if e_node is not None:
            run =  e_node.right
              while run.left is not None:
                   run = run.left   
              return run
         


    