package com.example.dining.repository;
import com.example.dining.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

// =======================================================
// REPOSITÓRIO DA TABELA "USER"
// =======================================================

public interface UserRepository extends JpaRepository<UserModel, String> {
}
