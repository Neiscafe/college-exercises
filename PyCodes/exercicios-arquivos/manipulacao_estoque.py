import csv

headers = ["nome", "quantidade"]
items = []

while True:
    print("1 - Escrever")
    print("2 - Remover")
    print("3 - Editar")
    print("4 - Consultar")
    print("5 - Listar todos")
    print("99 - Sair")
    cmd = int(input("Informe a opcao desejada:"))
    if cmd == 99:
        break
    elif cmd == 1:
        nome = str(input("Digite o nome do produto:")).strip()
        quantidade = int(input("Digite a quantidade:"))
        obj = {"nome": nome, "quantidade": quantidade}
        with open(
            file="produtos.csv", mode="r", encoding="utf-8", newline=""
        ) as csvfileread:
            lines = csv.DictReader(csvfileread, fieldnames=headers)
            items = []
            for row in lines:
                items.append(row)
            with open(
                file="produtos.csv", mode="w", encoding="utf-8", newline=""
            ) as csvfilewrite:
                writer = csv.DictWriter(csvfilewrite, fieldnames=headers)
                if len(items) == 0:
                    writer.writeheader()
                items.append(obj)
                writer.writerows(items)
        print("Adicionado com sucesso")
    elif cmd == 2:
        nome = str(input("Digite o nome do produto:")).strip()
        with open(
            file="produtos.csv", mode="r", encoding="utf-8", newline=""
        ) as csvfileread:
            lines = csv.DictReader(csvfileread, fieldnames=headers)
            items = []
            for row in lines:
                if row["nome"] != nome:
                    items.append(row)
            with open(
                file="produtos.csv", mode="w", encoding="utf-8", newline=""
            ) as csvfilewrite:
                writer = csv.DictWriter(csvfilewrite, fieldnames=headers)
                if len(items) == 0:
                    writer.writeheader()
                writer.writerows(items)
        print("Removido com sucesso!")
    elif cmd == 3:
        nome = str(input("Digite o nome do produto:")).strip()
        quantidade = int(input("Digite a quantidade do produto:"))
        with open(
            file="produtos.csv", mode="r", encoding="utf-8", newline=""
        ) as csvfileread:
            lines = csv.DictReader(csvfileread, fieldnames=headers)
            items = []
            for row in lines:
                if row["nome"] == nome:
                    items.append({"nome": nome, "quantidade": quantidade})
                else:
                    items.append(row)
            with open(
                file="produtos.csv", mode="w", encoding="utf-8", newline=""
            ) as csvfilewrite:
                writer = csv.DictWriter(csvfilewrite, fieldnames=headers)
                if len(items) == 0:
                    writer.writeheader()
                writer.writerows(items)
        print("Editado com sucesso!")
    elif cmd == 4:
        nome = str(input("Digite o nome do produto:")).strip()
        with open(
            file="produtos.csv", mode="r", encoding="utf-8", newline=""
        ) as csvfileread:
            lines = csv.DictReader(csvfileread, fieldnames=headers)
            for row in lines:
                if row["nome"] == nome:
                    print(row)
                    break
    elif cmd == 5:
        with open(
            file="produtos.csv", mode="r", encoding="utf-8", newline=""
        ) as csvfileread:
            items = []
            lines = csv.DictReader(csvfileread, fieldnames=headers)
            for line in lines:
                if len(items) != 0:
                    print(line)
                items.append(line)
    elif cmd == 99:
        break
