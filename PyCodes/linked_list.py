class Nodo:
    valor: str
    next

def preencherListaManual(listHead):
    for x in range(1,5):
        if(x == 1):
            nodoAtual = listHead
        else:
            nodoAtual.next = Nodo()
            nodoAtual = nodoAtual.next
        nodoValor = str(input("Escreva o valor para o primeiro nodo do programa:"))
        nodoAtual.value = nodoValor
        print("Valor: "+nodoAtual.value)

def preencherListaAutomatico(listHead):
    for x in range(1,5):
        if(x == 1):
            nodoAtual = listHead
        else:
            nodoAtual.next = Nodo()
            nodoAtual = nodoAtual.next
        nodoAtual.value = "asssadas"
        print("Valor: "+nodoAtual.value)


listHead = Nodo()
print("Lista de operações:")
print("1 - Preencher lista voluntariamente")
print("2 - Preencher lista automaticamente")
operacao = int(input("Qual operação deseja realizar? "))
if(operacao==1):
    preencherListaManual(listHead)
if(operacao==2):
    preencherListaAutomatico(listHead)


