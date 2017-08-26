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

def sort(l):
    l = clone(l)
    l.sort()
    return l

def is_sorted(sorted_data):
    sys_sorted_data = sort(sorted_data)
    
    if len(sys_sorted_data) != len(sorted_data):
        return False
    
    for i in range(len(sorted_data)):
        if sorted_data[i] != sys_sorted_data[i]:
            return False
    
    return True
    
def draw_array(A):
    if len(A) == 0:
        A = [ '' ]
        
    G = graphviz.Digraph('structs', node_attr = { 'shape': 'plaintext' })
    
    s = '<<TABLE BORDER="0" CELLBORDER="1" CELLSPACING="0"><TR>' 
    for x in A:
       s += ('<TD>%s</TD>' % str(x))
    s += '</TR></TABLE>>'

    G.node('struct1', s)
    display(G)


class Sort(object):
    
    __metaclass__ = ABCMeta
    
    def __init__(self, A = []):
        self.init(A, 0, len(A) - 1)
    
    def init(self, A, start, end):
        self.A = A
        self.start = 0
        self.end = len(self.A) - 1
        
    @abstractmethod
    def _sort(self):
        pass
    
    def sort(self, A = [], start = None, end = None):
        if start is not None and end is not None:
            self.init(A, start, end)
        elif A is not None:
            self.init(A, 0, len(A) - 1)
        
        return self._sort()
            
    def verify(self, num = 10):
        for x in range(num + 1):
            data = gen_data(x)
            draw_array(data)
            
            self.sort(data)
            draw_array(data)

            print('  verify = ' + str(is_sorted(data)) + '\n\n\n')
