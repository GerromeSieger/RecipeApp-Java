package com.gerrome.RecipeApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
    info = @Info(
        title = "Recipe App API",
        version = "1.0",
        description = "API for Recipe App"
    )
)

@SpringBootApplication
public class RecipeAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(RecipeAppApplication.class, args);
    }
}