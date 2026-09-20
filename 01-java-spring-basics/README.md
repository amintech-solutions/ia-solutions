# Módulo 01 - Fundamentos de Java e Spring Boot

Repositório focado nos conceitos básicos de programação Java, orientação a objetos e criação das primeiras APIs com Spring Boot para a AminTech.

## O que este projeto mostra

- **Orientação a objetos**: a classe `Produto` encapsula dados e regra de negócio (`calcularValorTotal`).
- **Spring Boot**: `SpringBasicsApplication` sobe um servidor web com uma única anotação (`@SpringBootApplication`).
- **API REST**: `HelloController` expõe dois endpoints simples.

## Estrutura

```
src/main/java/com/amintech/springbasics/
├── SpringBasicsApplication.java   # ponto de entrada
├── model/
│   └── Produto.java                # exemplo de OOP
└── controller/
    └── HelloController.java        # endpoints da API
```

## Como executar

Pré-requisitos: Java 17+ e Maven.

```bash
mvn spring-boot:run
```

## Endpoints disponíveis

| Método | Rota        | Descrição                          |
|--------|-------------|-------------------------------------|
| GET    | `/hello`    | Mensagem de boas-vindas             |
| GET    | `/produtos` | Lista de produtos (dados em memória)|

Depois de rodar, acesse: `http://localhost:8080/hello`
