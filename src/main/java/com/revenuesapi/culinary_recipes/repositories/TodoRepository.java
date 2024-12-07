package com.revenuesapi.culinary_recipes.repositories;

import com.revenuesapi.culinary_recipes.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    // Você pode adicionar métodos de consulta personalizados aqui, se necessário
}
