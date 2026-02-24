package com.weekNo.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.weekNo.webflux.model.Account;
import com.weekNo.webflux.service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountService service;

    @PostMapping
    public Mono<Account> create(@RequestBody Account account) {
        return service.create(account);
    }

    @GetMapping
    public Flux<Account> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public Mono<Account> getById(@PathVariable String id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return service.delete(id);
    }
    
    @PutMapping("/{id}")
    public Mono<Account> update(@PathVariable String id, @RequestBody Account account) {
        return service.update(id, account);
    }
}