package br.com.mutaquiha.loja.service;

import br.com.mutaquiha.loja.entity.Compra;
import br.com.mutaquiha.loja.entity.InfoProdutoDTO;
import br.com.mutaquiha.loja.entity.ItemDaCompra;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LojaService {

    public void save(Compra compra) {

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<InfoProdutoDTO> exchange = restTemplate.exchange("http://localhost:8080/api"+compra.getItens().get(0).getId(),
                HttpMethod.GET, null, InfoProdutoDTO.class);
    }
}
