package br.com.mutaquiha.loja.service;

import br.com.mutaquiha.loja.dto.Compra;
import br.com.mutaquiha.loja.dto.InfoProdutoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LojaService {

    @Autowired
    private RestTemplate restTemplate;

    public void save(Compra compra) {

        ResponseEntity<InfoProdutoDTO> exchange = restTemplate.exchange("http://produto/api/produtos/"+compra.getItens().get(0).getId(),
                HttpMethod.GET, null, InfoProdutoDTO.class);

        System.out.println(exchange.getBody().getNome());
    }
}
