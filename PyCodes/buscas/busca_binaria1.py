def busca_binaria(lista, alvo):
    inicio = 0
    fim = len(lista) - 1
    while inicio <= fim:
        meio = (inicio + fim) // 2
        if lista[meio] == alvo:
            return True
        elif lista[meio] < alvo:
            inicio = meio + 1
        else:
            fim = meio - 1
    return False

def main():
    numeros = [int(x) for x in input("Digite a lista de números ordenados, separados por espaço: ").split()]
    alvo = int(input("Digite o número que deseja pesquisar: "))
    if busca_binaria(numeros, alvo):
        print("O número foi encontrado na lista.")
    else:
        print("O número não foi encontrado na lista.")

if __name__ == "__main__":
    main()
