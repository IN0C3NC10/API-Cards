package com.in0c3nc10.apicards.apicards.controller;

import com.in0c3nc10.apicards.apicards.model.Cards;
import com.in0c3nc10.apicards.apicards.service.CardsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class CardsController {
    @Autowired
    CardsService service;

    // ..abaixo segue a requisição e a url a qual ele espera, e para qual método (na Service) cada um direciona

    @GetMapping(value = "/cards")
    public Flux<Cards>getCards(){
        return service.findAll();
    }

    @GetMapping(value = "/cards/{id}")
    public Mono<Cards>getCardId(@PathVariable String id){
        return service.findById(id);
    }

    @PostMapping(value="/cards/")
    public Mono<Cards> save(Cards cards) {
        return service.save(cards);
    }

    @DeleteMapping(value="/cards/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return service.delete(id);
    }
}
