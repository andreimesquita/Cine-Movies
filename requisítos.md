* [Requisítos Funcionais](#requis%C3%8Dtos-funcionais)
* [Requisítos Não Funcionais](#requis%C3%8Dtos-n%C3%83o-funcionais)
* [Regras de Negócio](#regras-de-neg%C3%93cio)

## REQUISÍTOS FUNCIONAIS

    O software deve permitir que o funcionário cadastre, altere, exclua e consulte os dados dos clientes.
    O software deve permitir que o funcionário cadastre, altere, exclua e consulte os autorizados de cada cliente.
	O software deve permitir que o funcionário visualize o relatório de filmes locados por cada cliente.
	O sosftware deve permitir que o funcionário altere e consulte o saldo de cada cliente.
	O software deve permitir que o funcionário cadastre, altere, exclua e consulte as mídias.
    O software deve permitir que o funcionário cadastre, altere, exclua e consulte a classificação.
	O software deve permitir que o funcionário cadastre, altere, exclua e consulte o preço por classificação.
	O software deve permitir que o funcionário cadastre, altere, exclua e consulte o gênero.
	O software deve permitir que o funcionário cadastre, altere, exclua e consulte a localização.
	O software deve guardar a data e hora em que os clientes e mídias forem cadastrados e alterados.
	O software deve permitir que o cliente alugue mídias.
    O sistema deve permitir que o funcionário visualize o relatório de lucros.

    O software deve permitir que o funcionário visualize e atualize o saldo de cada cliente.


##  REQUISÍTOS NÃO FUNCIONAIS

    O software deve guardar as informações de locações realizadas, com a data e hora.
    O programa deve ser feito na linguagem de programação Java.
    O base de dados utilizada deverá ser o MySQL.

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