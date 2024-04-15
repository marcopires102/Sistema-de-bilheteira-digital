package net.javaguides.springbootkafkatutorial.kafka;

import net.javaguides.springbootkafkatutorial.payload.Atualizado;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

// fazer a soma das senhas
@Service
public class JsonKafkaConsumerAtualizado {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumerAtualizado.class);

    @KafkaListener(topics = "CalcularPreco", groupId = "${spring.kafka.consumer.group-id}")

    public void consume(Atualizado atualizado){
        String tituloTransporte = atualizado.getTituloTransporte();
        int quantidade = atualizado.getquantidade();
        double preco = atualizado.getpreco();


        System.out.println("A quantidade de " + tituloTransporte+"  selecionada é " +  quantidade + " e o preço é " + preco);

    }


}

