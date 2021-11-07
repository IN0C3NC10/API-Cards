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

    // ..método responsável por buscar todos os dados no MongoDBCloud
    @Override
    public Flux<Cards> findAll() {
        return cr.findAll();
    }

    // ..método responsável por buscar os dados com base no id gerado pelo MongoDBCloud
    @Override
    public Mono<Cards> findById(String id) {
        return cr.findById(id);
    }

    // ..método responsável por inserir os dados no MongoDBCloud
    @Override
    public Mono<Cards> save(Cards cards) {
        return cr.save(cards);
    }

    // ..método responsável por deletar os dados com base no id gerado pelo MongoDBCloud
    @Override
    public Mono<Void> delete(String id) {
        return cr.deleteById(id);
    }
    
}
