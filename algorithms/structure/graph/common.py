from abc import ABCMeta, abstractmethod
import matplotlib.pyplot as plt
import graphviz
import random
import copy


def gen_data(num, minimum = 10, maximum = 1000):
    data = []
    for x in range(num):
        data.append(random.randint(minimum, maximum))
    return data
    
def clone(o):
    return copy.deepcopy(o)


class Vertex(object):

    def __init__(self, v):
        self.v = v
        self.next = None

    def __str__(self):
        return str(self.v)

    def __repr__(self):
        return self.__str__()


class Edge(object):

    def __init__(self, v, weight = None):
        self.v = v
        self.next = None

        self.weight = weight

    def __str__(self):
        return str(self.v)

    def __repr__(self):
        return self.__str__()

        
class Graph(object):
    
    __metaclass__ = ABCMeta
    
    @abstractmethod
    def findV(self, v):
        pass
    
    @abstractmethod
    def findE(self, v0, v1):
        pass

    @abstractmethod
    def addV(self, v):
        pass
    
    @abstractmethod
    def addE(self, v0, v1, weight = None):
        pass
    
    @abstractmethod
    def draw(self, withDirection = True, withWeight = False):            
        pass
    
    
class SparseGraph(Graph):
    # using adjacent list
    
    def __init__(self):
        super(SparseGraph, self).__init__()
        self.V = {}

    def findV(self, v):
        for k in self.V:
            item = self.V[k]
            if item.v == v:
                return item

        return None

    def findE(self, v0, v1):
        v = v0.next
        
        while v != None:
            if v.v == v1.v:
                return True

            v = v.next

        return False

    def addV(self, v):
        if v not in self.V:
            self.V[v] = Vertex(v)

        return self.V[v]
        
    def addE(self, v0, v1, weight = None):
        v0 = self.findV(v0)
        v1 = self.findV(v1)

        if v0 == None or v1 == None or self.findE(v0, v1):
            return None 

        edge = Edge(v1.v, weight)

        p = v0.next
        while p != None and p.v > v1.v:
            p = p.next

        if p is None:
            v0.next = edge
        else:
            edge.next = p.next
            p.next = edge

    def __str__(self):
        text = ''

        for k in self.V:
            v = self.V[k]
            text += str(v) + ': '

            n = v.next
            while n is not None:
                if n != v.next:
                    text += ', '

                text += str(n)
                n = n.next

            text += '\n'

        return text

    def draw(self, withDirection = True, withWeight = False):            
        if withDirection:
            G = graphviz.Digraph()
        else:
            G = graphviz.Graph()
        
        for k in self.V:
            v = self.V[k]
            G.node(str(v), str(v))

            n = v.next
            while n is not None:
                if withWeight:
                    G.edge(str(v), str(n), str(n.weight))
                else:
                    G.edge(str(v), str(n))

                n = n.next
            
        display(G)


class DenseGraph(Graph):
    # using adjacent matrix
    # 0 <= vertex.v < maxNodeNum
    
    def __init__(self, maxNodeNum):
        super(DenseGraph, self).__init__()
        
        self.N = maxNodeNum        
        self.V = []
        for x in range(maxNodeNum):
            self.V.append([ None ] * maxNodeNum)

    def findV(self, v):
        return self.V[v][v]

    def findE(self, v0, v1):
        return self.V[v0.v][v1.v]

    def addV(self, v):
        if v < 0 or v >= self.N:
            raise Exception('the vertex value is out of range')

        vertex = Vertex(v)
        self.V[v][v] = vertex
        
        return vertex
        
    def addE(self, v0, v1, weight = None):
        if v0 < 0 or v0 >= self.N:
            raise Exception('the vertex value of v0 is out of range')

        if v1 < 0 or v1 >= self.N:
            raise Exception('the vertex value of v1 is out of range')

        edge = Edge(v1, weight)
        self.V[v0][v1] = edge

    def __str__(self):
        text = ''

        for x in range(self.N):
            for y in range(self.N):
                if y > 0:
                    text += ', '
                text += str(self.V[x][y])
            text += '\n'

        if text != '':
            text += '\n'
            
        return text

    def draw(self, withDirection = True, withWeight = False):            
        G = graphviz.Digraph('structs', node_attr = { 'shape': 'plaintext' })

        s = '<<TABLE BORDER="0" CELLBORDER="1" CELLSPACING="0">'

        s += '<TR><TD> </TD>'
        for x in range(self.N):
            s += '<TD>v%s</TD>' % str(x)
        s += '</TR>'
        
        for x in range(self.N):
            s += '<TR><TD>v%s</TD>' % str(x)
            
            for y in range(self.N):
                v = self.V[x][y]
                
                if v is None:
                    s += '<TD> </TD>'
                else:
                    if not withWeight or x == y:
                        s += '<TD>%s</TD>' % str(self.V[x][y])
                    else:
                        s += '<TD>%s (w: %s)</TD>' % (str(self.V[x][y]), str(self.V[x][y].weight))
            s += '</TR>'
        
        s += '</TABLE>>'

        G.node('struct1', s)
        display(G)

                