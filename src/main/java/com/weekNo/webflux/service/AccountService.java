package com.weekNo.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.weekNo.webflux.model.Account;
import com.weekNo.webflux.repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    private AccountRepository repository;

    public Mono<Account> create(Account account) {
        return repository.save(account);
    }

    public Flux<Account> getAll() {
        return repository.findAll();
    }

    public Mono<Account> getById(String id) {
        return repository.findById(id);
    }

    public Mono<Void> delete(String id) {
        return repository.deleteById(id);
    }

    public Mono<Account> update(String id, Account updatedAccount) {
        return repository.findById(id)
                .flatMap(existing -> {
                    existing.setAccountHolder(updatedAccount.getAccountHolder());
                    existing.setBalance(updatedAccount.getBalance());
                    return repository.save(existing);
                });
    }
}