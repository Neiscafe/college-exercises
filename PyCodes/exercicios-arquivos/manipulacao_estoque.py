import csv

add = "add"
remove = "remove"
edit = "edit"
find = "find"
query = "query"
quit = "quit"
help = "help"
operacoes = [add, remove, edit, find, query, quit, help]
descricoes = [
    "add 'nome' 'quantidade'",
    "remove 'nome'",
    "edit 'nome' 'quantidade'",
    "find 'nome'",
    "query",
    "quit",
    "help",
]
headers = ["nome", "quantidade"]
items = []

while True:
    print("\nDigite um comando ou use 'help' para ver a lista de comandos")
    comando = str(input())
    chaves = comando.split()
    operacao = chaves[0]
    if operacao == quit:
        break
    elif operacao == help:
        for desc in descricoes:
            print(desc)
    elif operacao == add:
        nome = chaves[1]
        quantidade = int(chaves[2])
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
    elif operacao == remove:
        nome = chaves[1]
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
    elif operacao == edit:
        nome = chaves[1]
        quantidade = int(chaves[2])
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
    elif operacao == find:
        nome = chaves[1]
        with open(
            file="produtos.csv", mode="r", encoding="utf-8", newline=""
        ) as csvfileread:
            lines = csv.DictReader(csvfileread, fieldnames=headers)
            for row in lines:
                if row["nome"] == nome:
                    print(row)
                    break
    elif operacao == query:
        with open(
            file="produtos.csv", mode="r", encoding="utf-8", newline=""
        ) as csvfileread:
            items = []
            lines = csv.DictReader(csvfileread, fieldnames=headers)
            for line in lines:
                if len(items) != 0:
                    print(line)
                items.append(line)
    elif comando == 99:
        break
