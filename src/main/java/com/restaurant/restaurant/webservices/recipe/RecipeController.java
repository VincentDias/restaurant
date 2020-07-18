package com.restaurant.restaurant.webservices.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
@CrossOrigin
public class RecipeController {

    @Autowired RecipeService service;

    @GetMapping()
    public List<Recipe> getAll(){
        return service.findAll();
    }

    @PostMapping()
    public Recipe post(@RequestBody Recipe recipe){
        return service.save(recipe);
    }
}
