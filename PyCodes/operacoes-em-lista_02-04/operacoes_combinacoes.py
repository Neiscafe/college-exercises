lista1 = [x for x in range(1,3)]
lista2 = [x for x in range(3,7)]
lista3 = [x*y for x,y in zip(lista1, lista2)]
print(lista3)