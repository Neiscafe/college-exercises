def insertion_sort(lista, key):
    for proximo in range(1, len(lista)):
        proximoValor = lista[proximo]
        atual = proximo - 1
        while atual >= 0 and lista[atual][key] < proximoValor[key]:
            lista[atual + 1] = lista[atual]
            atual -= 1
        lista[atual + 1] = proximoValor


def simular_atendimento_presencial(clientes):
    print("Simulando atendimento preferencial na fila do banco...")
    insertion_sort(clientes, "preferencial")
    for cliente in clientes:
        print(
            f"Atendendo cliente {'preferencial' if cliente['preferencial'] else 'nao preferencial'}: {cliente['nome']}"
        )


clientes = [
    {"nome": "João", "preferencial": False},
    {"nome": "João", "preferencial": False},
    {"nome": "João", "preferencial": False},
    {"nome": "Pedro", "preferencial": True},
]
print(clientes[2]["preferencial"]>clientes[3]["preferencial"])
simular_atendimento_presencial(clientes)
