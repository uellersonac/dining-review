package com.example.dining.repository;
import com.example.dining.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// =======================================================
// REPOSITÓRIO DA TABELA "USER"
// =======================================================

public interface UserRepository extends JpaRepository<UserModel, Long> {

    //Métodos já implementados e que podem ser utilizados:



    //Método personalizado usando a estrutura obrigatória do JPA Repository findBy + <Atributo> + <Condicional>
    //Tipo Optional devido à possibilidade de retornar nulo
    Optional<UserModel> findByUsername(String username);
}
