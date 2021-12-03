<!-- Título -->
<h1 align="center" id="title">API Cards</h1>

<!-- Descrição -->
<p align="justify">
  Esta é uma API bem simples desenvolvida com fins de estudo, não apenas do SpringBoot como também a metodologia Rest. Para emular o real uso, fora usado "Cards" como objeto a ser adquirido pela API, onde é possível realizar as operações de um CRUD se baseando em um objeto com "nome, lv, arquétipo, tipo, atributo, ataque e defesa" vale citar que este exemplo foi feito baseado em cards de "Yu-Gi-Oh".
</p>


<!-- Shield -->
<p>
	<img src="https://img.shields.io/badge/Made%20with-Spring Boot-6DB33F?style=for-the-badge&logo=spring&logoColor=6DB33F" title="Feito com SpringBoot" alt="Feito com SpringBoot"></img>
  <img src="https://img.shields.io/badge/Used-MongoDB Net-006600?style=for-the-badge&logo=mongodb&logoColor=006600" title="Usado o MongoDB Net" alt="Usado o MongoDB Net"></img>
  <img src="https://img.shields.io/badge/Requests with-Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=FF6C37" title="Requisições feitas pelo Postman" alt="Requisições feitas pelo Postman"></img>
  <!--<img src="https://img.shields.io/badge/Status-Working-F08705?style=for-the-badge" title="Status do Projeto: Trabalhando" alt="Projeto em Andamento"></img>-->
  <img src="https://img.shields.io/badge/Status-Done-blue?style=for-the-badge" title="Status do Projeto: Concluído" alt="Projeto Concluído"></img>
</p>


<!-- Tecnologias -->
<h2 align="left" id="tecnologias">Tecnologias</h2>

As seguintes ferramentas foram usadas na construção do projeto:

- [Spring](https://spring.io/)

Plugins:

- MongoDB Reactive
- Spring Webflux


<!-- Pré-Requisitos -->
<h2 align="left" id="pre">Pré-Requisitos</h2>

Antes de começar vale lembrar, é necessário possuir o [Java](https://www.java.com/pt-BR/) instalado e o [Maven](https://maven.apache.org/download.cgi) baixado em sua máquina e como estamos trabalhando com uma API precisamos de alguma forma fazer as requisições, então deixo o [Postman](https://www.postman.com/downloads/) como recomendação. É bacana também você possuir um editor para trabalhar com o código, fica a dica o [VSCode](https://code.visualstudio.com/download).


<!-- Features -->
<h2 align="left" id="conteúdo">Funcionalidades</h2>

- [x] Find All - Get("/cards");
- [x] Create - Post("/cards");
- [x] Find by Id - Get("/cards/{id}");
- [x] Delete - Delete("/cards/{id}");


<!-- Executando o programa -->
<h2 align="left" id="run">Rodando a aplicação</h2>

```bash
# 1. Clone este repositório
$ git clone https://github.com/IN0C3NC10/API-Cards.git

# 2. Abra o projeto no seu editor de preferência

# 3. Altere o arquivo "application.properties" em "./src/main/resources/", a propriedade "mongodb-ui" de acordo com o seu banco de dados:
      # ..apenas para ter uma ideia do que se trata cada propriedade
      spring.data.mongodb.uri=mongodb+srv://name:password@database.params.mongodb.net/databasename?retryWrites=true&w=majority

# 4. Selecione o arquivo principal e o execute.

# Obs. Utilize o Postman para realizar as "requisições".
#      O exemplo acima foi realizado com o MongoDB Net, então você precisa de uma conta para usar(https://www.mongodb.com/).
#      Vale citar, que você pode atribuir o seu próprio banco de dados mas, pode ser necessário alterar as formas de requisições, belezera?

#BeHappy!
```

<!-- Autor -->
<h2 align="left" id="autor">Autor</h2>
<p>
	<a href="https://github.com/IN0C3NC10">
		<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/73368174?v=4" width="100px;" alt="autor-image" title="IN0C3NC10"/>
	</a>
	<br />
	Feito com ❤️ por <strong>Bruno Inocencio</strong>!
</p>

<p align="left">
  <!-- Outlook -->
  <a href="mailto:bruno.inocencio@fatec.sp.gov.br" alt="Outlook" target="_blank">
    <img height="35" src="https://img.shields.io/badge/Outlook-00001a?style=for-the-badge&logo=microsoft-outlook&logoColor=0078D4" />
  </a>
  <!-- Linkedin -->
  <a href="https://cutt.ly/nQlVjQV" alt="Linkedin" target="_blank">
    <img height="35" src="https://img.shields.io/badge/-LinkedIn-00001a?style=for-the-badge&logo=linkedin&logoColor=%230077B5" />
  </a>
  <!-- GitHub -->
  <a href="https://github.com/IN0C3NC10" alt="GitHub" target="_blank">
    <img height="35" src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white" />
  </a>
</p>

