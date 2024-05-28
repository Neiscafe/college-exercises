notas_da_turma = []

while True:
    try:
        nota = float(input("Digite uma nota ou um valor negativo para encerrar: "))
    except ValueError:
        print("Por favor, digite um número válido.")
        continue

    if nota < 0:
        break
    else:
        notas_da_turma.append(nota)

print("Lista completa de notas:")
for nota in notas_da_turma:
    print(nota)