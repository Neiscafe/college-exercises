import csv
with open("Pasta1.csv", newline='') as csvfile:
    spamreader = csv.reader(csvfile, delimiter=" ")
    next(spamreader)
    valorSomado = 0
    valores = []
    for row in spamreader:
        valor = row[0].split(",")
        valores.append(valor[1])
        valorSomado+=int(valor[1])
    print(f"A média é: {valorSomado/spamreader.line_num}, o máximo é {max(valores)}, e o mínimo é {min(valores)}")