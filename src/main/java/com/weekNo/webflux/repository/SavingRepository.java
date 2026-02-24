package com.weekNo.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import com.weekNo.webflux.model.Saving;

@Repository
public interface SavingRepository extends ReactiveMongoRepository<Saving, String> {

}