package net.javaguides.springbootkafkatutorial.kafka;

import net.javaguides.springbootkafkatutorial.payload.Dadosiniciais;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


@Service
public class JsonKafkaConsumerDadosiniciais {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumerDadosiniciais.class);

    @KafkaListener(topics = "selecionartTituloTransporte", groupId = "${spring.kafka.consumer.group-id}")

    public void consume(Dadosiniciais dadosiniciais){
        String tituloTransporte = dadosiniciais.getTituloTransporte();
        int quantidade = dadosiniciais.getquantidade();



        System.out.println("A quantidade de " + tituloTransporte+"  selecionada é " +  quantidade);

    }


}

