# PessoaApi
Esta API permite realizar operações CRUD (Criar, Ler, Atualizar, Excluir) em objetos Pessoa.

## Tecnologias utilizadas
### Java: Linguagem de programação utilizada para desenvolver a API.
### Spring Boot: Framework utilizado para facilitar a criação de aplicações web com Java.
### Spring Data JPA: Biblioteca utilizada para facilitar o acesso ao banco de dados e mapeamento de entidades.
### Lombok: Biblioteca utilizada para gerar automaticamente métodos getters, setters e outros métodos úteis para classes.
Pontos de Acesso
Obter Pessoas
Retorna todas as Pessoas cadastradas no sistema.

URL : /pessoa

Método : GET

Resposta de Sucesso :

Código : 200 OK
Conteúdo :
Copy code
[  {    "pessoaId": 1,    "name": "João Silva",    "age": 30  },  {    "pessoaId": 2,    "name": "Maria Silva",    "age": 25  }]
Obter Pessoa por ID
Retorna uma Pessoa pelo seu ID.

URL : /pessoa/{pessoaId}

Método : GET

Parâmetros da URL : pessoaId=[long] onde pessoaId é o ID da Pessoa que deseja obter.

Resposta de Sucesso :

Código : 200 OK
Conteúdo :
Copy code
{
    "pessoaId": 1,
    "name": "João Silva",
    "age": 30
}
Resposta de Erro :

Código : 404 NOT FOUND
Conteúdo : { "mensagem": "Pessoa não encontrada com o id: {pessoaId} }
Criar Pessoa
Cria uma nova Pessoa.

URL : /pessoa

Método : POST

Parâmetros de Dados :

Copy code
{
    "name": "João Silva",
    "age": 30
}
Resposta de Sucesso :

Código : 201 CREATED
Conteúdo :
Copy code
{
    "pessoaId": 1,
    "name": "João Silva",
    "age": 30
}
Resposta de Erro :


Código : 400 BAD REQUEST
Conteúdo : { "mensagem": "Erro ao criar pessoa: {erro}" }
Atualizar Pessoa
Atualiza uma Pessoa pelo seu ID.

URL : /pessoa/{pessoaId}

Método : PUT

Parâmetros de URL : pessoaId=[long] onde pessoaId é o ID da Pessoa que deseja atualizar.

Parâmetros de Dados :

Copy code
{
    "name": "João Silva",
    "age": 30
}
Resposta de Sucesso :

Código : 200 OK
Conteúdo :
Copy code
{
    "pessoaId": 1,
    "name": "João Silva",
    "age": 30
}
Resposta de Erro :

Código : 404 NOT FOUND
Conteúdo : { "mensagem": "Pessoa não encontrada com o id: {pessoaId} }
Excluir Pessoa
Exclui uma Pessoa pelo seu ID.

URL : /pessoa/{pessoaId}

**Método** : DELETE

Parâmetros de URL : pessoaId=[long] onde pessoaId é o ID da Pessoa que deseja excluir.

Resposta de Sucesso :

Código : 204 NO CONTENT
Resposta de Erro :

Código : 404 NOT FOUND
Conteúdo : { "mensagem": "Pessoa não encontrada com o id: {pessoaId} }
