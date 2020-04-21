package br.com.mutaquiha.loja.controller;

import br.com.mutaquiha.loja.dto.Compra;
import br.com.mutaquiha.loja.dto.InfoProdutoDTO;
import br.com.mutaquiha.loja.service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api-loja")
public class LojaController {

    @Autowired
    LojaService lojaService;

    @PostMapping("/compra")
    public ResponseEntity<InfoProdutoDTO> realizaCompra(@RequestBody Compra compra){
        return lojaService.save(compra);
    }
}
