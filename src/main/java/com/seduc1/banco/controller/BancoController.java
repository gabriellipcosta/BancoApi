package com.seduc1.banco.controller;

import com.seduc1.banco.entity.Banco;
import com.seduc1.banco.repositores.BancoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.antlr.v4.runtime.tree.xpath.XPath.findAll;

@RestController
@RequestMapping("/api/banco")
public class BancoController {


    @Autowired
    private final BancoRepository repository;
    public BancoController(BancoRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Banco> mostrar(){
        return repository.findAll();
    }

    @PostMapping
    public void criar (@RequestBody Banco b){
        repository.save(b);
    }
}
