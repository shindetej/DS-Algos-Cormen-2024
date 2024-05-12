class Node:
    def __init__(self,new_data:int):
        if type(new_data) != int:
            raise TypeError("bad type : new_data")
        self.data = new_data
        self.next = None


def main():
    N1 = Node(100)
    print("N1.__dict__:",N1.__dict__)
    N2 = Node(200)
    print("N2.__dict__:",N2.__dict__)

main()


"""
Output: 
N1.__dict__: {'data': 100, 'next': None}
N2.__dict__: {'data': 200, 'next': None}

"""