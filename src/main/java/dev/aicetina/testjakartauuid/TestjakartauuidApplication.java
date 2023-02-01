package dev.aicetina.testjakartauuid;

import dev.aicetina.testjakartauuid.model.Product;
import dev.aicetina.testjakartauuid.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class TestjakartauuidApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestjakartauuidApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository) {
        return args -> {
            List<Product> products = List.of(new Product("Product 1"), new Product("Product 2"), new Product("Product 3"));
            productRepository.saveAll(products);

            productRepository.findAll().stream().forEach(System.out::println);
        };
    }

}
