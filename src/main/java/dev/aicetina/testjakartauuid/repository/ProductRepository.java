package dev.aicetina.testjakartauuid.repository;

import dev.aicetina.testjakartauuid.model.Product;
import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface ProductRepository extends ListCrudRepository<Product, UUID> {
}
