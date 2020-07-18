package com.restaurant.restaurant.webservices.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {

        @Autowired RecipeRepository repository;

        public List<Recipe> findAll(){
            return repository.findAll();
        }

        public Recipe save(Recipe recipe){ return repository.save(recipe);}
}
