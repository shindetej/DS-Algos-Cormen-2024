class bst_node:
    def __init__(self,new_data):
        self.data = new_data
        self.left = None
        self.right =  None
        self.parent = None

class bst :
    def __init__(self):
        self.root_node = None
        self.number_of_elements = 0


     # print inorder 
    @staticmethod
    def _inorder(r:bst_node) -> None:
        if r is not None :
            bst._inorder(r.left)
            print(f"[{r.data}]->" ,end=' ')
            bst._inorder(r.right)

     # print inorder 
    @staticmethod
    def _preorder(r:bst_node) -> None:
        if r is not None :
            print(f"[{r.data}]->" ,end=' ')
            bst._preorder(r.left)
            bst._preorder(r.right)

     # print inorder 
    @staticmethod
    def _postorder(r:bst_node) -> None:
        if r is not None :
            bst._postorder(r.left)
            bst._postorder(r.right)
            print(f"[{r.data}]->" ,end=' ')

    def insert(self,new_data):
        new_node = bst_node(new_data)
        if self.root_node is None : 
            # tree empty
            self.root_node = new_node
            self.number_of_elements += 1 
            return None
        run = self.root_node
        while(True):
            
            if new_data <= run.data:
                if run.left == None : 
                    run.left = new_node
                    run.left.parent = run
                    break
                else : 
                    run = run.left
            else:
                if run.right is None :
                    run.right = new_node
                    run.right.parent =run
                    break
                else :
                    run = run.right
          
        self.number_of_elements += 1

   

        
    def inorder(self):
        '''
        @self : bst object
        traverse through BST @self using inorder sequence
        '''
        print("[START] -> ",end='')
        bst._inorder(self.root_node)
        print("[END]")
    
    def preorder(self):
        '''
        @self : bst object
        traverse through BST @self using pre order sequence
        '''
        print("[START] -> ",end='')
        bst._preorder(self.root_node)
        print("[END]")
    
    def postorder(self):
        '''
        @self : bst object
        traverse through BST @self using post order sequence
        '''
        print("[START] -> ",end='')
        bst._postorder(self.root_node)
        print("[END]")

    def inorder_successor_node(e_node:bst_node)->bst_node:
        if e_node.right is not None:
            run = e_node.right
            while run.left is not None:
                run =  run.left
            return run

if __name__ == '__main__':
    T = bst()
    # T.insert(100) # 100 inserted at root position
    # T.insert(200)
    # T.insert(10)
    # T.insert(70)
    # T.insert(120)
    # T.insert(101)
    sample_data = [100,200,10,70,120,101]
    print(f" INPUT SAMPLE : {sample_data}")

    for x in sample_data:
        T.insert(x)

    print("PRE ORDER TRAVERSAL")
    T.preorder()
    print("IN ORDER TRAVERSAL")
    T.inorder()
    print("POST ORDER TRAVERSAL")
    T.postorder()


