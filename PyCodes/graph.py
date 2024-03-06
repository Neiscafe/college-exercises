import time


def createCaminho(valor: int, origem: dict, destino: dict):
    return {"valor": valor, "origem": origem, "destino": destino}

def createAresta(valor: int):
    return {"valor": valor, "caminhos": []}

def a(b: dict):
    return b["valor"]

def calcularRotaMaisRapida(caminhos: list):
    # return caminhos.sort(reverse = True, key = lambda a: a["valor"])
    return caminhos.sort(reverse=True, key = a)

print("Iniciado o projeto de calculo de rota para as Bahamas...")
rotaSp = createAresta(valor = 24.99)
rotaPr = createAresta(valor = 19.50)
rotaCc = createAresta(valor = 9.99)
rotaBh = createAresta(valor = 121.22)
caminhoPrBh = createCaminho(valor = 360000, origem = rotaPr, destino = rotaBh)
caminhoSpBh = createCaminho(valor = 232133, origem = rotaSp, destino = rotaBh)
caminhoCcBh = createCaminho(valor = 8888, origem = rotaCc, destino = rotaBh)
caminhos = [caminhoPrBh, caminhoSpBh, caminhoCcBh]
time.sleep(0.5)
print("...")
time.sleep(0.5)
print("Rotas: ")
print("1. São Paulo")
print("2. Venâncio Aires")
print("3. Não me toque")
print("4. Acre")
rotaEscolhida = int(input("Você está localizado em Santa Cruz do Sul: escolha as opções de rota:"))
if(rotaEscolhida==1):
    for x in calcularRotaMaisRapida(caminhos=caminhos):
        print(f"R${x["valor"]}")



