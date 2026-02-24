package com.weekNo.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import com.weekNo.webflux.model.Account;

@Repository
public interface AccountRepository extends ReactiveMongoRepository<Account, String> {

}