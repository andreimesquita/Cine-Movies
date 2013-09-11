/* TABELAS */ (
	/* CLIENTE [FEITO] */ (
		código PK
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
		código PK
		código_cliente (cliente.código)
		saldo
	)
	/* DEPENDENTES [FEITO] */ (
		conta_cod (conta.código)
		cliente_cod (cliente.código)
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
		código PK
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
		código PK
		título
		sinopse
		data_cadastro
		genero_cod (genero.código)
		tipo_cod (tipo.código)
		especie_cod (especie.codigo)
		localizacao_cod (localização.código)
	)
	/* LOCALIZAÇÃO (PRATELEIRA 1, PRATELEIRA 5...) [FEITO] */ (
		código PK
		nome
	)
	/* ESPECIE (Dublado ou Legendado [DUB/LEG]) [FEITO] */ (
		código PK
		nome
	)
	/* DIRETOR [FEITO] */ (
		código PK
		nome
	)
	/* ATOR [FEITO] */ (
		código PK
		nome
	)
	/* CLASSIFICACAO (LANÇAMENTO,OURO,PRATA,BRONZE) [FEITO] */ (
		código PK
		nome
	)
	/* TIPO (DVD ou Blu-ray) [FEITO] */ (	
		código PK
		nome
	)
	/* GENERO (AÇÃO,AVENTURA,TERROR...) [FEITO] */ (	
		código PK
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