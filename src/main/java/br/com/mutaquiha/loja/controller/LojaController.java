package br.com.mutaquiha.loja.controller;

import br.com.mutaquiha.loja.entity.Compra;
import br.com.mutaquiha.loja.service.LojaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api-loja")
public class LojaController {

    @Autowired
    LojaService lojaService;

    @PostMapping
    public void realizaCompra(@RequestBody Compra compra){
        lojaService.save(compra);
    }
}
