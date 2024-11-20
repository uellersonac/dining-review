
# Dining Review
Projeto de uma API de registro de avaliações de restaurantes. Dentre suas funcionalidades está a realização de cadastro de usuários e restaurantes, submissão de avaliações e moderação (através do perfil admin). O projeto é sugestão da trilha de desenvolvimento Java com Spring JPA da codecademy.com.

# Tecnologia
- **Linguagem:** Java com Spring Framework;
- **Banco de Dados:** H2;
- **Documentação da API:** Swagger;
- **Modelagem ERD/DFD:** Lucidchart.

# Autor
- Uellerson Carvalho

# Diagrama Entidade-Relacionamento
O ORM mapeará 3 tabelas diferentes:
- **User:** representada na classe ```UserModel.java```;
- **Restaurant:** representada na classe ```RestaurantModel.java```;
- **Ratings:** representada na classe ```RatingModel.java```.

<img src="erd-dining-review.png" width=400>

As interfaces ```RestaurantRepository.java```, ```UserRepository.java``` e ```RatingRepository.java``` abstraem as operações de consulta ao banco de dados.


# Diagrama de Fluxo de Dados
Serão utilizados 11 processos (requisições) diferentes:

<img src="dfd-dining-review.png" width=700>

## Licença

[MIT](https://choosealicense.com/licenses/mit/)
