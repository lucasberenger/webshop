# 🛍️ Shop Web Service
Este é um projeto de Web Service para gerenciamento de uma loja online. Ele permite o cadastro de produtos, categorias, usuários e pedidos, utilizando tecnologias modernas para garantir um backend eficiente e escalável.

---
## 🚀 Tecnologias 
- Java 17
- Spring Boot
- MySQL
- Docker

---
## 📦 Como executar
Para executar o projeto, é necessário ter instalado os seguintes programas:
- Git
- Maven
- Java 17
- Docker
- Docker Compose

### Clone o repositório
Abra o terminal e execute os seguintes comandos:

```
git clone https://github.com/lucasberenger/webshop.git
cd webshop
```
###  ⚙️ Configuração do Perfil
A aplicação possui dois perfis diferentes:
- dev: Utilizado para desenvolvimento
- prod: Utilizado para produção

Para alterar o perfil, basta definir a variável no arquivo **application.properties**:
``` spring.profiles.active=dev ``` ou ``` spring.profiles.active=prod ```

### Definir variáveis de ambiente para o MySQL
Crie um arquivo chamado .env na raiz do projeto e adicione as seguintes variáveis de ambiente:
```
MYSQL_ROOT_PASSWORD=senha_do_root
MYSQL_DATABASE=nome_do_banco
MYSQL_USER=usuário
MYSQL_PASSWORD=senha
```

### Executar o Docker Compose
Execute o seguinte comando para subir os containers:
```
docker-compose up -d
```

O comando acima irá criar dois containers: um para o MySQL e outro para a API. Ela estará disponível em http://localhost:8080.

---
### 📌 Endpoints Principais
- GET /products → Lista todos os produtos
- GET /categories → Lista todas as categorias
- GET /users → Lista todos os usuários
- GET /orders → Lista todos os pedidos

--- 

