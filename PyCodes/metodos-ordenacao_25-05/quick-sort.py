def quick_sort(lista):
    pilha = [(0, len(lista) - 1)]
    
    while pilha:
        primeiro_indice, ultimo_indice = pilha.pop()
        if primeiro_indice < ultimo_indice:
            pivot_index = particionar(lista, primeiro_indice, ultimo_indice)
            pilha.append((primeiro_indice, pivot_index - 1))
            pilha.append((pivot_index + 1, ultimo_indice))

def particionar(arr, comeco, fim):
    pivot = arr[fim]
    ref = comeco - 1
    for i in range(comeco, fim):
        if arr[i] <= pivot:
            ref += 1
            arr[ref], arr[i] = arr[i], arr[ref]
    arr[ref + 1], arr[fim] = arr[fim], arr[ref + 1]
    return ref + 1

array = [38, 27, 43, 3, 9, 82, 10]
quick_sort(array)
print("Array ordenado:", array)