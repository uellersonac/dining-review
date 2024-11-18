package com.example.dining.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// =======================================================
// CLASSE QUE DEFINE O POJO DA TABELA "RATINGS"
// =======================================================

//--------------------------------------------------------
//USO DO LOMBOK PARA EVITAR BOILERPLATE
@Getter //Gera automaticamente os getters (getId e getName)
@Setter //Gera automaticamente os setters (setId e setName)
@NoArgsConstructor //Gera automaticamente um construtor vazio public RatingsModel(){}
//--------------------------------------------------------

//--------------------------------------------------------
//USO DAS MARCAÇÕES DO JPA PERSISTENCE PARA MAPEAMENTO ORM
@Entity //Define a entidade (tabela)
public class RatingModel {

    @Id //Define uma PK
    @GeneratedValue(strategy = GenerationType.AUTO) //Gera automaticamente a PK
    @Column //Define a variável como uma coluna da tabela
    private String id;

    @Column
    private String userId;

    @Column
    private String restaurantId;

    @Column
    private String rating;

    @Column
    private String comment;

    @Column
    private String status;
}
//--------------------------------------------------------