<h1>API REST para Gestão de estoque!</h1>

<h3>É possivel:</h3>

Listar estoque de ativos;
Filtrar os equipamentos;
Categorizar equipamentos em estoque;
Criar e listar clientes;
Criar e listar predios de clientes;

<h3>Configurações/Instalações:</h3>

<h5>Inicialmente é necessário:</h5>

1.Ter instalado Java 8 e H2 para testes.

2.Possuir uma IDE que permita a execução/edição da api. Fica a escolha do usuário. Para desenvolver, utilizei Eclipse IDE.

3.Dentro do diretório do projeto, executar o projeto;


<h3>Funcionalidades - (URL's):</h3>

<!--Para as URL's que necessitarem de autenticação, usar o login abaixo para gerar o token a fim de teste:

Login: maria@gmail.com<br>
senha:123456 -->


GET listar empresas clientes<a>http://localhost:8080/empresa</a><br/>

POST para cadastrar um novo cliente <a>http://localhost:8080/empresa</a></br>
Exemplo de json a ser utilizado: { "nome":"Santander" "cnpj": "04856-260" }

PUT atualiza o nome da empresa do cliente <a>http://localhost:8080/empresa</a>

DELETE deleta empresa do cliente <a>http://localhost:8080/empresa</a>

GET listar predios dos clientes<a>http://localhost:8080/predio</a><br/>

POST para cadastrar um novo predio <a>http://localhost:8080/predio</a></br>
Exemplo de json a ser utilizado: { "nomeEmpresa":"Santander" "nome": "Predio 1", "cep": "04825-237", "rua": "Rua das Flores", "bairro": "JD Moraes",  "complemento": "predio", "numeroDoEndereco": "1600" }

PUT atualiza um predio da empresa do cliente <a>http://localhost:8080/predio</a>

DELETE deleta um predio do cliente <a>http://localhost:8080/predio</a>

DOCUMENTAÇÃO - URL - <a>http://localhost:8080/swagger-ui.html</a>