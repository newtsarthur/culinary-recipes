package com.revenuesapi.culinary_recipes.controllers;

import com.revenuesapi.culinary_recipes.models.CulinaryBook;
import com.revenuesapi.culinary_recipes.services.CulinaryBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/culinary-books")
public class CulinaryBookController {

    @Autowired
    private CulinaryBookService culinaryBookService;

    // Create a new culinary book
    @PostMapping
    public ResponseEntity<CulinaryBook> createCulinaryBook(@RequestBody CulinaryBook culinaryBook) {
        CulinaryBook createdBook = culinaryBookService.createCulinaryBook(culinaryBook);
        return new ResponseEntity<>(createdBook, HttpStatus.CREATED);
    }

    // Get all culinary books
    @GetMapping
    public ResponseEntity<List<CulinaryBook>> getAllCulinaryBooks() {
        List<CulinaryBook> books = culinaryBookService.getAllCulinaryBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    // Get a culinary book by ID
    @GetMapping("/{id}")
    public ResponseEntity<CulinaryBook> getCulinaryBookById(@PathVariable Long id) {
        CulinaryBook book = culinaryBookService.getCulinaryBookById(id);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    // Update a culinary book
    @PutMapping("/{id}")
    public ResponseEntity<CulinaryBook> updateCulinaryBook(@PathVariable Long id, @RequestBody CulinaryBook culinaryBook) {
        CulinaryBook updatedBook = culinaryBookService.updateCulinaryBook(id, culinaryBook);
        return new ResponseEntity<>(updatedBook, HttpStatus.OK);
    }

    // Delete a culinary book
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCulinaryBook(@PathVariable Long id) {
        culinaryBookService.deleteCulinaryBook(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
