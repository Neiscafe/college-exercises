fila = ["Carlos", "Ana", "Jorge", "Mateus", "Sthefany", "Lucas", "Pedro", "Alex", "Douglas", "Rafaela"]
filaFechou = False

def estaVazia(lista: list):
    return len(lista)==0
    

while(filaFechou==False):
    print("Qual da opções abaixo aconteceu?")
    print("1 - Alguém entrou na fila")
    print("2 - Atender cliente")
    print("3 - Alguém saiu da fila")
    print("4 - O banco foi fechado")
    operacao = int(input(""))
    if(operacao==1):
        nome = input(str("Quem entrou na fila? "))
        fila.append(nome)
    elif(operacao==2):
        if(estaVazia(lista = fila)):
            print("Ninguém está na fila!")    
        else:
            pessoa = fila.pop(0)
            print(f"{pessoa} foi atendido!")
    elif(operacao==3):
        if(estaVazia(lista = fila)):
            print("Ninguém está na fila!")    
        else:
            del fila[0]
    elif(operacao==4):
        filaFechou = True
        