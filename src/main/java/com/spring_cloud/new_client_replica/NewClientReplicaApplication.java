package com.spring_cloud.new_client_replica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NewClientReplicaApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewClientReplicaApplication.class, args);
    }

}
