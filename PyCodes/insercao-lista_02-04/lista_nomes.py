lista_de_nomes = []
while True:
    nome = input("Digite um nome ou 'fim' para encerrar: ")
    if nome.lower() == "fim":
        break
    else:
        lista_de_nomes.append(nome)
print("Lista completa de nomes:")
for nome in lista_de_nomes:
    print(nome)
