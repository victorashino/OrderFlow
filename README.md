# 📌 OrderFlow API

Este é um projeto simples de gerenciamento de pedidos desenvolvido com Spring Boot. A API permite criar, listar, atualizar e excluir usuários, pedidos e produtos.

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot 3
- Spring Data JPA
- MariaDB
- Docker

## 📦 Como Rodar o Projeto

### 1️⃣ Clonar o Repositório

```sh
git clone https://github.com/victorashino/OrderFlow.git
cd OrderFlow
```

### 2️⃣ Configurar o Banco de Dados

Crie um banco de dados no MariaDB e configure o `application.properties`:

```properties
spring.application.name=orderflow
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}
spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Rodar o Projeto

Com Gradle:

```sh
./gradlew bootRun
```

## 🛠 Endpoints da API (Em progresso)

## 🧪 Testando a API (Em progresso)

## 🐳 Rodando com Docker (Em progresso)

## 📄 Licença

Este projeto está sob a licença MIT. Sinta-se livre para usar e modificar conforme necessário.

