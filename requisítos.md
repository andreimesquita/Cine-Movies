* [Requisítos Funcionais](#requis%C3%8Dtos-funcionais)
* [Requisítos Não Funcionais](#requis%C3%8Dtos-n%C3%83o-funcionais)
* [Requisítos de Segurança](#requis%C3%8Dtos-de-segurança);
* [Regras de Negócio](#regras-de-neg%C3%93cio)

## REQUISÍTOS FUNCIONAIS

    O software deve permitir que os funcionários e o gerente cadastrem, alterem, excluam e consultem seus clientes.
	O software deve permitir que o gerente visualize o relatório de filmes locados por cada cliente e por todos.
	O software deve permitir que os funcionários visualizem uma lista com os clientes cadastrados.
	O software deve permitir que os funcionários e o gerente cadastrem, alterem, excluam e consultem seus filmes.
	O software deve permitir que os funcionários, e o gerente, cadastrem, alterem, excluam e consultem seus fornecedores.
	O software deve guardar a data e hora em que os clientes, filmes e fornecedores forem cadastrados, alterados e excluídos.
	O software deve permitir que o cliente alugue filmes.
	O software deve permitir que o gerente faça backup do banco de dados.
	O software deve permitir que o gerente visualize os arquivos de backup, do banco de dados, com a data e hora em que foram criados.
	O software deve permitir que o gerente restaure o banco de dados a partir das cópias de backup.
	O sistema deve permitir que o gerente visualize o relatório de lucros, vendas, filmes mais locados, menos locados, novos e antigos.
	O sistema deve permitir que o gerente visualize o relatório de generos mais locados, e menos locados, de forma geral e por cada cliente.
	O software deve permitir a impressão de relatórios por meio da ferramenta IReport (JasperReports).
	O software deve guardar as informações de locações realizadas com a data.

##  REQUISÍTOS NÃO FUNCIONAIS

    O sistema deve gerar relatórios gráficos e escritos.
    Os relatórios devem ser gerados por um determinado período de dias, meses ou anos, escolhidos pelo gerente.
    O programa deve ser feito na linguagem de programação Java.
    O banco de dados utilizado deve ser o PostgreSQL ou MySQL.
    
    Os arquivos de backup criados devem ser salvos em uma pasta padrão do programa.
    Não existe limitação em relação a quantos backups podem ser realizados.
    Se não for possível realizar a conexão com o banco de dados, deve ser possível continuar o trabalho
    em forma off-line criando arquivos (.xml).

## REQUISÍTOS DE SEGURANÇA

    O software deve contar com serviço de autenticação por meio de usuário e senha.
	As senhas devem ser salvas usando de encriptação MD5.
    

##   REGRAS DE NEGÓCIO

	Os filmes são classificados em 3 três categorias: 'A', 'B' e 'C'. 
	Os filmes com a classificação 'A' são os filmes que estão na 
	As plataformas de filmes disponíveis são: DVD e Blu-ray.
	locadora a menos de 2 meses, custam DVD/Blu-ray R$ 4,00/R$ 5,50 e o tempo máximo para locação é de 24 horas (1 dia).
	Os filmes com a classificação 'B' são os filmes que estão na locadora entre 2 meses e 2 anos, custam R$ DVD/Blu-ray R$ 3,00/R$ 4,50 e o 
	tempo máximo para locação é de 48 horas (2 dias). 
	Os filmes com a classificação 'C' são os filmes que estão na locadora a mais de 2 anos, custam R$ DVD/Blu-ray R$ 2,00/R$ 3,50 e o tempo 
	máximo para locação é de 120 horas (5 dias).
    Os filmes que não forem entregues no prazo contam como uma nova locação.
    A Locadora conta com um serviço de tele-entrega, das 13 as 16 horas.