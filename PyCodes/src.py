import random
import time
import locale

def randomize():
    return random.randrange(0, 1)

locale.setlocale(locale.LC_ALL, '')
apostas = []
valorApostaUsuario = 1.0

while(valorApostaUsuario!=0):
    valorApostaUsuario = float(input("Hora de apostar na sinuca (Dwayne Johnson vs Magnus Carlsen): aposte um valor ou zero para finalizar: "))
    if(valorApostaUsuario==0):
        break
    jogadorApostaUsuario = int(input("Escolha em qual jogador está apostando: (0 para J1, 1 para J2)"))
    if(jogadorApostaUsuario not in range(0,2)):
        break
    apostas.append({"valor": valorApostaUsuario, "jogador": jogadorApostaUsuario})
    
print("Aguardando final do jogo...")
time.sleep(1)
print("Esperando a jogada decisiva.. ")
time.sleep(1)
resultadoPartida = randomize() % 2
listPosition = 0
for a in apostas:
    listPosition = listPosition + 1
    if(a["jogador"]==resultadoPartida):
        print("O apostador {0} acertou o resultado e ganhou {1} reais!".format(listPosition, a["valor"]))
    else:
        print("O apostador {0} acertou o resultado e perdeu {1} reais!".format(listPosition, a["valor"]))
        
