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
    nomes = input("Digite a lista de nomes ordenados, separados por espaço: ").split()
    nome_alvo = input("Digite o nome que deseja pesquisar: ")
    if busca_binaria(nomes, nome_alvo):
        print("O nome foi encontrado na lista.")
    else:
        print("O nome não foi encontrado na lista.")

if __name__ == "__main__":
    main()
