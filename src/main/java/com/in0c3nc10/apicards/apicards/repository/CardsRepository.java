package com.in0c3nc10.apicards.apicards.repository;

import org.springframework.stereotype.Repository;

import com.in0c3nc10.apicards.apicards.model.Cards;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

@Repository
public interface CardsRepository extends ReactiveMongoRepository<Cards, String>{
    //
}
