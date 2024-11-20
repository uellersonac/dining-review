package com.example.dining.controller;


// =======================================================
// CLASSE QUE CONTROLA AS REQUISIÇÕES REST
// =======================================================

import com.example.dining.model.UserModel;
import com.example.dining.repository.RatingRepository;
import com.example.dining.repository.RestaurantRepository;
import com.example.dining.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


//DEFININDO SEÇÕES DO SWAGGER
@RestController //Definindo classe como Controlador de Requisições
@RequestMapping("/dining-review") //URL principal (raiz) para as requisições
public class Controller {

//--------------------------------------------------------
//DECLARANDO REPOSITÓRIOS CUJOS MÉTODOS SERÃO UTILIZADOS PELO CONTROLADOR
    private final RatingRepository ratingRepository;
    private final UserRepository userRepository;
    private final RestaurantRepository restaurantRepository;

//--------------------------------------------------------


//--------------------------------------------------------
//CONSTRUTOR DO CONTROLADOR
    public Controller(RatingRepository ratingRepository, UserRepository userRepository,RestaurantRepository restaurantRepository){
        this.ratingRepository = ratingRepository;
        this.userRepository = userRepository;
        this.restaurantRepository = restaurantRepository;
    }
//--------------------------------------------------------


//--------------------------------------------------------
//PROCESSO 1 - POST PERSONAL DATA

    @Operation(
            summary = "Salvar dados pessoais do usuário",
            description = "Este endpoint salva as informações pessoais do usuário no banco de dados.",
            tags = {"User Operations"}
    )
    @PostMapping("/post-personal-data")
    public UserModel postUserPersonalData(@RequestBody UserModel userModel){
        UserModel userModelReturn = this.userRepository.save(userModel);
        return userModelReturn;
    }
//--------------------------------------------------------


//--------------------------------------------------------
//PROCESSO 2 - GET USER PERSONAL DATA
    @GetMapping("/get-user-personal-data/{id}")
    public Optional<UserModel> getUserPersonalData(@PathVariable("id") Long id){
        return this.userRepository.findById(id);
    }

    @GetMapping("/get-user-personal-data-username/{username}")
    public Optional<UserModel> getUserPersonalData(@PathVariable("username") String username){
        return this.userRepository.findByUsername(username);
    }

}