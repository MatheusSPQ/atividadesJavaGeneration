package com.helloworlld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade01")
public class Controller {
    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World ";
    }

    @GetMapping("/bsm")
    public String bsm() {
        return "Comunicação, Proatividade, Orientação ao Detalhe, Trabalho em Equipe";
    }

    @GetMapping("/lista")
    public String lista() {
        return "Aprender spring boot, revisar estrutura de dados";
    }

}
