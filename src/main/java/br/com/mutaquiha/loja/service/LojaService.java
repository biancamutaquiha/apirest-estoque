package br.com.mutaquiha.loja.service;

import br.com.mutaquiha.loja.client.ProdutoClient;
import br.com.mutaquiha.loja.dto.Compra;
import br.com.mutaquiha.loja.dto.InfoProdutoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class LojaService {

    //@Autowired
    //private RestTemplate restTemplate;
    @Autowired
    private ProdutoClient produtoClient;

    public ResponseEntity<InfoProdutoDTO> save(Compra compra) {

        /*ResponseEntity<InfoProdutoDTO> exchange = restTemplate.exchange("http://produto/api/produtos/"+compra.getItens().get(0).getId(),
                HttpMethod.GET, null, InfoProdutoDTO.class);

        System.out.println(exchange.getBody().getNome());

         */
        Optional<InfoProdutoDTO> info = produtoClient.findById(compra.getItens().get(0).getId());

        if (info.isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
