/* TABELAS */ (
	/* CLIENTE [FEITO] */ (
		c�digo PK
		nome
		cpf
		rg
		sexo
		data_nascimento
		data_cadastro
		email
		telefone_fixo
		telefone_celular
		cep
		cidade_cod (cidade.codigo)
		bairro_cod (bairro.codigo)
		logradouro
		numero
		complemento
		UF*	
	)
	/* CONTA [FEITO] */ (
		c�digo PK
		c�digo_cliente (cliente.c�digo)
		saldo
	)
	/* DEPENDENTES [FEITO] */ (
		conta_cod (conta.c�digo)
		cliente_cod (cliente.c�digo)
	)
	/* BAIRRO [FEITO] */ (
		codigo PK
		nome
	)
	/* CIDADE [FEITO] */ (
		codigo PK
		bairro_cod (bairro.codigo)
		nome
	)
	/* FORNECEDOR [FEITO] */ (
		c�digo PK
		nome_empresarial
		cnpj
		nome_fantasia
		nome_responsavel
		telefone_empresarial
		telefone_celular
		cidade_cod (cidade.codigo)
		bairro_cod (bairro.codigo)
		UF*
		logradouro
		numero
		complemento
	)
 	/* FILME [FEITO] */ (
		c�digo PK
		t�tulo
		sinopse
		data_cadastro
		genero_cod (genero.c�digo)
		tipo_cod (tipo.c�digo)
		especie_cod (especie.codigo)
		localizacao_cod (localiza��o.c�digo)
	)
	/* LOCALIZA��O (PRATELEIRA 1, PRATELEIRA 5...) [FEITO] */ (
		c�digo PK
		nome
	)
	/* ESPECIE (Dublado ou Legendado [DUB/LEG]) [FEITO] */ (
		c�digo PK
		nome
	)
	/* DIRETOR [FEITO] */ (
		c�digo PK
		nome
	)
	/* ATOR [FEITO] */ (
		c�digo PK
		nome
	)
	/* CLASSIFICACAO (LAN�AMENTO,OURO,PRATA,BRONZE) [FEITO] */ (
		c�digo PK
		nome
	)
	/* TIPO (DVD ou Blu-ray) [FEITO] */ (	
		c�digo PK
		nome
	)
	/* GENERO (A��O,AVENTURA,TERROR...) [FEITO] */ (	
		c�digo PK
		nome
	)
	/* LOCACAO [FEITO] */(
		codigo PK
		conta_cod (conta.codigo)
		cliente_cod (cliente.cod)
		data_locacao
		valor_total
	)		
	/* LOCACAO_FILMES [FEITO] */ (
		locacao_cod (locacao.codigo)
		filme_cod (filme.codigo)
		data_devolucao DATE
		devolvido boolean default 'FALSE'
	)
)