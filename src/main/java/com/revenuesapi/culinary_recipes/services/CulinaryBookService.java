package com.revenuesapi.culinary_recipes.services;

import com.revenuesapi.culinary_recipes.models.CulinaryBook;
import com.revenuesapi.culinary_recipes.repositories.CulinaryBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CulinaryBookService {

    @Autowired
    private CulinaryBookRepository culinaryBookRepository;

    // Create a new culinary book
    public CulinaryBook createCulinaryBook(CulinaryBook culinaryBook) {
        return culinaryBookRepository.save(culinaryBook);
    }

    // Get all culinary books
    public List<CulinaryBook> getAllCulinaryBooks() {
        return culinaryBookRepository.findAll();
    }

    // Get a culinary book by ID
    public CulinaryBook getCulinaryBookById(Long id) {
        Optional<CulinaryBook> book = culinaryBookRepository.findById(id);
        if (book.isEmpty()) {
            throw new RuntimeException("Culinary book not found with ID: " + id);
        }
        return book.get();
    }

    // Update a culinary book
    public CulinaryBook updateCulinaryBook(Long id, CulinaryBook culinaryBook) {
        CulinaryBook existingBook = getCulinaryBookById(id);
        existingBook.setTitle(culinaryBook.getTitle());
        existingBook.setAuthor(culinaryBook.getAuthor());
        existingBook.setGenre(culinaryBook.getGenre());
        existingBook.setPublicationDate(culinaryBook.getPublicationDate());
        existingBook.setPublisher(culinaryBook.getPublisher());
        existingBook.setIsbn(culinaryBook.getIsbn());
        existingBook.setPageCount(culinaryBook.getPageCount());
        existingBook.setLanguage(culinaryBook.getLanguage());
        existingBook.setPrice(culinaryBook.getPrice());
        existingBook.setCoverImageUrl(culinaryBook.getCoverImageUrl());
        existingBook.setDescription(culinaryBook.getDescription());
        return culinaryBookRepository.save(existingBook);
    }

    // Delete a culinary book
    public void deleteCulinaryBook(Long id) {
        if (!culinaryBookRepository.existsById(id)) {
            throw new RuntimeException("Culinary book not found with ID: " + id);
        }
        culinaryBookRepository.deleteById(id);
    }
}
