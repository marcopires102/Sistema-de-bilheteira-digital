package net.javaguides.springbootkafkatutorial.kafka;

import net.javaguides.springbootkafkatutorial.payload.Finalmultibanco;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducerFinalmultibanco {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducerFinalmultibanco.class);

    private static KafkaTemplate<String, Finalmultibanco> kafkaTemplate;

    public JsonKafkaProducerFinalmultibanco(KafkaTemplate<String, Finalmultibanco> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public static void sendMessage(Finalmultibanco data){

        LOGGER.info(String.format("Message sent -> %s", data.toString()));

        Message<Finalmultibanco> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "Finalmultibanco1")
                .build();

        kafkaTemplate.send(message);
    }
}