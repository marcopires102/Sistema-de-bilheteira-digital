package net.javaguides.springbootkafkatutorial.kafka;

import net.javaguides.springbootkafkatutorial.payload.Multibanco;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducerMultibanco {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducerMultibanco.class);

    private static KafkaTemplate<String, Multibanco> kafkaTemplate;

    public JsonKafkaProducerMultibanco(KafkaTemplate<String, Multibanco> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public static void sendMessage(Multibanco data){

        LOGGER.info(String.format("Message sent -> %s", data.toString()));

        Message<Multibanco> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "selecionarMb")
                .build();

        kafkaTemplate.send(message);
    }
}