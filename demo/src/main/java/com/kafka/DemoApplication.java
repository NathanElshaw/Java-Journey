package com.kafka;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kafka.config.KafkaTopicConfig;
import com.kafka.domain.CustomerVistsEvent;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private ObjectMapper objectMapper;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public ApplicationRunner runner(final KafkaTemplate<String, String> kafkaTemplate,
			final KafkaTopicConfig KafkaTopicConfig) throws JsonProcessingException {
		final CustomerVistsEvent event = CustomerVistsEvent.builder()
				.customerId(UUID.randomUUID().toString())
				.dateTime(LocalDateTime.now())
				.build();

		final String payload = objectMapper.writeValueAsString(event);

		return args -> {
			kafkaTemplate.send(KafkaTopicConfig.getTopic(), payload);
		};
	}

	@KafkaListener(topics = "customer.visit")
	public String listens(final String in) {
		final String user = UUID.randomUUID().toString();
		System.out.println(user + " :" + in);
		return in;
	}
}
