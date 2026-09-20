package com.amintech.springbasics.controller;

import com.amintech.springbasics.model.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private final List<Produto> produtos = List.of(
            new Produto("Teclado mecânico", 250.00, 10),
            new Produto("Monitor 24\"", 800.00, 5),
            new Produto("Mouse sem fio", 90.00, 20)
    );

    @GetMapping("/hello")
    public String hello() {
        return "Olá! Esta é a primeira API da AminTech Solutions.";
    }

    @GetMapping("/produtos")
    public List<Produto> listarProdutos() {
        return produtos;
    }
}
