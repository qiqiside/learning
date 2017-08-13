import matplotlib.pyplot as plt
import graphviz


class ArrayGraph:

    def __init__(self, A):
        self.A = A
        self.G = graphviz.Digraph('structs', node_attr = { 'shape': 'plaintext' })

    def draw(self):
        s = '<<TABLE BORDER="0" CELLBORDER="1" CELLSPACING="0"><TR>'
        for x in self.A:
            s += '<TD>%s</TD>' % str(x)

        s += '</TR></TABLE>>'

        self.G.node('struct1', s)
        display(self.G)
        

def draw_array(label, A):
    if label != None and label != '':
        print(label)

    arrayGraph = ArrayGraph(A)
    arrayGraph.draw()


class TreeGraph:

    def __init__(self, tree):
        self.tree = tree

        self.G = graphviz.Graph()

    def node(self, node):
        self.G.node(str(id(node)), label = str(node))

    def edge(self, node1, node2):
        self.G.edge(str(id(node1)), str(id(node2)))

    def walk(self, x = None):
        if x == None:
            x = self.tree.root

        if x == None:
            return

        self.node(x)

        if x.left != None:
            self.node(x.left)
            self.edge(x, x.left)

            self.walk(x.left)
        
        if x.right != None:
            self.node(x.right)
            self.edge(x, x.right)

            self.walk(x.right)

    def draw(self):
        self.walk()
        display(self.G)
        

def draw_tree(label, A):
    if label != None and label != '':
        print(label)

    treeGraph = TreeGraph(A)
    treeGraph.draw()

