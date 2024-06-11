lines = []

with open("substituir.txt", "w", encoding="utf-8") as file:
    file.writelines("eu sou humano, \n")
    file.writelines("nao sou humano, \n")
    file.writelines("sou humano")

with open("substituir.txt", "r", encoding="utf-8") as file:
    for line in file.readlines():
        lines.append(line.replace("humano", "minhoca"))
        
with open("substituir.txt", "w", encoding="utf-8") as file:
    for line in lines:
        file.writelines(line)
        