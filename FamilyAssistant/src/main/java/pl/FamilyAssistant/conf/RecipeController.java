package pl.FamilyAssistant.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RecipeController {
    @Autowired
    RecipeRepository recipeRepository;

    @GetMapping("/recipes")
    public List<Recipe> recipes() {
        return recipeRepository.getAllRecipes();
    }

    @GetMapping("/random/breakfast")
    public List<Recipe> randomBreakfast() {
        return recipeRepository.getAllRecipes();
    }
}
