package ru.gb.spring.ws.services;

import ru.gb.spring.ws.entities.ProductEntities;
import ru.gb.spring.ws.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.spring.ws.soap.Product;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public static final Function<ProductEntities, Product> functionEntityToSoap = se -> {
        Product p = new Product();
        p.setId(se.getId());
        p.setTitle(se.getTitle());
        p.setPrice(se.getPrice());
        p.setManufacturer(se.getManufacturer());
        return p;
    };

    public List<Product> getAllProducts() {
        return productRepository.findAll().stream().map(functionEntityToSoap).collect(Collectors.toList());
    }


    public Product getByTitle(String title) {
        return productRepository.findByTitle(title).map(functionEntityToSoap).get();
    }
}
