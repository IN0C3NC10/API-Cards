package com.in0c3nc10.apicards.apicards.service;

import com.in0c3nc10.apicards.apicards.model.Cards;
import com.in0c3nc10.apicards.apicards.repository.CardsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CardsServiceImpl implements CardsService{

    @Autowired
    CardsRepository cr;

    @Override
    public Flux<Cards> findAll() {
        return cr.findAll();
    }

    @Override
    public Mono<Cards> findById(String id) {
        return cr.findById(id);
    }

    @Override
    public Mono<Cards> save(Cards cards) {
        return cr.save(cards);
    }

    @Override
    public Mono<Void> delete(String id) {
        return cr.deleteById(id);
    }
    
}
