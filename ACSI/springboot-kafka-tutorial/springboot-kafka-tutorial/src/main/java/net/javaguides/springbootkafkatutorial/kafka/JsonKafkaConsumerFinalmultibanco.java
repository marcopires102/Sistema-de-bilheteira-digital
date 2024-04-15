package net.javaguides.springbootkafkatutorial.kafka;

import net.javaguides.springbootkafkatutorial.payload.Finalmultibanco;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

// fazer a soma das senhas
@Service
public class JsonKafkaConsumerFinalmultibanco {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumerFinalmultibanco.class);

    @KafkaListener(topics = "Finalmultibanco1", groupId = "${spring.kafka.consumer.group-id}")

    public void consume(Finalmultibanco finalmultibanco){
        String tituloTransporte = finalmultibanco.getTituloTransporte();
        int quantidade = finalmultibanco.getquantidade();
        double preco = finalmultibanco.getpreco();
        String referencia = finalmultibanco.getreferencia();
        int entidade = finalmultibanco.getentidade();
        String metodoPagamento1 = finalmultibanco.getmetodoPagamento1();

        System.out.println("Tipo: "+ tituloTransporte+ " Quantidade: "+ quantidade+ " Preço: " + preco+ " Entidade: " + entidade +" Referencia: "+referencia+ " Metodo Pagamento: " + metodoPagamento1);

    }


}

