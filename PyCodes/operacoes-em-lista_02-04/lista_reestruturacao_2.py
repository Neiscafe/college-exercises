def calcular_media(notas):
    return sum(notas) / len(notas)

def coletar_dados_alunos(num_alunos):
    alunos = []
    for i in range(num_alunos):
        nome = input(f'Informe o nome do aluno {i+1}: ')
        while True:
            try:
                nota = float(input(f'Informe a nota de {nome}: '))
                if 0 <= nota <= 10:
                    break
                else:
                    print("Por favor, insira uma nota entre 0 e 10.")
            except ValueError:
                print("Por favor, insira um valor numérico válido.")
        alunos.append((nome, nota))
    return alunos

def parabenizar_alunos(alunos, media):
    print(f'A média da turma é {media:.2f}.')
    for nome, nota in alunos:
        if nota > media:
            print(f'Parabéns, {nome}!')

def main():
    num_alunos = int(input("Informe o número de alunos na turma: "))
    alunos = coletar_dados_alunos(num_alunos)
    notas = [nota for _, nota in alunos]
    media = calcular_media(notas)
    parabenizar_alunos(alunos, media)

if __name__ == "__main__":
    main()