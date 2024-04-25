estoque = dict()
acoes = {
    "Adicionar", 1, 
    "Atualizar quantidade",2, 
    "Remover",3, 
    "Consultar",4, 
    "Listar",5
    }

def adicionar():
    print("Digite a descrição e a quantidade:")

print("1 - Adicionar produto")
print("2 - Atualizar quantidade de produto")
print("3 - Remover produto")
print("4 - Consultar quantidade de produto")
print("5 - Consultar todos os produtos")
operacao = int(input("Digite a operação:"))

if operacao==acoes["Adicionar"]:
    adicionar()
elif operacao==acoes["Atualizar quantidade"]:
    atualizar_quantidade()
elif operacao==acoes["Remover"]:
    remover()
elif operacao==acoes["Consultar"]:
    consultar()
elif operacao==acoes["Listar"]:
    listar_produtos()
else:
    print("Tente novamente!")