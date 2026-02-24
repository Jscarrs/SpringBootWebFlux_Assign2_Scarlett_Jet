package com.weekNo.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import com.weekNo.webflux.model.Checking;

@Repository
public interface CheckingRepository extends ReactiveMongoRepository<Checking, String> {

}