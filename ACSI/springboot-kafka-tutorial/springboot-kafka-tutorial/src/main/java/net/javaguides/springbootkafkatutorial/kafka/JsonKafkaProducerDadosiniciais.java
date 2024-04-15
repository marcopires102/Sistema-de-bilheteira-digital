package net.javaguides.springbootkafkatutorial.kafka;

import net.javaguides.springbootkafkatutorial.payload.Dadosiniciais;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducerDadosiniciais {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducerDadosiniciais.class);

    private static KafkaTemplate<String, Dadosiniciais> kafkaTemplate;

    public JsonKafkaProducerDadosiniciais(KafkaTemplate<String, Dadosiniciais> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public static void sendMessage(Dadosiniciais data){

        LOGGER.info(String.format("Message sent -> %s", data.toString()));

        Message<Dadosiniciais> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "selecionartTituloTransporte")
                .build();

        kafkaTemplate.send(message);
    }
}