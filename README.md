SysLocadora
===========

REQUISÍTOS EM DESENVOLVIMENTO

SISTEMA

  Vídeo Locadora

EQUIPE

  Ândrei d'Oliveira Mesquita Schuch - andreirs@outlook.com

RESUMO

      Este sistema baseia-se em uma Vídeo Locadora que dispoões os serviços de locação de filmes e venda de filmes 
      antigos, e também conta com serviço de tele-entrega.

REQUISÍTOS

  FUNCIONAIS

    O software deve permitir que o gerente e os funcionários cadastrem os clientes.
    O software deve permitir que o gerente e os funcionários excluam os clientes.
    O software deve permitir que o gerente e os funcionários atualizem as informações de cadastro dos clientes.
    O software deve permitir que o gerente e os funcionários cadastrem filmes.
    O software deve permitir que o gerente e os funcionários excluam filmes.
    O software deve permitir que o gerente e os funcionários atualizem as informações de cadastro dos filmes.
    O software deve permitir que o gerente cadastre os fornecedores.
    O software deve permitir que o gerente exclua os fornecedores.
    O software deve permitir que o gerente altere as informações de cadastro dos fornecedores.
    O sistema deve gerar o relatório de lucros.
    O sistema deve gerar o relatório de vendas.
    O sistema deve gerar o relatório de despesas.
    O sistema deve gerar o relatório de locações.
    O sistema deve gerar relatórios com gráficos.
    O sistema deve imprimir os relatórios gerados.
    O software deve permitir que o cliente alugue filmes
    O software deve permitir que o cliente compre filmes.    

  NÃO FUNCIONAIS 
  
    O programa deve ser implementado com a linguagem de programação Java. 
    O banco de dados utilizado deverá ser o MySQL.
    
  SEGURANÇA
  
    O software deve contar com serviço de autenticação de funcionários e gerente.
    As senhas devem ser salvas utilizando encriptação do tipo MD5.
  
  NEGÓCIO

    O tempo máxima de aluguel dos filmes é de 3 (três) dias.
    Os filmes são classificados em 3 três categorias: 'Lançamento', 'Novo' e 'Antigo'.
    Os filmes classificados como 'lançamento' são aqueles que estão no mercado a 6 meses ou menos. (Faixa Dourada)
    Os filmes classificados como 'novo' ... (Faixa Prateada)
    Os filmes classificados como 'antigo' ... (Faixa Azul)
    O tempo máximo para locação dos filmes classificados como 'lançamento' é de 24 horas.
    O tempo máximo para locação dos filmes classificados como 'novo' é de XX horas.
    O tempo máximo para locação dos filmes classificados como 'antigo' é de XX horas.
    As multas são de 100% do valor de locação.
    Os filmes que não são entregues no prazo contam com uma multa a cada 24 horas.
    O sistema conta com um serviço de tele-entrega.
    Na primeira locação, o cliente poderá levar no máximo 3 (três) filmes.
