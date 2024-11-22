package com.example.dining.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// =======================================================
// CLASSE QUE DEFINE O POJO DA TABELA "USER"
// =======================================================

//--------------------------------------------------------
//USO DO LOMBOK PARA EVITAR BOILERPLATE
@Getter //Gera automaticamente os getters (getId, getName etc.)
@Setter //Gera automaticamente os setters (setId e setName)
@NoArgsConstructor //Gera automaticamente um construtor vazio public RatingsModel(){}
//--------------------------------------------------------

//--------------------------------------------------------
//USO DAS MARCAÇÕES DO JPA PERSISTENCE PARA MAPEAMENTO ORM
@Entity //Define a entidade (tabela)
public class UserModel {

    @Id //Define uma PK
    @GeneratedValue(strategy = GenerationType.AUTO) //Gera automaticamente a PK
    @JsonIgnore //Ignora esse campo em POST, já que é automático
    @Column //Define a variável como uma coluna da tabela
    private Long id;

    @Column
    private String name;

    @Column(unique = true)
    private String username;

    @Column
    private String email;
}
//--------------------------------------------------------