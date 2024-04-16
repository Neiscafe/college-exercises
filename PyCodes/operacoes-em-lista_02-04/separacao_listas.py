import random as r
lista1 = []
while(len(lista1)<=15):
    lista1.append(r.uniform(-99.9, 99.9))
lista_int = list(map(lambda x: int(x), filter(lambda a: a>=0, lista1)))
lista_semdup = list(set(lista_int))
print(lista1)
print(lista_int)
print(lista_semdup)