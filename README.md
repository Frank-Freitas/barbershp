# Barbershop API

> **Status do Projeto**: 🚧 Em desenvolvimento 🚧

API RESTful para gerenciamento de agendamentos e serviços de uma barbearia. Este projeto faz parte de um estudo prático sobre desenvolvimento backend com **Java** e **Spring Boot**.

---

## 📌 Funcionalidades previstas

- [x] Cadastro e gerenciamento de usuários (clientes e barbeiros)
- [x] Enumeração de tipos de serviço (ex: corte, barba)
- [ ] Agendamento de serviços com barbeiros
- [ ] Catálogo de serviços oferecidos
- [ ] Sistema de autenticação (login e segurança)
- [ ] Validação de horários disponíveis
- [ ] Integração com frontend mobile (React Native)

---

## 🛠️ Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- Lombok
- H2 Database (para testes)
- Maven

---

## 🎯 Objetivo

O objetivo principal é criar uma API funcional e bem estruturada que atenda às necessidades de uma barbearia digital, permitindo:
- Cadastro e login de usuários
- Consulta e agendamento de serviços
- Visualização de horários e barbeiros disponíveis

---

## ⚙️ Como rodar o projeto

1. Clone este repositório:

```bash
git clone https://github.com/Frank-Freitas/barbershp.git
cd barbershp
```

2. Execute a aplicação:

```bash
./mvnw spring-boot:run
```

3. Acesse a API localmente:
```
http://localhost:8080
```

---

## 🔍 Estrutura básica do projeto

```
com.barbearia.app
│── application
│   ├── controller
│   ├── dto
│   ├── mapper
│   └── service
│── domain
│   ├── entity
│   ├── repository
│── infrastructure
│   ├── config
│   ├── security
│   └── exception
```

---

## 📢 Aviso

Este projeto ainda está em fase de desenvolvimento. Nem todas as funcionalidades estão prontas. Contribuições e sugestões são bem-vindas!

---

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).

---

### Autor
**Frank Freitas**  
[GitHub](https://github.com/Frank-Freitas)

