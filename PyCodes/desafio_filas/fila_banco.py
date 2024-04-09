import time
def hora_atual():
    crtTime = time.localtime(time.time())
    return f"{crtTime.tm_hour}:{crtTime.tm_min}:{crtTime.tm_sec}"

def tamanho(arg: list):
    return len(arg)

def esta_vazia(arg: list):
    return len(arg)==0
    
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
    print("3 - Alguém saiu da fila")
    print("4 - O banco foi fechado")
    operacao = int(input(""))
    if(operacao==1):
        ultima_pessoa =  ultima_pessoa+1
        fila.append(ultima_pessoa)
        print(f"Pessoa {ultima_pessoa} entrou na fila!")
    elif(operacao==2):
        if(esta_vazia(arg = fila)):
            print("Ninguém está na fila!")    
        else:
            numero = fila.pop(0)
            print(f"Pessoa {numero} foi atendida!")
    elif(operacao==3):
        if(esta_vazia(arg = fila)):
            print("Ninguém está na fila!")    
        else:
            numero = fila.pop(0)
            print(f"Pessoa {numero} saiu da fila!")
    elif(operacao==4):
        print("Relatório do turno:")
        print(f"\tNúmero de pessoas que entraram no banco: {tamanho(fila)}")
        print(f"\tNúmero de clientes atendidos: {tamanho(atendidos)}")
        print(f"\tNúmero de clientes que saíram: {tamanho(removidos)}")
        print(f"\tHora em que o banco foi aberto: {hora_abertura}")
        print(f"\t4Hora em que o banco foi fechou: {hora_atual()}")
        fila_fechou = True
        