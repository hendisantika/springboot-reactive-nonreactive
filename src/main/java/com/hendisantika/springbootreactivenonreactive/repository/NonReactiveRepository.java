package com.hendisantika.springbootreactivenonreactive.repository;

import com.hendisantika.springbootreactivenonreactive.model.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-reactive-nonreactive
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 25/02/20
 * Time: 17.51
 */
@Repository
public interface NonReactiveRepository extends MongoRepository<Message, String> {

}