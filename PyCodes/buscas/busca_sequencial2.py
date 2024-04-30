def contar_ocorrencias(lista, elemento):
    contagem = 0
    for item in lista:
        if item == elemento:
            contagem += 1
    return contagem

lista = input("Digite uma lista de elementos separados por espaços: ").split()
elemento = input("Digite o elemento que deseja contar na lista: ")

print(f"O elemento '{elemento}' ocorre {contar_ocorrencias(lista, elemento)} vezes na lista.")
