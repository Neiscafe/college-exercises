ultimoIndice = 0
estoque = dict()
acoes = {
    "Adicionar": 1,
    "Atualizar quantidade": 2, 
    "Remover":3, 
    "Consultar":4,
    "Listar":5,
    "Sair": 6,
    }

def adicionar(dsc: str):
    estoque[str(ultimoIndice+1)] = {"descricao": dsc, "quantidade": 0 }

def atualizar_quantidade(cod: str, qtd):
    item = estoque.get(cod, None)
    if(item is None):
        print("Código não registrado!")
        return
    estoque[cod]["quantidade"] = qtd
    print(f"{item} foi atualizado!")

def remover(cod: str):
    item = estoque.pop(cod, None)
    if(item is None):
        print("Código não registrado!")
        return
    print(f"{item["descricao"]} foi removido!")

def consultar(cod: str):
    consulta = estoque.get(cod)
    if(consulta is None):
        print("Código não registrado!")
    else:
        print(consulta)
        
def listar_produtos():
    print(estoque)
    
def validar_args(args: list, n_args = 1):
    if(len(args)<=0):
        return True
    erro = False
    for a in range(0, n_args):
        if(not args[a]):
            erro = True
    return erro

while(True):
    print("1 - Adicionar produto")
    print("2 - Atualizar quantidade de produto")
    print("3 - Remover produto")
    print("4 - Consultar quantidade de produto")
    print("5 - Consultar todos os produtos")
    print("6 - Sair")
    cmd = str(input("Digite a operação e informacoes:")).strip()
    divisoes = cmd.split(",", 1,)
    print(divisoes)
    operacao = int(divisoes[0])
    args = divisoes[1:len(divisoes)]
    if operacao==acoes["Adicionar"]:
        if(validar_args(args)):
            print("Argumentos inválidos!")
        else:
            adicionar(args[0].strip())
    elif operacao==acoes["Atualizar quantidade"]:
        if(validar_args(args.split(",", 1)), 2):
            print("Argumentos inválidos!")
        else:
            atualizar_quantidade(args[0], args[1])
    elif operacao==acoes["Remover"]:
        if(validar_args(args)):
            print("Argumentos inválidos!")
        else:
            remover(args[0].strip())
    elif operacao==acoes["Consultar"]:
        if(validar_args(args)):
            print("Argumentos inválidos!")
        else:
            consultar(args[0].strip())
    elif operacao==acoes["Listar"]:
        listar_produtos()
    elif(operacao == acoes["Sair"]):
        break
    else:
        print("Tente novamente!")