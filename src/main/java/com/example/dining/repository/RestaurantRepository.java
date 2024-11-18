package com.example.dining.repository;
import com.example.dining.model.RestaurantModel;
import org.springframework.data.jpa.repository.JpaRepository;

// =======================================================
// REPOSITÓRIO DA TABELA "RESTAURANT"
// =======================================================

public interface RestaurantRepository extends JpaRepository<RestaurantModel, String> {
  
}
