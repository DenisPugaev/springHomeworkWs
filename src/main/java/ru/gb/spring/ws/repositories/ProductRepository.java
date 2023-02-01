package ru.gb.spring.ws.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.gb.spring.ws.entities.ProductEntities;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntities, Long> {
    @Query("select p from ProductEntities p where p.title = ?1")
    Optional<ProductEntities> findByTitle(String title);
}
