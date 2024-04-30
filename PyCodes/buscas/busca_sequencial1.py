def busca_sequencial(lista, alvo):
    for numero in lista:
        if numero == alvo:
            return True
    return False

numeros = str(input("Digite uma lista de números separados por espaços: ")).split()
numeros = [int(numero) for numero in numeros] 

alvo = int(input("Digite o número que você deseja pesquisar na lista: "))

if busca_sequencial(numeros, alvo):
    print(f"O número {alvo} foi encontrado na lista.")
else:
    print(f"O número {alvo} não foi encontrado na lista.")
