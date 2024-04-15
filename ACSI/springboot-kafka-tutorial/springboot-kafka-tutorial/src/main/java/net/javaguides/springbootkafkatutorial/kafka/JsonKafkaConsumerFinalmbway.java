package net.javaguides.springbootkafkatutorial.kafka;

import net.javaguides.springbootkafkatutorial.payload.Finalmbway;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

// fazer a soma das senhas
@Service
public class JsonKafkaConsumerFinalmbway {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumerFinalmbway.class);

    @KafkaListener(topics = "Finalmbway1", groupId = "${spring.kafka.consumer.group-id}")

    public void consume(Finalmbway finalmbway){
        String tituloTransporte = finalmbway.getTituloTransporte();
        int quantidade = finalmbway.getquantidade();
        double preco = finalmbway.getpreco();
        int tel = finalmbway.gettel();
        String metodoPagamento = finalmbway.getmetodoPagamento();


        System.out.println("Tipo: "+ tituloTransporte+ " Quantidade: "+ quantidade+ " Preço: " + preco+ " Telemovel: " + tel + " Metodo Pagamento: " + metodoPagamento);

    }


}

