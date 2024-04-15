package net.javaguides.springbootkafkatutorial.kafka;

import net.javaguides.springbootkafkatutorial.payload.Multibanco;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class JsonKafkaConsumerMultibanco {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumerMultibanco.class);

    @KafkaListener(topics = "selecionarMb", groupId = "${spring.kafka.consumer.group-id}")

    public void consume(Multibanco multibanco){

        String referencia = multibanco.getreferencia();
        int entidade = multibanco.getentidade();
        String metodoPagamento1 = multibanco.getmetodoPagamento1();


        System.out.println("A referecia é "+ referencia+" e a entidade é " + entidade+" e o metodo de pagamento é "+ metodoPagamento1);

    }


}

