package com.example;

import java.util.ArrayList;

class NotaFiscal {
    private ArrayList<ItemCompra> itens;

    public NotaFiscal() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        if (produto.getEstoque() >= quantidade) {
            itens.add(new ItemCompra(produto, quantidade));
            produto.setEstoque(produto.getEstoque() - quantidade);
            System.out.println("Item adicionado à nota fiscal: " + produto.getNome());
        } else {
            System.out.println("Estoque insuficiente para adicionar o item: " + produto.getNome());
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCompra item : itens) {
            total += item.getProduto().getPreco() * item.getQuantidade();
        }
        return total;
    }

    public void gerarRelatorio() {
        System.out.println("Itens da nota fiscal:");
        for (ItemCompra item : itens) {
            System.out.println(item.getQuantidade() + "x " + item.getProduto().getNome());
        }
        System.out.println("Total da compra: R$" + calcularTotal());
    }
}
