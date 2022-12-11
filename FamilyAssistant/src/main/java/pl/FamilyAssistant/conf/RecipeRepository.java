package pl.FamilyAssistant.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecipeRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Recipe> getAllRecipes() {
        return jdbcTemplate.query("SELECT * FROM recipe", BeanPropertyRowMapper.newInstance(Recipe.class));
    }

    public List<Recipe> getRecipe() {
        return jdbcTemplate.query("SELECT * FROM recipe where id = 1", BeanPropertyRowMapper.newInstance(Recipe.class));
    }
}
