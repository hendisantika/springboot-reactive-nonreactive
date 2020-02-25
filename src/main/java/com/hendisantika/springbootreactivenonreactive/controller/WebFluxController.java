package com.hendisantika.springbootreactivenonreactive.controller;

import com.hendisantika.springbootreactivenonreactive.model.Message;
import com.hendisantika.springbootreactivenonreactive.repository.ReactiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-reactive-nonreactive
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/02/20
 * Time: 17.56
 */
@RestController
public class WebFluxController {

    @Autowired
    private ReactiveRepository reactiveRepository;

    @GetMapping("/webflux/{id}")
    public Mono<Message> findByIdReactive(@PathVariable(value = "id") String id) {
        return reactiveRepository.findById(id);
    }

    @PostMapping("/webflux")
    public Mono<Message> postReactive(@Valid @RequestBody Message message) {
        return reactiveRepository.save(message);
    }

}
