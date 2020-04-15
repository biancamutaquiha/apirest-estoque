package br.com.mutaquiha.loja.dto;

import java.util.List;

public class Compra {

    private List<ItemDaCompra> itens;

    public List<ItemDaCompra> getItens() {
        return itens;
    }

    public void setItens(List<ItemDaCompra> itens) {
        this.itens = itens;
    }

}
