package com.example.dining.model;

// =======================================================
// CLASSE QUE DEFINE O POJO DA TABELA "USER"
// =======================================================

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//--------------------------------------------------------
//USO DO LOMBOK PARA EVITAR BOILERPLATE
@Getter //Gera automaticamente os getters (getId e getName)
@Setter //Gera automaticamente os setters (setId e setName)
@NoArgsConstructor //Gera automaticamente um construtor vazio public RatingsModel(){}
//--------------------------------------------------------

//--------------------------------------------------------
//USO DAS MARCAÇÕES DO JPA PERSISTENCE PARA MAPEAMENTO ORM
@Entity //Define a entidade (tabela)
public class RestaurantModel {

    @Id //Define uma PK
    @GeneratedValue(strategy = GenerationType.AUTO) //Gera automaticamente a PK
    @Column //Define a variável como uma coluna da tabela
    private String id;

    @Column
    private String name;
}
//--------------------------------------------------------