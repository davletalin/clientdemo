package kz.davletalin.fibo.rabbitmq;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class Consumer {
    public static void main(String[] args) throws  IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();

        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare("fiboqueue", false, false, false, null);
        channel.basicConsume("fiboqueue", true, (consumerTag, delivery) -> {
            String m=new String(delivery.getBody(),"UTF-8");
            System.out.println("I just received a message = "+m);
        }, consumerTag -> {});


    }
}
