package uz.powercorp.common.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static uz.powercorp.common.data.constants.RabbitMQConstants.*;


//@Configuration
public class RabbitMQCommonConfig {
//
//    @Bean
//    public Queue mediaNotificationQueue() {
//        return new Queue(MEDIA_NOTIFICATION_QUEUE, true);
//    }
//
//    @Bean
//    public Queue mediaProfileQueue() {
//        return new Queue(MEDIA_PROFILE_QUEUE, true);
//    }
//
//    @Bean
//    public Queue productNotificationQueue() {
//        return new Queue(PRODUCT_NOTIFICATION_QUEUE, true);
//    }
//    @Bean
//    public TopicExchange mediaExchange() {
//        return new TopicExchange(MEDIA_EXCHANGE);
//    }
//
//    @Bean TopicExchange productExchange() {
//        return new TopicExchange(PRODUCT_EXCHANGE);
//    }
//
//    @Bean
//    public Binding mediaNotificationBinding() {
//        return BindingBuilder.bind(mediaNotificationQueue()).to(mediaExchange()).with(MEDIA_KEY);
//    }
//
//    @Bean
//    public Binding mediaProfileBinding() {
//        return BindingBuilder.bind(mediaProfileQueue()).to(mediaExchange()).with(MEDIA_KEY);
//    }
//
//    @Bean
//    public Binding productNotificationBinding() {
//        return BindingBuilder.bind(productNotificationQueue()).to(productExchange()).with(PRODUCT_KEY);
//    }
//
//    @Bean
//    public Jackson2JsonMessageConverter messageConverter(){
//        return new Jackson2JsonMessageConverter();
//    }



    public static final String QUEUE_NAME = "event.queue";
    public static final String EXCHANGE_NAME = "event.exchange";
    public static final String ROUTING_KEY = "event.routing.key";
    @Bean
    public Queue eventQueue() {
        return new Queue(QUEUE_NAME, true);
    }

    @Bean
    public TopicExchange exchange(){
        return new TopicExchange(EXCHANGE_NAME);
    }

    @Bean
    public Binding binding(Queue eventQueue, TopicExchange exchange){
        return BindingBuilder.bind(eventQueue).to(exchange).with(ROUTING_KEY);
    }

    @Bean
    public Jackson2JsonMessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }

}
