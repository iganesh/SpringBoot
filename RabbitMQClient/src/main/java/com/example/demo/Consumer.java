package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    @RabbitListener(queues = "employee.queue")
    public void listen(Employee emp) {
        System.out.println("Consuming message = " + emp.toString());
    }

}