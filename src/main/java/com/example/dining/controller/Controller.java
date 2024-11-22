package com.example.dining.controller;
import com.example.dining.model.RatingModel;
import com.example.dining.model.UserModel;
import com.example.dining.repository.RatingRepository;
import com.example.dining.repository.RestaurantRepository;
import com.example.dining.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// =======================================================
// CLASSE QUE CONTROLA AS REQUISIÇÕES REST
// =======================================================

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

    //Anotação Swagger
    @Operation(
            summary = "Cadastro de novo usuário",
            description = "Endpoint usado para cadastrar novo usuário. 'username' é um atributo com restrição de unicidade, não podendo haver usuários com mesmo 'username'",
            tags = {"User Operations"}
    )
    @PostMapping("/post-personal-data")
    public UserModel postUserPersonalData(@RequestBody UserModel userModel){
        return this.userRepository.save(userModel);
    }
//--------------------------------------------------------


//--------------------------------------------------------
//PROCESSO 2 - GET USER PERSONAL DATA

    //Anotação Swagger
    @Operation(
            summary = "Obter dados de cadastro",
            description = "Endpoint usado para obter os dados de cadastro de um dado username",
            tags = {"User Operations"}
    )
    @GetMapping("/get-user-personal-data-username/{username}")
    public Optional<UserModel> getUserPersonalData(@PathVariable("username") String username){
        return this.userRepository.findByUsername(username);
    }
//--------------------------------------------------------


//--------------------------------------------------------
//PROCESSO 3 - GET USER RATINGS

    @Operation(
            summary = "Obter ratings",
            description = "Endpoint usado para obter os ratings associados a um dado username",
            tags = {"User Operations"}
    )
    @GetMapping("/get-user-ratings/{username}")
    public List<RatingModel> getUserRatings(@PathVariable("username") String username){
        Optional<UserModel> userModel = userRepository.findByUsername(username);

        if(userModel.isPresent()){
            Long userId = userModel.get().getId();
            return this.ratingRepository.findByUserId(userId);
        } else {
            return List.of();
        }
    }

}