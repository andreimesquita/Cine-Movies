/* CRIAR TABELAS (MySQL) */ (
	/* Categoria */ (
		CREATE  TABLE IF NOT EXISTS Categoria (
		  codigo INT NOT NULL AUTO_INCREMENT,
		  denominacao VARCHAR(20) NOT NULL,
		  preco NUMERIC(10,2) NOT NULL,
		  tempo_locacao VARCHAR(45) NOT NULL,
		  PRIMARY KEY (codigo) 
		)
	/* Tipo */
		CREATE  TABLE IF NOT EXISTS Tipo (
		  cod INT NOT NULL AUTO_INCREMENT,
		  nome VARCHAR(50) NOT NULL,
		  PRIMARY KEY (cod) 
		)
	/* Genero */
		CREATE  TABLE IF NOT EXISTS Genero (
		  cod INT NOT NULL AUTO_INCREMENT,
		  nome VARCHAR(50) NOT NULL,
		  PRIMARY KEY (cod)
		)
	/* Filme */
	CREATE  TABLE IF NOT EXISTS Filme (
	  cod INT NOT NULL AUTO_INCREMENT,
	  titulo VARCHAR(100),
	  snopse VARCHAR(255),
	  data_cadastro DATE,
	  genero_cod INT REFERENCES Genero (cod),
	  tipo_cod INT REFERENCES Tipo (cod),
	  localizacao_cod INT REFERENCES Localizacao (cod),
	  especie_cod INT REFERENCES Especie (cod),
	  diretor_cod INT REFERENCES Diretor (cod),
	  classificacao_cod INT REFERENCES Classificacao (cod),
	  qnt INT NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Cliente */
	CREATE  TABLE IF NOT EXISTS Cliente (
	  cod INT NOT NULL AUTO_INCREMENT,
	  nome VARCHAR(80) NOT NULL,
	  cpf VARCHAR(12) NOT NULL,
	  rg VARCHAR(10) NOT NULL,
	  sexo CHAR(1) NOT NULL,
	  data_nascimento DATE NOT NULL,
	  data_cadastro DATE NOT NULL,
	  email VARCHAR(60) NOT NULL,
	  telefone_fixo VARCHAR(13) NOT NULL,
	  telefone_celular VARCHAR(13) NOT NULL,
	  cep VARCHAR(10) NOT NULL,
	  cidade_cod INT NOT NULL REFERENCES Cidade (cod),
	  bairro_cod INT NOT NULL REFERENCES Cidade (bairro_cod),
	  logradouro VARCHAR(60) NOT NULL,
	  numero INT NOT NULL,
	  complemento VARCHAR(45) NOT NULL,
	  UF CHAR(2) NOT NULL,
	  PRIMARY KEY (cod)
)
	/* Fornecedor */
	CREATE  TABLE IF NOT EXISTS Fornecedor (
	  cod INT NOT NULL AUTO_INCREMENT,
	  nome_empresarial VARCHAR(80) NOT NULL,
	  cnpj VARCHAR(18) NOT NULL,
	  nome_fantasia VARCHAR(60) NOT NULL,
	  logradouro VARCHAR(50) NOT NULL,
	  bairro_cod INT NOT NULL REFERENCES Cidade (bairro_cod),
	  numero INT NOT NULL,
	  complemento VARCHAR(100) NOT NULL,
	  UF CHAR(2) NOT NULL,
	  nome_responsavel VARCHAR(50) NOT NULL,
	  cidade_cod INT NOT NULL REFERENCES Cidade (cod),
	  PRIMARY KEY (cod)
	)
	
	/* Estado */
	CREATE  TABLE IF NOT EXISTS Estado (
	  codigo INT NOT NULL AUTO_INCREMENT,
	  valor VARCHAR(30) NOT NULL,
	  PRIMARY KEY (codigo)
	)
	/* Localizacao - Sele��o */
	/* Localizacao - Inser��o */
	/* Localizacao - Altera��o */
	/* Localizacao - Remo��o */
	/* Forn_Midia */
	CREATE  TABLE IF NOT EXISTS Forn_Midia (
	  Forn_codigo INT NOT NULL REFERENCES Fornecedor (codigo),
	  Midia_codigo INT NOT NULL REFERENCES Filme (codigo),
	  Estd_Forn_codigo INT NOT NULL REFERENCES Estado (codigo),
	  PRIMARY KEY (Forn_codigo)
	)
	/* Localizacao - Sele��o */
	/* Localizacao - Inser��o */
	/* Localizacao - Altera��o */
	/* Localizacao - Remo��o */
	/* Cli_Midia */
	CREATE  TABLE IF NOT EXISTS Cli_Midia (
	  codigo INT NOT NULL AUTO_INCREMENT ,
	  Cli_codigo INT NOT NULL REFERENCES Cliente (codigo),
	  total DECIMAL(10,2) NOT NULL ,
	  data_locacao DATE NOT NULL ,
	  PRIMARY KEY (codigo)
	)
	/* Cli_Media - Sele��o */
	
	/* Cli_Media - Inser��o */
	
	/* Cli_Media - Altera��o */
	
	/* Cli_Media - Remo��o */
	

	/* Filmes_Locados */
	CREATE  TABLE IF NOT EXISTS Filmes_Locados (
	  codigo INT NOT NULL,
	  quantidade INT NOT NULL,
	  cli_codigo INT NOT NULL REFERENCES Cli_Midia (Cli_codigo),
	  qnt INT NOT NULL,
	  midia_codigo VARCHAR(45) NULL,
	  PRIMARY KEY (codigo)
	)
	/* Filmes_Locados - Sele��o */
	
	/* Filmes_Locados - Inser��o */
	
	/* Filmes_Locados - Altera��o */
	
	/* Filmes_Locados - Remo��o */
	
	
	/* Copias */
	CREATE  TABLE IF NOT EXISTS Copias (
	  codigo INT NOT NULL AUTO_INCREMENT,
	  midia_codigo INT NOT NULL REFERENCES Filme (codigo),
	  PRIMARY KEY (codigo)
	)
	/* Copias - Sele��o */
	
	/* Copias - Inser��o */
	
	/* Copias - Altera��o */
	
	/* Copias - Remo��o */
	
	
	/* Bairro */
	CREATE  TABLE IF NOT EXISTS Bairro (
	  cod INT NOT NULL AUTO_INCREMENT,
	  nome VARCHAR(50) NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Bairro - Sele��o */

	/* Bairro - Inser��o */

	/* Bairro - Altera��o */
	
	/* Bairro - Remo��o */
	
	
	/* Cidade */
	CREATE  TABLE IF NOT EXISTS Cidade (
	  cod INT NOT NULL AUTO_INCREMENT,
	  bairro_cod INT NOT NULL REFERENCES Bairro (cod),
	  nome VARCHAR(50) NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Cidade - Sele��o */

	/* Cidade - Inser��o */

	/* Cidade - Altera��o */

	/* Cidade - Remo��o */
	
	
	/* Fornecedor */
	CREATE  TABLE IF NOT EXISTS Fornecedor (
	  cod INT NOT NULL AUTO_INCREMENT,
	  nome_empresarial VARCHAR(80) NOT NULL,
	  cnpj VARCHAR(18) NOT NULL,
	  nome_fantasia VARCHAR(60) NOT NULL,
	  logradouro VARCHAR(50) NOT NULL,
	  bairro_cod INT NOT NULL REFERENCES Cidade (bairro_cod),
	  numero INT NOT NULL,
	  complemento VARCHAR(100) NOT NULL,
	  UF CHAR(2) NOT NULL,
	  nome_responsavel VARCHAR(50) NOT NULL,
	  cidade_cod INT NOT NULL REFERENCES Cidade (cod),
	  PRIMARY KEY (cod)
	)
	/* Fornecedor - Sele��o */
	
	/* Fornecedor - Inser��o */
	
	/* Fornecedor - Altera��o */
	
	/* Fornecedor - Remo��o */
	
	
	/* Cliente */
	CREATE  TABLE IF NOT EXISTS Cliente (
	  cod INT NOT NULL AUTO_INCREMENT,
	  nome VARCHAR(80) NOT NULL,
	  cpf VARCHAR(14) NOT NULL,
	  rg VARCHAR(10) NOT NULL,
	  sexo CHAR(1) NOT NULL,
	  data_nascimento DATE NOT NULL,
	  data_cadastro DATE NOT NULL,
	  email VARCHAR(60) NOT NULL,
	  telefone_fixo VARCHAR(13) NOT NULL,
	  telefone_celular VARCHAR(13) NOT NULL,
	  cep VARCHAR(10) NOT NULL,
	  cidade_cod INT NOT NULL REFERENCES Cidade (cod),
	  bairro_cod INT NOT NULL REFERENCES Cidade (bairro_cod),
	  logradouro VARCHAR(60) NOT NULL,
	  numero INT NOT NULL,
	  complemento VARCHAR(45) NOT NULL,
	  UF CHAR(2) NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Cliente - Sele��o */
	SELECT * FROM cliente WHERE cod = ? ORDER BY nome ASC
	SELECT * FROM cliente WHERE nome like '%?%'ORDER BY nome ASC
	/* Cliente - Inser��o */
	INSERT INTO cliente(nome,cpf,rg,sexo,data_nascimento,data_cadastro,email,telefone_fixo,
	telefone_celular,cep,cidade_cod,bairro_cod,logradouro,numero,complemento,uf) VALUES
	(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
	/* Cliente - Altera��o */
	UPDATE cliente SET nome = ?,cpf = ?,rg = ?,sexo = ?,data_nascimento = ?,
	data_cadastro = ?,email = ?,telefone_fixo = ?,telefone_celular = ?,cep,cidade_cod = ?,
	bairro_cod = ?,logradouro = ?,numero = ?,complemento = ?,uf = ?) WHERE cod = ?
	/* Cliente - Remo��o */
	DELETE FROM cliente WHERE cod = ?
	/* Dependentes */
	CREATE  TABLE IF NOT EXISTS Dependentes (
	  conta_cod INT NOT NULL REFERENCES Conta(cod),
	  cliente_cod VARCHAR(45) NOT NULL REFERENCES Cliente(cod),
	  data_dependencia DATE NOT NULL 
	)
	
	/* Dependentes - Sele��o */
	SELECT * FROM dependentes ORDER BY cliente_cod ASC
	SELECT * FROM dependentes WHERE conta_od - ?
	SELECT * FROM dependentes WHERE cliente_cod = ?
	SELECT * FROM dependentes WHERE data_dependencia BETWEEN ? AND ?
	/* Dependentes - Inser��o */
	INSERT INTO dependentes(conta_cod,cliente_cod,data_dependencia) VALUES(?,?,?)
	/* Dependentes - Altera��o */
	UPDATE dependentes SET cliente_cod = ?, data_dependencia = ? WHERE conta_cod = ?
	UPDATE dependentes SET conta_cod = ?, data_dependencia = ? WHERE cliente_cod = ?
	/* Dependentes - Remo��o */
	DELETE FROM dependentes WHERE conta_cod = ?
	DELETE FROM dependentes WHERE cliente_cod = ?
	/* Conta */
	CREATE  TABLE IF NOT EXISTS Conta (
	  cod INT NOT NULL AUTO_INCREMENT,
	  codigo_cliente INT NOT NULL REFERENCES Cliente (cod),
	  saldo NUMERIC(10,2) NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Conta - Sele��o */
	SELECT * FROM conta ORDER BY codigo_cliente ASC
	SELECT * FROM conta WHERE cod = ?
	SELECT * FROM conta WHERE cod_cliente = ?
	/* conta - Inser��o */
	INSERT INTO conta(nome) VALUES(?)
	/* conta - Altera��o */
	UPDATE conta SET nome = ? WHERE cod = ?
	/* conta - Remo��o */
	DELETE FROM conta WHERE cod = ?
	
	/* Localizacao */
	CREATE  TABLE IF NOT EXISTS Localizacao (
	  cod INT NOT NULL AUTO_INCREMENT,
	  nome VARCHAR(45) NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Localizacao - Sele��o */
	SELECT * FROM localizacao ORDER BY nome ASC;
	SELECT * FROM localizacao WHERE cod = ?;
	/* Localizacao - Inser��o */
	INSERT INTO localizacao(nome) VALUES(?)
	/* Localizacao - Altera��o */
	UPDATE localizacao SET nome = ? WHERE cod = ?
	/* Localizacao - Remo��o */	
	DELETE FROM localizacao WHERE cod = ?;
	/* Especie */
	CREATE  TABLE IF NOT EXISTS Especie (
	  cod INT NOT NULL AUTO_INCREMENT,
	  nome VARCHAR(45) NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Esp�cie - Sele��o */
	SELECT * FROM especie ORDER BY nome ASC;
	SELECT * FROM especie WHERE cod = ?;
	/* Esp�cie - Inser��o */
	INSERT INTO especie(nome) VALUES(?)
	/* Esp�cie - Altera��o */
	UPDATE especie SET nome = ? WHERE cod = ?
	/* Esp�cie - Remo��o */
	DELETE FROM especie WHERE cod = ?;
	/* Diretor */
	CREATE  TABLE IF NOT EXISTS Diretor (
	  cod INT NOT NULL AUTO_INCREMENT,
	  nome VARCHAR(60) NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Tipo */
	CREATE  TABLE IF NOT EXISTS Tipo (
	  cod INT NOT NULL AUTO_INCREMENT,
	  nome VARCHAR(50) NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Genero */
	CREATE  TABLE IF NOT EXISTS Genero (
	  cod INT NOT NULL AUTO_INCREMENT,
	  nome VARCHAR(50) NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Classificacao */
	CREATE  TABLE IF NOT EXISTS Classificacao (
	  cod INT NOT NULL AUTO_INCREMENT,
	  nome VARCHAR(50) NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Filme */
	CREATE  TABLE IF NOT EXISTS Filme (
	  cod INT NOT NULL AUTO_INCREMENT,
	  titulo VARCHAR(100) NOT NULL,
	  snopse VARCHAR(255) NOT NULL,
	  data_cadastro DATE NOT NULL,
	  genero_cod INT REFERENCES Genero (cod),
	  tipo_cod INT REFERENCES Tipo (cod),
	  localizacao_cod INT REFERENCES Localizacao (cod),
	  especie_cod INT REFERENCES Especie (cod),
	  diretor_cod INT REFERENCES Diretor (cod),
	  classificacao_cod VARCHAR(45) REFERENCES Classificacao (cod),
	  qnt INT NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Ator */
	CREATE  TABLE IF NOT EXISTS Ator (
	  cod INT NOT NULL AUTO_INCREMENT ,
	  nome VARCHAR(60) NOT NULL ,
	  PRIMARY KEY (cod)
	)
	/* ator_filme */
	CREATE  TABLE IF NOT EXISTS ator_filme (
	  cod_ator INT NULL REFERENCES Ator (cod),
	  cod_filme INT NOT NULL REFERENCES Filme (cod),
		FOREIGN KEY (cod_ator, cod_filme)
	)
	-- -----------------------------------------------------
	-- Table `mydb`.`Locacao`
	-- -----------------------------------------------------
	CREATE  TABLE IF NOT EXISTS Locacao (
	  codigo INT NOT NULL AUTO_INCREMENT ,
	  conta_cod INT NOT NULL REFERENCES Conta (cod),
	  cliente_cod INT NOT NULL REFERENCES Cliente (cod),
	  data_locacao DATE NOT NULL ,
	  valor_total DECIMAL(10,2) NOT NULL ,
	  PRIMARY KEY (codigo),
	  FOREIGN KEY (conta_cod)
	)
	-- -----------------------------------------------------
	-- Table `mydb`.`Locacao_filmes`
	-- -----------------------------------------------------
	CREATE  TABLE IF NOT EXISTS Locacao_filmes (
	  locacao_cod INT NOT NULL REFERENCES Locacao (codigo),
	  filme_cod INT NOT NULL REFERENCES Filme (cod),
	  data_devolucao DATE NOT NULL ,
	  devolvido boolean NOT NULL DEFAULT false ,
		FOREIGN KEY (filme_cod),
		FOREIGN KEY (locacao_cod)
	)
)
/* VIEWS */