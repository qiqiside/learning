import random


def gen_data(num, min=10, max=1000):
    data = []
    for x in range(num):
        data.append(random.randint(min, max))
    return data


