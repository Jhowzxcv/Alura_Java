# ☕ Estudos de Java e Spring Boot — Alura

Meus projetos, exercícios e referências de estudo de **Java** e **Spring Boot** na **Alura**, organizados por curso. A carreira de desenvolvimento backend Java segue em andamento.

---

## 📚 Estrutura de Cursos e Projetos

| # | Pasta | Curso / Conteúdo | Principais Tecnologias & Conceitos |
| :-: | :--- | :--- | :--- |
| **01** | [`01-java-criando-sua-primeira-aplicacao/`](./01-java-criando-sua-primeira-aplicacao) | **Java: criando a sua primeira aplicação** | JDK, JVM, tipos primitivos, `Scanner`, condicionais, loops, Desafio do App Bancário |
| **02** | [`02-java-aplicando-a-orientacao-a-objetos/`](./02-java-aplicando-a-orientacao-a-objetos) | **Java: aplicando a Orientação a Objetos** | Classes, atributos, métodos, encapsulamento, herança, polimorfismo e interfaces (*ScreenMatch inicial*) |
| **03** | [`03-java-trabalhando-com-listas-e-colecoes/`](./03-java-trabalhando-com-listas-e-colecoes) | **Java: trabalhando com listas e coleções de dados** | `ArrayList`, `Collections.sort`, `Comparable`, `Comparator`, manipulação de coleções |
| **04** | [`04-java-consumindo-api-gravando-arquivos-e-erros/`](./04-java-consumindo-api-gravando-arquivos-e-erros) | **Java: consumindo API, gravando arquivos e lidando com erros** | `HttpClient`, OMDb API, Gson, Records (`TituloOmdb`), exceções personalizadas, gravação em `.json` |
| **05** | [`05-spring-screenmatch/`](./05-spring-screenmatch) | **Java e Spring: Lambdas, Streams, JPA & API Web** | Spring Boot, CommandLineRunner, JPA/Hibernate, PostgreSQL, Derived Queries, JPQL, Controllers REST + Frontend Web |
| **06** | [`06-desafio-frases-series/`](./06-desafio-frases-series) | **Desafio Spring: Frases de Séries e Filmes** | API REST Spring Boot para sorteio e consulta de frases integrada ao frontend Web |
| **07** | [`07-atividades-extras-spring-jpa/`](./07-atividades-extras-spring-jpa) | **Exercícios Práticos de Fixação** | Relacionamentos JPA, repositórios, PostgreSQL, Lambdas e Interfaces Funcionais |
| **08** | [`08-spring-boot-3-vollmed-api/`](./08-spring-boot-3-vollmed-api) | **Spring Boot 3: API REST Voll.med (Completo)** | CRUD, Flyway Migrations, Spring Security, JWT, Bean Validation, SOLID, Documentação Swagger/OpenAPI e Testes Unitários |

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java 17 / 21
- **Frameworks:** Spring Boot 3 (Spring Web, Spring Data JPA, Spring Security)
- **Banco de Dados:** PostgreSQL, Flyway Migrations
- **Segurança & Tokens:** Auth0 JWT, BCrypt
- **Documentação & Testes:** SpringDoc OpenAPI (Swagger), JUnit 5, Mockito
- **Frontend Consumidor:** HTML5, CSS3, JavaScript (Fetch API / CORS)
- **Gerenciador de Dependências:** Apache Maven

---

## 🚀 Como Executar

### Projetos Java Puro (01 a 04):
Podem ser executados diretamente em qualquer IDE (IntelliJ IDEA, Eclipse, VS Code) ou compilados via terminal:
```bash
javac Principal.java
java Principal
```

### Projetos Spring Boot (05, 06, 07, 08):
Navegue até a pasta do backend correspondente e execute:
```bash
./mvnw spring-boot:run
```
*(Certifique-se de configurar as credenciais do PostgreSQL no arquivo `application.properties` se aplicável)*.


## Continuação dos estudos — outubro de 2026

- [Catálogo da carreira e progresso por curso](./trilha-java/README.md).
- [Referências oficiais da Alura](./referencias-oficiais/README.md): refatoração, boas práticas de API, testes automatizados, Git/GitHub e exceções.
- Cursos práticos concluídos: variáveis e tipos; condicionais; laços; data e hora; classes, atributos e métodos; encapsulamento; herança, polimorfismo e interfaces; coleções e streams.
- **Boas práticas de programação: melhore o código de uma API Java** concluído em outubro de 2026.

As pastas 01 a 08 reúnem minhas implementações anteriores. As pastas 09 a 13, dentro de `referencias-oficiais`, apontam para os projetos dos instrutores por meio de submódulos Git, com origem e commit registrados. Para baixar tudo, use `git clone --recurse-submodules`.
