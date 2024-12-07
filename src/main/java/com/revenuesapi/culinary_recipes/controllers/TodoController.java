package com.revenuesapi.culinary_recipes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    // Exemplo de um endpoint GET
    @GetMapping("/todos")
    public String getTodos() {
        return "Aqui estão suas receitas culinárias!";
    }
}
