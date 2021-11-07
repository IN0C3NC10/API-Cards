package com.in0c3nc10.apicards.apicards.service;

import com.in0c3nc10.apicards.apicards.model.Cards;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface CardsService {
    Flux<Cards> findAll();
    Mono<Cards> findById(String id);
    Mono<Cards> save(Cards cards);
    Mono<Void> delete(String id);
}
