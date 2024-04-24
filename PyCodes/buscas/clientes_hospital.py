clientes_hospital = {
    "Joao": {"condicao":"Recuperando-se", "medicacao":"Parecetamol", },
    "Maria": {"condicao":"Estável", "medicacao":"Dipirone", },
    "Pedro": {"condicao":"Grave", "medicacao":"Morfina", },
    "Ana": {"condicao":"Estável", "medicacao":"Aspirina", },
}

# def testar_insercao():
#     clientes_hospital.

def testar_iteracao():
    for k,v in clientes_hospital.items():
        print(f"chave {k}")
        print(f"valores: ")
        for k2,v2 in v.items():
            print(f"\t{k2}: {v2}")
    print("\n")
    for i,k in enumerate(clientes_hospital):
        print(f"índice {i}")
        print(f"chave {k}")
    print("\n")
    for v in clientes_hospital:
        print(f"valor {v}")
    print("\n")
    
def if_not_none(arg0):
    if arg0==None: 
        return "Não existe" 
    else:
        return arg0

def testar_atualizar():
    clientes_hospital["Joao"] = {"condicao": "Estável", "medicacao": "Paracetamol"}
    print(f"{clientes_hospital["Joao"]}")
    print(f"{if_not_none(clientes_hospital.get("Jorlan"))}")
    clientes_hospital.update({"Jorlan":  {"condicao": "Grave", "medicacao": "Maconha"}})
    print(f"{if_not_none(clientes_hospital.get("Jorlan"))}")
    clientes_hospital.update({"Joao":  {"condicao": "Deplorável", "medicacao": "Band-aid"}})
    print(f"{clientes_hospital["Joao"]}")

def testar_remover():
    print(clientes_hospital.pop("Joao"))
    del clientes_hospital["Maria"]
    print(if_not_none(clientes_hospital.get("Maria")))

def paciente_existe(paciente):
    return clientes_hospital.get(paciente) != None

def liberar_paciente(paciente):
    if paciente_existe(paciente = paciente):
        deletado = clientes_hospital.pop(paciente)
        print(f"{paciente} em estado {deletado["condicao"]} foi liberado do manicômio!")
    else: print(f"{paciente} não está cadastrado!")

for k,v in dict(clientes_hospital).items():
    liberar_paciente(k)
testar_iteracao()