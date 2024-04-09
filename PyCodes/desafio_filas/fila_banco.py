import time
def hora_atual():
    crtTime = time.localtime(time.time())
    return f"{crtTime.tm_hour}:{crtTime.tm_min}:{crtTime.tm_sec}"

def tamanho(arg: list):
    return len(arg)

def esta_vazia(arg: list):
    return len(arg)==0

def imprimir_relatorio_turno():
    print("Relatório do turno:")
    print(f"\tNúmero de pessoas que entraram no banco: {tamanho(fila)}")
    print(f"\tNúmero de clientes atendidos: {tamanho(atendidos)}")
    print(f"\tNúmero de clientes que saíram: {tamanho(removidos)}")
    print(f"\tHora em que o banco foi aberto: {hora_abertura}")
    print(f"\t4Hora em que o banco foi fechou: {hora_atual()}")
    
def caso_lista_nao_vazia(block):
    if(esta_vazia(arg = fila)):
        print("Ninguém está na fila!")  
    else:
        block()
        
def atender_cliente():
    numero = fila.pop(0)
    print(f"Pessoa {numero} foi atendida!")
    
def remover_cliente():
    numero = fila.pop(0)
    print(f"Pessoa {numero} saiu da fila!")
    
def adicionar_cliente():
    global ultima_pessoa
    ultima_pessoa = ultima_pessoa+1
    fila.append(ultima_pessoa)
    print(f"Pessoa {ultima_pessoa} entrou na fila!")
    
def imprimir_fila():
    print("--->")
    for index, numero in enumerate(fila):
        print(f"{index+1} - Cliente No {numero}")
    print("--->")
    
operacoes = {"adicionar": 1, "atender": 2, "listar": 3, "remover": 4, "fechar": 5}
fila = [x for x in range(1,11)]
ultima_pessoa = fila[-1]
atendidos = []
removidos = []
fila_fechou = False
hora_abertura = hora_atual()
while(fila_fechou==False):
    print("Qual da opções abaixo aconteceu?")
    print("1 - Alguém entrou na fila")
    print("2 - Atender cliente")
    print("3 - Mostrar fila")
    print("4 - Alguém saiu da fila")
    print("5 - O banco foi fechado")
    operacao = int(input(""))
    if(operacao==operacoes["adicionar"]):
        adicionar_cliente()
    elif(operacao==operacoes["atender"]):
        caso_lista_nao_vazia(atender_cliente)
    elif(operacao==operacoes["listar"]):
        imprimir_fila()
    elif(operacao==operacoes["remover"]):
        caso_lista_nao_vazia(remover_cliente)
    elif(operacao==operacoes["fechar"]):
        imprimir_relatorio_turno()
        fila_fechou = True
        