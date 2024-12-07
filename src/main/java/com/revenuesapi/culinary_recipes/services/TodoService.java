package com.revenuesapi.culinary_recipes.services;

import com.revenuesapi.culinary_recipes.models.Todo;
import com.revenuesapi.culinary_recipes.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    @Autowired
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    // Criar um novo Todo
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    // Buscar todos os Todos
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    // Buscar um Todo pelo ID
    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    // Atualizar um Todo
    public Todo updateTodo(Long id, Todo todoDetails) {
        Todo todo = todoRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo não encontrado"));
        todo.setTitle(todoDetails.getTitle());
        todo.setDescription(todoDetails.getDescription());
        todo.setCompleted(todoDetails.isCompleted());
        return todoRepository.save(todo);
    }

    // Deletar um Todo
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
