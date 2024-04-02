palavras = []

while True:
    palavra = input("Digite uma palavra ou pressione Enter sem digitar nada para encerrar: ")
    if palavra == "":
        break
    else:
        palavras.append(palavra)

print("Lista completa de palavras:")
for palavra in palavras:
    print(palavra)
