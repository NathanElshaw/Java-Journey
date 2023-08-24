package com.kafka.factories;

import org.springframework.kafka.config.TopicBuilder;

public class TopicFactory {

    public static String Create(String input) {
        TopicBuilder.name(input).replicas(3).partitions(10).build();
        return "Built Topic: " + input;
    }
}
