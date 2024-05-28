def merge_sort(lista):
    if len(lista) <= 1:
        return lista
    
    meio = len(lista) // 2
    lista_esquerda = lista[:meio]
    lista_direita = lista[meio:]
    
    esquerda_ordenada = merge_sort(lista_esquerda)
    direita_ordenada = merge_sort(lista_direita)
    
    return merge(esquerda_ordenada, direita_ordenada)

def merge(lista_esquerda, lista_direita):
    resultado = []
    indice_esquerdo, indice_direito = 0, 0
    
    while indice_esquerdo < len(lista_esquerda) and indice_direito < len(lista_direita):
        if lista_esquerda[indice_esquerdo] <= lista_direita[indice_direito]:
            resultado.append(lista_esquerda[indice_esquerdo])
            indice_esquerdo += 1
        else:
            resultado.append(lista_direita[indice_direito])
            indice_direito += 1
    
    resultado.extend(lista_esquerda[indice_esquerdo:])
    resultado.extend(lista_direita[indice_direito:])
    
    return resultado

array = [38, 27, 43, 3, 9, 82, 10]
sorted_array = merge_sort(array)
print("Array ordenado:", sorted_array)