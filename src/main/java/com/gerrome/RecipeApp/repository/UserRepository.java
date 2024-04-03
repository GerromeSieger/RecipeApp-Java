// UserRepository.java
package com.gerrome.RecipeApp.repository;

import com.gerrome.RecipeApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    Object findByEmail(Object email);
}