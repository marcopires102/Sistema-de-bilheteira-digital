package net.javaguides.springbootkafkatutorial.kafka;

import net.javaguides.springbootkafkatutorial.payload.Atualizado;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducerAtualizado {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducerAtualizado.class);

    private static KafkaTemplate<String, Atualizado> kafkaTemplate;

    public JsonKafkaProducerAtualizado(KafkaTemplate<String, Atualizado> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public static void sendMessage(Atualizado data){

        LOGGER.info(String.format("Message sent -> %s", data.toString()));

        Message<Atualizado> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "CalcularPreco")
                .build();

        kafkaTemplate.send(message);
    }
}