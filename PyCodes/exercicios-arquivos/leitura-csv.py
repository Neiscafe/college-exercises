import csv
with open("Pasta1.csv", newline='') as csvfile:
    spamreader = csv.reader(csvfile, delimiter=" ")
    next(spamreader)
    valorSomado = 0
    for row in spamreader:
        valor = row[0].split(",")
        valorSomado+=int(valor[1])
    print(f"A média é: {valorSomado/spamreader.line_num}")