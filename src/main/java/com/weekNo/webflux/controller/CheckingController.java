package com.weekNo.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import com.weekNo.webflux.model.Checking;
import com.weekNo.webflux.repository.CheckingRepository;

@RestController
@RequestMapping("/checking")
public class CheckingController {

    @Autowired
    private CheckingRepository repository;

    @PostMapping
    public Mono<Checking> create(@RequestBody Checking checking) {
        return repository.save(checking);
    }

    @GetMapping
    public Flux<Checking> getAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Checking> getById(@PathVariable String id) {
        return repository.findById(id);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return repository.deleteById(id);
    }
}