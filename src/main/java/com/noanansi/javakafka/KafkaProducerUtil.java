package com.noanansi.javakafka;

import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;

public final class KafkaProducerUtil {

  private static final KafkaProducer<String, String> producer;

  static {
    final var properties = new Properties();
    properties
        .setProperty(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, System.getenv("bootstrap-servers"));
    properties
        .setProperty(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
    properties.setProperty(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
        StringSerializer.class.getName());
    producer = new KafkaProducer(properties);
  }

  public static void sendSynchronous(final String topicName, final String payload) {
    final var record = new ProducerRecord<String, String>(topicName, payload);
    producer.send(record);
    producer.flush();
  }

}
