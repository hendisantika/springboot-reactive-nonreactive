package com.hendisantika.springbootreactivenonreactive.controller;

import com.hendisantika.springbootreactivenonreactive.repository.NonReactiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

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
}
