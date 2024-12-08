package com.revenuesapi.culinary_recipes.repositories;

import com.revenuesapi.culinary_recipes.models.CulinaryBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CulinaryBookRepository extends JpaRepository<CulinaryBook, Long> {
    // Métodos personalizados, se necessário
}
