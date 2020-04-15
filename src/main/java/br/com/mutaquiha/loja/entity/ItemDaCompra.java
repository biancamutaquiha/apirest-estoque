package br.com.mutaquiha.loja.entity;

import lombok.Getter;
import lombok.Setter;

public class ItemDaCompra {

    private long id;

    private int quantidade;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
