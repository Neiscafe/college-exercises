def bubble_sort(lista):
    elementos = len(lista) - 1
    ordenado = False
    while not ordenado:
        ordenado = True
        for i in range(elementos):
            if lista[i] < lista[i + 1]:
                lista[i], lista[i + 1] = lista[i + 1], lista[i]
                ordenado = False
        print("-> ", lista)
    return lista


minha_lista = [1, 32, 44, 12, 4, 1, 9]
print("Lista não ordenada: ", minha_lista)
print("Lista ordenada: ", bubble_sort(minha_lista))

