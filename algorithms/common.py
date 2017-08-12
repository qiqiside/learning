import random
import copy


def gen_data(num, min=10, max=1000):
    data = []
    for x in range(num):
        data.append(random.randint(min, max))
    return data

def shuffle(l):
    l = clone(l)
    random.shuffle(l)
    return l

def sort(l):
    l = clone(l)
    l.sort()
    return l

def clone(o):
    return copy.deepcopy(o)

