import random
import copy


def gen_data(num, min=10, max=1000):
    data = []
    for x in range(num):
        data.append(random.randint(min, max))
    return data

def verify_sorted(sorted_data):
    sys_sorted_data = sort(sorted_data)
    
    if len(sys_sorted_data) != len(sorted_data):
        return False
    
    for i in range(len(sorted_data)):
        if sorted_data[i] != sys_sorted_data[i]:
            return False
    
    return True
    
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

def br():
    print ('-' * 80)
