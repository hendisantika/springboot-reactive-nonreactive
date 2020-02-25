package com.hendisantika.springbootreactivenonreactive.controller;

import com.hendisantika.springbootreactivenonreactive.model.Message;
import com.hendisantika.springbootreactivenonreactive.repository.NonReactiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.concurrent.CompletableFuture;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-reactive-nonreactive
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/02/20
 * Time: 17.55
 */
@RestController
public class MVCAsyncController {

    @Autowired
    private NonReactiveRepository nonReactiveRepository;

    @GetMapping("/mvcasync/{id}")
    public CompletableFuture<Message> findById(@PathVariable(value = "id") String id) {
        return CompletableFuture.supplyAsync(() -> nonReactiveRepository.findById(id).orElse(null));
    }

    @PostMapping("/mvcasync")
    public CompletableFuture<Message> post(@Valid @RequestBody Message message) {
        return CompletableFuture.supplyAsync(() -> nonReactiveRepository.save(message));
    }
}
