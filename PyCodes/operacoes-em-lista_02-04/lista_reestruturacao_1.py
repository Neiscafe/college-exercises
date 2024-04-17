def adicionar_imovel(imoveis):
    endereco = input("Digite o endereço do imovel: ")
    preco = float(input("Digite o preço do imovel: "))
    tamanho = float(input("Digite o tamanho do imovel (em metros quadrados): "))
    imoveis.append({
        "Endereço": endereco,
        "Preço": preco,
        "Tamanho": tamanho
    })
    print("Imóvel adicionado com sucesso!")

def listar_imoveis(imoveis):
    if not imoveis:
        print("Não há imóveis cadastrados.")
        return

    print("\n=== Lista de Imóveis ===")
    for i, imovel in enumerate(imoveis, start=1):
        print(f"Imóvel {i}:")
        for chave, valor in imovel.items():
            print(f"{chave}: {valor}")
        print()

def obter_escolha_do_usuario():
    return input("\n1. Adicionar imóvel\n2. Listar imóveis\n3. Sair\nEscolha uma opção: ")

def main():
    imoveis = []
    while True:
        escolha = obter_escolha_do_usuario()

        if escolha == "1":
            adicionar_imovel(imoveis)
        elif escolha == "2":
            listar_imoveis(imoveis)
        elif escolha == "3":
            print("Saindo do programa...")
            break
        else:
            print("Opção inválida. Tente novamente.")

if __name__ == "__main__":
    main()
