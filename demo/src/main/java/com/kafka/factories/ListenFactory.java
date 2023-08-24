package com.kafka.factories;

import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.producer.Producer;

public class ListenFactory {
    interface ProducerListener<K, V> {
        default void producerAdded(String id, Producer<K, V> producer) {

        }

        default void producerRemoved(String id, Producer<K, V> producer) {

        }
    }

    interface ConsumerListener<K, V> {
        default void consumerAdded(String id, Consumer<K, V> producer) {

        }

        default void consumerRemoved(String id, Consumer<K, V> producer) {

        }
    }
}
