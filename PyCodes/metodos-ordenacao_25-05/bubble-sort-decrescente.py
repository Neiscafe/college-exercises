lista = [1,2,13,4,5,36,7,8]
num_indices = len(lista)

while num_indices > 1:
    trocou = False
    posicao = 0
    
    while posicao<(num_indices-1):
        if lista[posicao] < lista[posicao+1]:
            trocou = True
            temp = lista[posicao]
            lista[posicao] = lista[posicao+1]
            lista[posicao+1] = temp
        posicao +=1
    if not trocou:
        break
    num_indices -=1

for e in lista:
    print(e)