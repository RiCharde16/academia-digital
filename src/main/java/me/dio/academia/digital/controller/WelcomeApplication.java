package me.dio.academia.digital.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeApplication {
    @GetMapping("/")
    public String welcome() {
        return "<h1>Criando uma API RESTfull de uma Academia</h1>"+
        "<h3>Com java + SpringBoot é JPA</h3>"+
        "<p> na barra de pesquisa dps de localhost:8081 digite /alunos</p>"+
        "<p>Para poder fazer alguma requisição POST, DELETE etc baixe o POSTMAN nesse link --> <a href='https://www.postman.com/downloads/' target='_blank'>POSTMAN</a></p>";
    }
}
