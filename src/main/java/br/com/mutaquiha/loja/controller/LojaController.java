package br.com.mutaquiha.loja.controller;

import br.com.mutaquiha.loja.dto.Compra;
import br.com.mutaquiha.loja.service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api-loja")
public class LojaController {

    @Autowired
    LojaService lojaService;

    @PostMapping("/compra")
    public void realizaCompra(@RequestBody Compra compra){
        lojaService.save(compra);
    }
}
