from sys import exc_info
from traceback import print_tb

def generic_exception_handler(want_tb = False):
    exc_name , exc_data,exc_tb = exc_info()
    print(exc_name.__name__,exc_data,sep=':')

    if want_tb:
        print_tb(exc_tb)

class VertexInvalidError(Exception):
    pass


class VertexExistsError(Exception):
    pass

class EdgeInvalidError(Exception):
    pass

class EdgeExistsError(Exception):
    pass



class Graph:
    def __init__(self):
        self.G = {} # dictionary as a graph
        self.number_of_edges = 0
    def add_vertex(self,v:int):
        """
        if vertex exist throw exception
        """
        if v  in self.G.keys():
            raise VertexExistsError(f"{v} is already exists")
        
        self.G[v] = [] # empty array to vertex

    def remove_vertex(self,v:int):
        if v not in self.G.keys():
            raise VertexInvalidError(f"{v} is not valid vertex")
        for v_adj in self.G[v]:
            self.G[v_adj].remove(v)
        self.number_of_edges -= len(self.G[v]) #reduce edges of v from total edges
        del self.G[v]

    def add_edge(self,v_start:int,v_end:int):
        if v_start not in self.G.keys():
            raise VertexInvalidError(f"{v_start} is an invalid vertex")
        if v_end not in self.G.keys():
            raise VertexInvalidError(f"{v_end} is an invalid vertex")
        
        if v_start in self.G[v_end] and v_end in self.G[v_start] :
            raise EdgeExistsError(f"Already has edge exists between {v_start} and {v_end}")
        self.G[v_start].append(v_end)
        self.G[v_end].append(v_start)
        self.number_of_edges+=1

    def remove_edge(self,v_start:int,v_end:int):
        if v_start not in self.G.keys():
            raise VertexInvalidError(f"{v_start} is invalid vertex")
        if v_end not in self.G.keys():
            raise VertexInvalidError(F"{v_end} is invalid vertex")
        if not v_start in self.G[v_end] or not v_end in self.G[v_start]:
            raise EdgeInvalidError(f"edge ({v_start},{v_end} does not exist)")
        
        self.G[v_start].remove(v_end)
        self.G[v_end].remove(v_start)

        self.number_of_edges -=1 

    def get_number_of_vertices(self)->int:
        return len(self.G.keys())
    
    def get_number_of_edges(self)-> int:
        return self.number_of_edges
    

    def degree(self,v: int):
        if v not in self.G.keys():
            raise VertexInvalidError(f"{v} is not in graph")
        
    def __str__(self):
        op_string = ''

        op_string +=f'|V| = {len(self.G.keys())} E = |{self.number_of_edges}|\n'

        for v in self.G.keys():
            op_string += f'[{v}]\t<->\t'
            for adj_vertex in self.G[v]:
                op_string+= f'[{adj_vertex}]<->'

            op_string +='[END]\n'

        return op_string
    
def main():
    g = Graph()
    edges = [(1,2),(2,3),(3,4),(4,5),(5,6),(6,1),(2,5),(2,6),(3,5),(3,6)]

    print(g)
    for v in range(1,7):
        g.add_vertex(v)

    print(g)

    for e in edges:
        g.add_edge(e[0],e[1])
    print(g)

main()
