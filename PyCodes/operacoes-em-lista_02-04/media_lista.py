lista1 = [2.5, 7.5, 10.0, 4.0]
media = sum(lista1)/len(lista1)
maisProximoMedia = min(lista1, key = lambda x: abs(x-media))
print(lista1)
print(media)
print(maisProximoMedia)