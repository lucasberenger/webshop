package com.webservice.Shop.services;

import com.webservice.Shop.entities.Category;
import com.webservice.Shop.entities.User;
import com.webservice.Shop.repositories.CategoryRepository;
import com.webservice.Shop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category>findAll(){
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
