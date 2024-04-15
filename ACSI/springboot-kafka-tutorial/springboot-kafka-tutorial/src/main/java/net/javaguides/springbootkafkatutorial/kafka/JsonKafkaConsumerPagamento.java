package net.javaguides.springbootkafkatutorial.kafka;

import net.javaguides.springbootkafkatutorial.payload.Pagamento;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class JsonKafkaConsumerPagamento {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumerPagamento.class);

    @KafkaListener(topics = "selecionarMbway", groupId = "${spring.kafka.consumer.group-id}")

    public void consume(Pagamento pagamento){

        int tel = pagamento.gettel();
        String metodoPagamento = pagamento.getmetodoPagamento();


        System.out.println("O metodo de pagamento é " + metodoPagamento +" e o numero é "+ tel);

    }


}

