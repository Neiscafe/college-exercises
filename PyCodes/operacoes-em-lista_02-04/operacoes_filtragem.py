lista = [x for x in range(1,11)]
listaPares = list(filter(lambda arg0: arg0%2==0, lista))
print(listaPares)
listaMaioresQueCinco = [x for x in lista if x>5]
print(listaMaioresQueCinco)