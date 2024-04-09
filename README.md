# Projeto de Exemplo - Gerenciamento de Modelos

Este é um projeto de exemplo para demonstrar um sistema simples de gerenciamento de modelos usando Spring Boot.

## Funcionalidades

O projeto inclui as seguintes funcionalidades:

- Criação, leitura, atualização e exclusão (CRUD) de modelos.
- Implementação de endpoints RESTful para manipulação de dados.
- Armazenamento temporário dos modelos em uma lista em memória.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Web
- Maven

## Configuração e Execução

1. Clone este repositório para sua máquina local:

```bash
git clone https://github.com/matheusgonzalez91/crud-java.git
```


2. Navegue até o diretório do projeto:

```bash
cd projeto-exemplo
```


3. Compile o projeto usando Maven:

```bash
mvn clean install
```

4. Execute a aplicação:

```bash
mvn spring-boot:run
```


A aplicação estará disponível em `http://localhost:8080`.

## Uso

Uma vez que a aplicação esteja em execução, você pode usar um cliente RESTful como Postman ou cURL para fazer requisições aos endpoints fornecidos pela API.

### Exemplos de Requisições

- Criação de um modelo:
  POST http://localhost:8080/teste
  Body:

```json
{
  "nome": "Exemplo",
  "email": "exemplo@example.com",
  "telefone": "123456789"
}
```

- Leitura de todos os modelos:

GET http://localhost:8080/teste

- Atualização de um modelo:

OBS(Lembre-se de substituir o {id} pelo ID da sua requisição

PUT http://localhost:8080/teste/{id}
Body:

```json
{
  "nome": "Novo Nome",
  "email": "novo_email@example.com",
  "telefone": "987654321"
}
```

- Exclusão de um modelo:

OBS(Lembre-se de substituir o {id} pelo ID da sua requisição

DELETE http://localhost:8080/teste/{id}
