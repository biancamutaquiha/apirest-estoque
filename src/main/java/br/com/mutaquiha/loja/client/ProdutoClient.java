package br.com.mutaquiha.loja.client;

import br.com.mutaquiha.loja.dto.InfoProdutoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@FeignClient("produto")
public interface ProdutoClient {

    @RequestMapping("api/produtos/{id}")
    Optional<InfoProdutoDTO> findById(@PathVariable long id);
}
