import random as r
lista = [x for x in [1,2,3,1,2,1,4,5,6,]]
res = [(x, lista.count(x)) for x in set(lista)]
print(res)