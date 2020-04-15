package br.com.mutaquiha.loja.entity;

import br.com.mutaquiha.loja.entity.Endereco;
import br.com.mutaquiha.loja.entity.ItemDaCompra;

import javax.persistence.Entity;
import java.util.List;

public class Compra {

    private List<ItemDaCompra> itens;
    private Endereco endereco;

    public List<ItemDaCompra> getItens() {
        return itens;
    }

    public void setItens(List<ItemDaCompra> itens) {
        this.itens = itens;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
