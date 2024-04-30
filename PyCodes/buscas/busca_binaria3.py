def busca_binaria_remover(lista, alvo):
    indices = []
    inicio = 0
    fim = len(lista) - 1
    while inicio <= fim:
        meio = (inicio + fim) // 2
        if lista[meio] == alvo:
            indices.append(meio)
            esquerda = meio - 1
            direita = meio + 1
            while esquerda >= 0 and lista[esquerda] == alvo:
                indices.append(esquerda)
                esquerda -= 1
            while direita < len(lista) and lista[direita] == alvo:
                indices.append(direita)
                direita += 1
            return indices
        elif lista[meio] < alvo:
            inicio = meio + 1
        else:
            fim = meio - 1
    return indices

def main():
    numeros = [int(x) for x in input("Digite a lista de números ordenados, separados por espaço: ").split()]
    alvo = int(input("Digite o número que deseja remover da lista: "))
    indices = busca_binaria_remover(numeros, alvo)
    if indices:
        indices.sort(reverse=True)
        for indice in indices:
            del numeros[indice]
        print("O número foi removido da lista.")
        print("A lista atualizada é:", numeros)
    else:
        print("O número não foi encontrado na lista.")

if __name__ == "__main__":
    main()
