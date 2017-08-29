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


class Vector(object):

    def __init__(self, v, weight = None):
        self.v = v
        self.weight = weight
        self.next = None

    def __str__(self):
        return str(self.v)

    def __repr__(self):
        return self.__str__()


class Edge(Vector):

    def __init__(self, v, weight = None):
        super(Edge, self).__init__(v, weight)


class Graph(object):
    
    __metaclass__ = ABCMeta
    
    def __init__(self):
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
            self.V[v] = Vector(v)

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

    def draw(self, with_direction = True):
            
        if with_direction:
            G = graphviz.Digraph()
        else:
            G = graphviz.Graph()
        
        for k in self.V:
            v = self.V[k]
            G.node(str(v), str(v))

            n = v.next
            while n is not None:
                G.edge(str(v), str(n))

                n = n.next
            
        display(G)

