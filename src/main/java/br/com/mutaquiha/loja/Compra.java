package br.com.mutaquiha.loja;

import br.com.mutaquiha.loja.entity.Endereco;
import br.com.mutaquiha.loja.entity.ItemDaCompra;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Compra {

    private List<ItemDaCompra> itens;
    private Endereco endereco;
}
