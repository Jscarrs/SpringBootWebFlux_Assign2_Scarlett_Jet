package com.weekNo.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.weekNo.webflux.model.Saving;
import com.weekNo.webflux.repository.SavingRepository;

@RestController
@RequestMapping("/saving")
public class SavingController {

    @Autowired
    private SavingRepository repository;

    @PostMapping
    public Mono<Saving> create(@RequestBody Saving saving) {
        return repository.save(saving);
    }

    @GetMapping
    public Flux<Saving> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Saving> getById(@PathVariable String id) {
        return repository.findById(id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return repository.deleteById(id);
    }
}