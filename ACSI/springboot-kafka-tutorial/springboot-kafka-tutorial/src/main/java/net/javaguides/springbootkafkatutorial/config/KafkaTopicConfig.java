package net.javaguides.springbootkafkatutorial.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic javaguidesTopic(){
        return TopicBuilder.name("javaguides")
                .build();
    }

    @Bean
    public NewTopic selecionartTituloTransporteTopic(){
        return TopicBuilder.name("selecionartTituloTransporte")
                .build();
    }
    @Bean
    public NewTopic CalcularPrecoTopic(){
        return TopicBuilder.name("CalcularPreco")
                .build();
    }
    @Bean
    public NewTopic pagamentoTopic(){
        return TopicBuilder.name("selecionarMbway")
                .build();
    }
    @Bean
    public NewTopic pagamentomultiTopic(){
        return TopicBuilder.name("selecionarMb")
                .build();
    }
    @Bean
    public NewTopic Finalmbway1Topic(){
        return TopicBuilder.name("Finalmbway1")
                .build();
    }

    @Bean
    public NewTopic Finalmultibanco1Topic(){
        return TopicBuilder.name("Finalmultibanco1")
                .build();
    }

}