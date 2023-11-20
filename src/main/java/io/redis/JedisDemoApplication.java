package io.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"controllers","services","model", "repository", "dao", "config"})
public class JedisDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(JedisDemoApplication.class, args);
    }
}
