def openFile(filename = "dados.txt"):
    with open(filename, 'r', encoding='utf-8') as file:
        lines = file.readlines()
        for line in lines:
            print(line.strip())
            
def writeInFile(lines, filename = "dados.txt"):
    with open(filename, 'w', encoding='utf-8') as file:
        for line in lines:    
            file.writelines(line+"\n")
            # file.write("Esta é a primeira linha.\n")
            # file.write("Esta é a segunda linha.\n")
            # file.write("Esta é a terceira linha.\n")
            # file.write("Esta é a quarta linha.\n")
            # file.write("Esta é a quinta linha.\n")

openFile()
writeInFile(["Primeira", "Segunda", "terceira", "quarta", "quinta"])
