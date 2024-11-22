package com.example.dining.repository;
import com.example.dining.model.RatingModel;
import com.example.dining.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

// =======================================================
// REPOSITÓRIO DA TABELA "RATING"
// =======================================================

public interface RatingRepository extends JpaRepository<RatingModel, String> {
    List<RatingModel> findByUserId(Long userId);
}
