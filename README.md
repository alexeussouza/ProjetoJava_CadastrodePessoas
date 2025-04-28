::...Projeto Cadastro de Pessoas...::
-

Este projeto é um sistema web desenvolvido com Spring Boot e Thymeleaf para realizar o cadastro e a listagem de pessoas. Ele foi criado com foco em boas práticas de desenvolvimento, utilizando arquitetura MVC (Model-View-Controller) e versionamento Git com organização de branches.

::...Funcionalidades...::
-

- Cadastro de pessoas com os campos:

=> Nome
=> Telefone
=> E-mail

- Listagem de todas as pessoas cadastradas

- Estilização das páginas utilizando CSS personalizado

- Separação de responsabilidades seguindo o padrão de camadas:

=> Model: Representa a entidade Pessoa

=> Repository: Interface JPA para acesso a dados

=> Service: Camada de regras de negócio

=> Controller: Camada responsável pela comunicação com o front-end

- Integração com banco de dados Mysql em container Docker

- Templates Thymeleaf para criação das páginas HTML dinâmicas

::...Tecnologias Utilizadas...::
-

- Java 17+

- Spring Boot 3+

- Spring Data JPA

- Thymeleaf

- HTML5 / CSS3

- Git / GitHub

::...Estrutura de Branches (Git)...::
-

- develop: Branch principal de desenvolvimento.

- feature/criar-cadastro-pessoa: Branch destinada à criação da funcionalidade de cadastro de pessoas.

- main: Branch principal para produção (sem conteúdo inicial, utilizada para organizar o fluxo de merges).

::...Como Rodar o Projeto...::
-

Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/alexeussouza/ProjetoJava_CadastrodePessoas.git
Acesse a pasta do projeto:

bash
Copiar
Editar
cd ProjetoJava_CadastrodePessoas
Abra o projeto em sua IDE favorita (IntelliJ, VS Code, Eclipse).

Execute a aplicação como um projeto Spring Boot.

Acesse o navegador e entre em:

bash
Copiar
Editar
http://localhost:8080/pessoas


![image](https://github.com/user-attachments/assets/2f0394b5-5816-4eab-8d65-7a9d86f6adaa)
![image](https://github.com/user-attachments/assets/124976ba-0f50-4390-96d9-d0d9e2ca203f)

