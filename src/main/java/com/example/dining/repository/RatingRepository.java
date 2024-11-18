package com.example.dining.repository;
import com.example.dining.model.RatingModel;
import org.springframework.data.jpa.repository.JpaRepository;

// =======================================================
// REPOSITÓRIO DA TABELA "RATING"
// =======================================================

public interface RatingRepository extends JpaRepository<RatingModel, String> {
}
