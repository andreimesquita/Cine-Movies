Histórias

XP

1. Como funcionário, devo consultar os dados dos clientes cadastrados.
	*HU1. Como funcionário, devo consultar os dados dos clientes cadastrados
				
		HU2C01 Cenário normal

		O funcionário acessa a tela de consulta de clientes.
		O sistema apresenta a barra de pesquisa, um botão, e uma tabela contendo a lista de clientes cadastrados com seu respectivo código e nome.

			Exemplo:

			  Pesquisar [_________________________] (BUSCAR)

			  |	Código |               Nome                |
			  |	   1   | Ândrei d'Oliveira Mesquita Schuch |
			  |	   2   | Fabiana Canto Pergher             |
			  |	   3   | Augusto Frederico Ferreira Schuch |
		
		-> O funcionário digita algum nome na barra de pesquisa e pressiona o botão buscar.
		    Se existir algum cliente com aquele nome
				O sistema mostra apenas os clientes que tiverem o nome buscado.
			Se não existir nenhum cliente com o nome procurado
				O sistema mostra uma mesagem de erro para o usuário.
				
				Exemplo:
					
					"Não existem clientes com este nome!"
2. Como funcionário, devo poder inserir um novo cliente no sistema.

	*HU2. Como funcionário, devo poder inserir um novo cliente no sistema

3. Como funcionário, devo poder alterar as informações dos clientes cadastrados.

	*HU3. Como funcionário, devo poder alterar as informações dos clientes cadastrados
	
4. Como funcionário, devo poder remover um cliente do sistema.

	*HU4. Como funcionário, devo poder remover um cliente do sistema