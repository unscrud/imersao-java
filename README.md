# AULA 04 - CRIANDO NOSSA PRÓPRIA API COM SPRING

Construção de uma API REST para expor nosso próprio conteúdo, utilizando ferramentas profissionais como o Spring Framework e um banco de dados NoSQL.

## Links citados

- Documentação do Spring Framework.
https://spring.io/

- Link para iniciar um projeto utilizando Spring.
https://start.spring.io/

- Link para download do Maven.
https://maven.apache.org/download.cgi

- Link para download do Postman.
https://www.postman.com/

- Página para fazer o registro e começar a utilizar o MongoDb Atlas.
https://www.mongodb.com/cloud/atlas/register

- GitHub com os logos das linguagens de programação.
https://github.com/abrahamcalf/programming-languages-logos

- Artigo sobre o pack de stickers da Alura para Whatsapp e Telegram.
https://www.alura.com.br/artigos/stickers-dev-aluraverso-whatsapp-telegram

### Desafios
- Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada;
- Devolver a listagem ordenada pelo ranking;
- Criar na sua API um modelo de entidade com nomes diferentes de title e image e criar seu próprio extrator de informações personalizado OU, manter com o nome title e image e traduzir para que seja retornado como título e imagem através do uso de DTO (Data Transfer Object);
- Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST;
- Desafio supremo: Aplicar modificações parciais no recurso através do método PATCH, por exemplo, modificando o número de votos ou de pessoas que utilizam cada linguagem de programação.
- Material complementar
- Primeira aula do curso “Maven: gerenciamento de dependências e build de aplicações Java” da Alura.
- Alura+ “O que é REST?”.
- Artigo da Alura “Conceito e fundamentos sobre REST”.
- Podcast Hipsters.Tech sobre MongoDB.
- Hipters.Tube “O que é SQL e NoSQL?”.
- Artigo da Alura “Spring: Conheça esse framework Java”.
- Alura+ Introdução ao Postman”.

# AULA 05 - PUBLICANDO NOSSA API NO CLOUD
Tornando nossa aplicação acessível por qualquer pessoa, fazendo o deploy na nuvem. Além disso, vamos gerar figurinhas a partir do conteúdo dessa nossa API.

## Links citados

- Dev em T: especialista x generalista.
https://www.alura.com.br/dev-em-t

- Site do Heroku, que é um PaaS (plataforma como serviço).
https://www.heroku.com/

- Documentação sobre a Oracle Cloud.
https://docs.oracle.com/pt-br/iaas/Content/home.htm

- Artigo: Como elaborar um bom arquivo Readme para os seus projetos.
https://www.alura.com.br/artigos/escrever-bom-readme

### Desafios

- Compartilhe com seus amigos a sua URL do Heroku, para que eles possam consumir a sua API (com o padrão de atributos title e image) e gerar figurinhas do conteúdo que você utilizou (linguagens de programação, filmes, músicas);

- Colocar a aplicação no cloud da Oracle;

- Implementar algum mecanismo de votação na API, para que outros amigos votem nas linguagens preferidas para que se possa fazer um ranking;

- Desafio supremo: Evoluir o projeto das três primeiras aula para que ele gere um bundle de stickers, para que se possa fazer o download e já incluir vários stickers no WhatsApp; Usar os conhecimentos aprendidos em alguma imersão React da Alura e fazer uma aplicação front-end para gerar esse bundle, onde possa se passar a URL do conteúdo e já visualizar os stickers;

## Material complementar

- Artigo da Alura “Heroku, Vercel e outras opções de Cloud como plataforma”.
https://www.alura.com.br/artigos/heroku-vercel-outras-opcoes-cloud-plataforma

- Podcast Hipters.Tech “Integração Contínua, Deploy Contínuo e Github Actions”.
https://www.alura.com.br/podcast/hipsterstech-integracao-continua-deploy-continuo-e-github-actions-hipsters-213-a335

- Pesquisa da JetBrains, empresa que desenvolve a IDE IntelliJ, sobre o ecossistema Java em 2021.
https://www.jetbrains.com/lp/devecosystem-2021/java/
