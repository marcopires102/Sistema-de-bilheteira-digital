package net.javaguides.springbootkafkatutorial.controller;

import net.javaguides.springbootkafkatutorial.payload.Pagamento;
import net.javaguides.springbootkafkatutorial.payload.Finalmultibanco;
import net.javaguides.springbootkafkatutorial.payload.Dadosiniciais;
import net.javaguides.springbootkafkatutorial.payload.Atualizado;
import net.javaguides.springbootkafkatutorial.payload.Multibanco;
import net.javaguides.springbootkafkatutorial.payload.Finalmbway;
import net.javaguides.springbootkafkatutorial.kafka.JsonKafkaProducerAtualizado;
import net.javaguides.springbootkafkatutorial.kafka.JsonKafkaProducerDadosiniciais;
import net.javaguides.springbootkafkatutorial.kafka.JsonKafkaProducerFinalmultibanco;
import net.javaguides.springbootkafkatutorial.kafka.JsonKafkaProducerPagamento;
import net.javaguides.springbootkafkatutorial.kafka.JsonKafkaProducerMultibanco;
import net.javaguides.springbootkafkatutorial.kafka.JsonKafkaProducerFinalmbway;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private Dadosiniciais dadosiniciais = new Dadosiniciais();
    private Atualizado atualizado = new Atualizado();
    private Pagamento pagamento = new Pagamento();
    private Multibanco multibanco = new Multibanco();
    private Finalmbway finalmbway = new Finalmbway();
    private Finalmultibanco finalmultibanco = new Finalmultibanco();
    private final JsonKafkaProducerDadosiniciais kafkaProducerDadosiniciais;
    private final JsonKafkaProducerAtualizado kafkaProducerAtualizado;
    private final JsonKafkaProducerPagamento kafkaProducerPagamento;
    private final JsonKafkaProducerMultibanco kafkaProducerMultibanco;
    private final JsonKafkaProducerFinalmbway kafkaProducerFinalmbway;
    private final JsonKafkaProducerFinalmultibanco kafkaProducerFinalmultibanco;


    public JsonMessageController(@Qualifier("jsonKafkaProducerDadosiniciais") JsonKafkaProducerDadosiniciais kafkaProducerDadosiniciais,
                                 @Qualifier("jsonKafkaProducerAtualizado") JsonKafkaProducerAtualizado kafkaProducerAtualizado,
                                 @Qualifier("jsonKafkaProducerMultibanco") JsonKafkaProducerMultibanco kafkaProducerMultibanco,
                                 @Qualifier("jsonKafkaProducerFinalmbway") JsonKafkaProducerFinalmbway kafkaProducerFinalmbway,
                                 @Qualifier("jsonKafkaProducerFinalmultibanco") JsonKafkaProducerFinalmultibanco kafkaProducerFinalmultibanco,
                                    @Qualifier("jsonKafkaProducerPagamento") JsonKafkaProducerPagamento kafkaProducerPagamento) {
        this.kafkaProducerDadosiniciais = kafkaProducerDadosiniciais;
        this.kafkaProducerAtualizado = kafkaProducerAtualizado;
        this.kafkaProducerMultibanco = kafkaProducerMultibanco;
        this.kafkaProducerFinalmultibanco = kafkaProducerFinalmultibanco;
        this.kafkaProducerFinalmbway = kafkaProducerFinalmbway;
        this.kafkaProducerPagamento = kafkaProducerPagamento;
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publishDadosiniciais(@RequestBody Dadosiniciais user){
        kafkaProducerDadosiniciais.sendMessage(user);
        dadosiniciais = user;
        return ResponseEntity.ok("Json");
    }

    @PostMapping("/publish2")
    public ResponseEntity<String> publishAtualizado(@RequestBody Atualizado user2){
        kafkaProducerAtualizado.sendMessage(user2);
        atualizado = user2;
        return ResponseEntity.ok("Json message sent to kafka topic javaguides_json_atualizado");
    }

    @PostMapping("/publish3")
    public ResponseEntity<String> publishPagamento(@RequestBody Pagamento user2){
        kafkaProducerPagamento.sendMessage(user2);
        pagamento = user2;
        return ResponseEntity.ok("Jppp");
    }

    @PostMapping("/publish4")
    public ResponseEntity<String> publishFinalmbway(@RequestBody Finalmbway user2){
        kafkaProducerFinalmbway.sendMessage(user2);
        finalmbway = user2;
        return ResponseEntity.ok("Jppp");
    }

    @PostMapping("/publish5")
    public ResponseEntity<String> publishMultibanco(@RequestBody Multibanco user2){
        kafkaProducerMultibanco.sendMessage(user2);
        multibanco = user2;
        return ResponseEntity.ok("Jppp");
    }

    @PostMapping("/publish6")
    public ResponseEntity<String> publishFinalmultibanco(@RequestBody Finalmultibanco user2){
        kafkaProducerFinalmultibanco.sendMessage(user2);
        finalmultibanco = user2;
        return ResponseEntity.ok("Jppp");
    }







    @GetMapping("/getDadosiniciais")
    public Dadosiniciais getDadosiniciais(){
        return dadosiniciais;
    }

    @GetMapping("/getAtualizado")
    public Atualizado getAtualizado() {
        return atualizado;
    }

    @GetMapping("/getAtualizado1")
    public Pagamento getPagamento() {
        return pagamento;
    }

    @GetMapping("/getAtualizado2")
    public Multibanco getMultibanco() {
        return multibanco;
    }

    @GetMapping("/getAtualizado3")
    public Finalmbway getFinalmbway() {
        return finalmbway;
    }


    @GetMapping("/getAtualizado4")
    public Finalmultibanco getFinalmultibanco() {
    return finalmultibanco;
}
    }

