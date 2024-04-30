def busca_binaria_inserir(lista, alvo):
    inicio = 0
    fim = len(lista) - 1
    while inicio <= fim:
        meio = (inicio + fim) // 2
        if lista[meio] == alvo:
            return meio
        elif lista[meio] < alvo:
            inicio = meio + 1
        else:
            fim = meio - 1
    return inicio

def main():
    numeros = [int(x) for x in input("Digite a lista de números ordenados, separados por espaço: ").split()]
    novo_numero = int(input("Digite o número que deseja inserir na lista: "))
    posicao = busca_binaria_inserir(numeros, novo_numero)
    numeros.insert(posicao, novo_numero)
    print("O número foi inserido na posição:", posicao)
    print("A lista atualizada é:", numeros)

if __name__ == "__main__":
    main()
