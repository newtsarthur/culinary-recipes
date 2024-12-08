# API de Livros Culinários

A API de Livros Culinários permite que você gerencie uma coleção de livros de receitas culinárias. A API oferece funcionalidades para criar, ler, atualizar e excluir livros culinários, bem como visualizar a lista de livros cadastrados.

## Funcionalidades

- **Criar um Livro Culinário**: Adiciona um novo livro culinário à base de dados.
- **Buscar Livros Culinários**: Recupera uma lista de livros ou detalhes de um livro específico.
- **Atualizar um Livro Culinário**: Modifica os dados de um livro culinário existente.
- **Excluir um Livro Culinário**: Remove um livro culinário da base de dados.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para desenvolvimento da API REST.
- **JPA/Hibernate**: Para persistência e manipulação de dados no banco de dados.
- **MySQL**: Banco de dados relacional para armazenamento dos livros culinários.
- **Postman**: Ferramenta utilizada para testar as requisições da API.

## Configuração do Projeto

### Pré-requisitos

Antes de rodar o projeto, você precisa ter o seguinte instalado:

- **Java 17 ou superior**
- **Maven**
- **MySQL** (ou outro banco de dados configurado para JPA)

### Clonando o Repositório

Clone este repositório para a sua máquina local:

```bash
git clone https://github.com/newtsarthur/culinary-recipes-api.git
```

### Configuração do Banco de Dados

1. Crie um banco de dados MySQL chamado `culinary_recipes`.
2. Configure as credenciais do banco no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/culinary_recipes
spring.datasource.username=seu-usuario
spring.datasource.password=sua-senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Executando o Projeto

Para rodar a aplicação, execute o seguinte comando:

```bash
mvn spring-boot:run
```

Isso iniciará o servidor localmente em `http://localhost:8080`.

## Endpoints da API

### 1. Criar um Livro Culinário

- **Método**: `POST`
- **URL**: `/culinary-books`
- **Body (JSON)**:
  
```json
{
  "title": "Mastering the Art of French Cooking",
  "author": "Julia Child",
  "genre": "Culinary",
  "publicationDate": "1961-10-16",
  "publisher": "Knopf",
  "isbn": "9780394721781",
  "pageCount": 684,
  "language": "English",
  "price": 49.99,
  "coverImageUrl": "http://example.com/cover.jpg",
  "description": "A classic cookbook by Julia Child."
}
```

- **Resposta** (201 Created):
  
```json
{
  "id": 1,
  "title": "Mastering the Art of French Cooking",
  "author": "Julia Child",
  "genre": "Culinary",
  "publicationDate": "1961-10-16",
  "publisher": "Knopf",
  "isbn": "9780394721781",
  "pageCount": 684,
  "language": "English",
  "price": 49.99,
  "coverImageUrl": "http://example.com/cover.jpg",
  "description": "A classic cookbook by Julia Child."
}
```

### 2. Buscar Todos os Livros Culinários

- **Método**: `GET`
- **URL**: `/culinary-books`
- **Resposta** (200 OK):
  
```json
[
  {
    "id": 1,
    "title": "Mastering the Art of French Cooking",
    "author": "Julia Child",
    "genre": "Culinary",
    "publicationDate": "1961-10-16",
    "publisher": "Knopf",
    "isbn": "9780394721781",
    "pageCount": 684,
    "language": "English",
    "price": 49.99,
    "coverImageUrl": "http://example.com/cover.jpg",
    "description": "A classic cookbook by Julia Child."
  },
  ...
]
```

### 3. Buscar Livro Culinário pelo ID

- **Método**: `GET`
- **URL**: `/culinary-books/{id}`
- **Resposta** (200 OK):

```json
{
  "id": 1,
  "title": "Mastering the Art of French Cooking",
  "author": "Julia Child",
  "genre": "Culinary",
  "publicationDate": "1961-10-16",
  "publisher": "Knopf",
  "isbn": "9780394721781",
  "pageCount": 684,
  "language": "English",
  "price": 49.99,
  "coverImageUrl": "http://example.com/cover.jpg",
  "description": "A classic cookbook by Julia Child."
}
```

### 4. Atualizar um Livro Culinário

- **Método**: `PUT`
- **URL**: `/culinary-books/{id}`
- **Body (JSON)**:
  
```json
{
  "title": "Mastering the Art of French Cooking - Revised Edition",
  "author": "Julia Child",
  "genre": "Culinary",
  "publicationDate": "1961-10-16",
  "publisher": "Knopf",
  "isbn": "9780394721781",
  "pageCount": 700,
  "language": "English",
  "price": 59.99,
  "coverImageUrl": "http://example.com/cover-revised.jpg",
  "description": "An updated version of the classic cookbook."
}
```

- **Resposta** (200 OK):
  
```json
{
  "id": 1,
  "title": "Mastering the Art of French Cooking - Revised Edition",
  "author": "Julia Child",
  "genre": "Culinary",
  "publicationDate": "1961-10-16",
  "publisher": "Knopf",
  "isbn": "9780394721781",
  "pageCount": 700,
  "language": "English",
  "price": 59.99,
  "coverImageUrl": "http://example.com/cover-revised.jpg",
  "description": "An updated version of the classic cookbook."
}
```

### 5. Excluir um Livro Culinário

- **Método**: `DELETE`
- **URL**: `/culinary-books/{id}`
- **Resposta** (204 No Content): Nenhum conteúdo retornado após a exclusão.

## Licença

Este projeto está licenciado sob a licença **Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International** (CC BY-NC-SA 4.0).

Para mais detalhes, consulte o link para a licença: [Creative Commons BY-NC-SA 4.0](https://creativecommons.org/licenses/by-nc-sa/4.0/).

## Contribuindo

Se você quiser contribuir para este projeto, sinta-se à vontade para abrir um _pull request_ ou reportar _issues_.