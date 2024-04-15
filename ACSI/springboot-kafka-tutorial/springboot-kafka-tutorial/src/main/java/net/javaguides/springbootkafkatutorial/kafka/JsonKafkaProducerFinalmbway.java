package net.javaguides.springbootkafkatutorial.kafka;

import net.javaguides.springbootkafkatutorial.payload.Finalmbway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducerFinalmbway {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducerFinalmbway.class);

    private static KafkaTemplate<String, Finalmbway> kafkaTemplate;

    public JsonKafkaProducerFinalmbway(KafkaTemplate<String, Finalmbway> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public static void sendMessage(Finalmbway data){

        LOGGER.info(String.format("Message sent -> %s", data.toString()));

        Message<Finalmbway> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "Finalmbway1")
                .build();

        kafkaTemplate.send(message);
    }
}