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

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-reactive-nonreactive
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/02/20
 * Time: 17.54
 */
@RestController
public class MVCSyncController {

    @Autowired
    private NonReactiveRepository nonReactiveRepository;

    @GetMapping("/mvcsync/{id}")
    public Message findById(@PathVariable(value = "id") String id) {
        return nonReactiveRepository.findById(id).orElse(null);
    }

    @PostMapping("/mvcsync")
    public Message post(@Valid @RequestBody Message message) {
        return nonReactiveRepository.save(message);
    }
}

