package net.javaguides.springbootkafkatutorial.kafka;

import net.javaguides.springbootkafkatutorial.payload.Pagamento;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducerPagamento {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducerPagamento.class);

    private static KafkaTemplate<String, Pagamento> kafkaTemplate;

    public JsonKafkaProducerPagamento(KafkaTemplate<String, Pagamento> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public static void sendMessage(Pagamento data){

        LOGGER.info(String.format("Message sent -> %s", data.toString()));

        Message<Pagamento> message = MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "selecionarMbway")
                .build();

        kafkaTemplate.send(message);
    }
}