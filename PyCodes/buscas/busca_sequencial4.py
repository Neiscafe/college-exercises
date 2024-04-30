def remover_elemento(lista, elemento):
    while elemento in lista:
        lista.remove(elemento)

lista = input("Digite uma lista de elementos separados por espaços: ").split()
elemento_remover = input("Digite o elemento que deseja remover da lista: ")

remover_elemento(lista, elemento_remover)
print("Lista após remoção:", lista)
