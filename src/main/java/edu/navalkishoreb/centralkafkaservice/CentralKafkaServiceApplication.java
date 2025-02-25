package edu.navalkishoreb.centralkafkaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.freshworks.boot.common", "com.freshworks.boot.kafka", "edu.navalkishoreb.centralkafkaservice"})
public class CentralKafkaServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(CentralKafkaServiceApplication.class, args);
    }
}
