package com.antin.producer.controller;

import com.antin.producer.model.Person;
import com.antin.producer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

/**
 * Created by antin on 2/5/16.
 */
@RestController
public class ProducerController {

    @Autowired
    ProducerService producerService;

    @RequestMapping("/send")
    public String send(@RequestBody Person person) throws ExecutionException, InterruptedException {

        producerService.send(person.getName());
        return "OK";
    }
}
