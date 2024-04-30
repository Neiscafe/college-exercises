def busca_linear(lista, nome):
    for nome_na_lista in lista:
        if nome_na_lista == nome:
            return True
    return False

nomes = input("Digite uma lista de nomes separados por espaços: ").split()
nome_pesquisado = input("Digite o nome que deseja pesquisar na lista: ")

if busca_linear(nomes, nome_pesquisado):
    print(f"O nome '{nome_pesquisado}' está presente na lista.")
else:
    print(f"O nome '{nome_pesquisado}' não está presente na lista.")
