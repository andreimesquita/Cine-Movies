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
	/* Localizacao - Seleção */
	/* Localizacao - Inserção */
	/* Localizacao - Alteração */
	/* Localizacao - Remoção */
	/* Forn_Midia */
	CREATE  TABLE IF NOT EXISTS Forn_Midia (
	  Forn_codigo INT NOT NULL REFERENCES Fornecedor (codigo),
	  Midia_codigo INT NOT NULL REFERENCES Filme (codigo),
	  Estd_Forn_codigo INT NOT NULL REFERENCES Estado (codigo),
	  PRIMARY KEY (Forn_codigo)
	)
	/* Localizacao - Seleção */
	/* Localizacao - Inserção */
	/* Localizacao - Alteração */
	/* Localizacao - Remoção */
	/* Cli_Midia */
	CREATE  TABLE IF NOT EXISTS Cli_Midia (
	  codigo INT NOT NULL AUTO_INCREMENT ,
	  Cli_codigo INT NOT NULL REFERENCES Cliente (codigo),
	  total DECIMAL(10,2) NOT NULL ,
	  data_locacao DATE NOT NULL ,
	  PRIMARY KEY (codigo)
	)
	/* Cli_Media - Seleção */
	
	/* Cli_Media - Inserção */
	
	/* Cli_Media - Alteração */
	
	/* Cli_Media - Remoção */
	

	/* Filmes_Locados */
	CREATE  TABLE IF NOT EXISTS Filmes_Locados (
	  codigo INT NOT NULL,
	  quantidade INT NOT NULL,
	  cli_codigo INT NOT NULL REFERENCES Cli_Midia (Cli_codigo),
	  qnt INT NOT NULL,
	  midia_codigo VARCHAR(45) NULL,
	  PRIMARY KEY (codigo)
	)
	/* Filmes_Locados - Seleção */
	
	/* Filmes_Locados - Inserção */
	
	/* Filmes_Locados - Alteração */
	
	/* Filmes_Locados - Remoção */
	
	
	/* Copias */
	CREATE  TABLE IF NOT EXISTS Copias (
	  codigo INT NOT NULL AUTO_INCREMENT,
	  midia_codigo INT NOT NULL REFERENCES Filme (codigo),
	  PRIMARY KEY (codigo)
	)
	/* Copias - Seleção */
	
	/* Copias - Inserção */
	
	/* Copias - Alteração */
	
	/* Copias - Remoção */
	
	
	/* Bairro */
	CREATE  TABLE IF NOT EXISTS Bairro (
	  cod INT NOT NULL AUTO_INCREMENT,
	  nome VARCHAR(50) NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Bairro - Seleção */

	/* Bairro - Inserção */

	/* Bairro - Alteração */
	
	/* Bairro - Remoção */
	
	
	/* Cidade */
	CREATE  TABLE IF NOT EXISTS Cidade (
	  cod INT NOT NULL AUTO_INCREMENT,
	  bairro_cod INT NOT NULL REFERENCES Bairro (cod),
	  nome VARCHAR(50) NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Cidade - Seleção */

	/* Cidade - Inserção */

	/* Cidade - Alteração */

	/* Cidade - Remoção */
	
	
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
	/* Fornecedor - Seleção */
	
	/* Fornecedor - Inserção */
	
	/* Fornecedor - Alteração */
	
	/* Fornecedor - Remoção */
	
	
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
	/* Cliente - Seleção */
	SELECT * FROM cliente WHERE cod = ? ORDER BY nome ASC
	SELECT * FROM cliente WHERE nome like '%?%'ORDER BY nome ASC
	/* Cliente - Inserção */
	INSERT INTO cliente(nome,cpf,rg,sexo,data_nascimento,data_cadastro,email,telefone_fixo,
	telefone_celular,cep,cidade_cod,bairro_cod,logradouro,numero,complemento,uf) VALUES
	(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)
	/* Cliente - Alteração */
	UPDATE cliente SET nome = ?,cpf = ?,rg = ?,sexo = ?,data_nascimento = ?,
	data_cadastro = ?,email = ?,telefone_fixo = ?,telefone_celular = ?,cep,cidade_cod = ?,
	bairro_cod = ?,logradouro = ?,numero = ?,complemento = ?,uf = ?) WHERE cod = ?
	/* Cliente - Remoção */
	DELETE FROM cliente WHERE cod = ?
	/* Dependentes */
	CREATE  TABLE IF NOT EXISTS Dependentes (
	  conta_cod INT NOT NULL REFERENCES Conta(cod),
	  cliente_cod VARCHAR(45) NOT NULL REFERENCES Cliente(cod),
	  data_dependencia DATE NOT NULL 
	)
	
	/* Dependentes - Seleção */
	SELECT * FROM dependentes ORDER BY cliente_cod ASC
	SELECT * FROM dependentes WHERE conta_od - ?
	SELECT * FROM dependentes WHERE cliente_cod = ?
	SELECT * FROM dependentes WHERE data_dependencia BETWEEN ? AND ?
	/* Dependentes - Inserção */
	INSERT INTO dependentes(conta_cod,cliente_cod,data_dependencia) VALUES(?,?,?)
	/* Dependentes - Alteração */
	UPDATE dependentes SET cliente_cod = ?, data_dependencia = ? WHERE conta_cod = ?
	UPDATE dependentes SET conta_cod = ?, data_dependencia = ? WHERE cliente_cod = ?
	/* Dependentes - Remoção */
	DELETE FROM dependentes WHERE conta_cod = ?
	DELETE FROM dependentes WHERE cliente_cod = ?
	/* Conta */
	CREATE  TABLE IF NOT EXISTS Conta (
	  cod INT NOT NULL AUTO_INCREMENT,
	  codigo_cliente INT NOT NULL REFERENCES Cliente (cod),
	  saldo NUMERIC(10,2) NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Conta - Seleção */
	SELECT * FROM conta ORDER BY codigo_cliente ASC
	SELECT * FROM conta WHERE cod = ?
	SELECT * FROM conta WHERE cod_cliente = ?
	/* conta - Inserção */
	INSERT INTO conta(nome) VALUES(?)
	/* conta - Alteração */
	UPDATE conta SET nome = ? WHERE cod = ?
	/* conta - Remoção */
	DELETE FROM conta WHERE cod = ?
	
	/* Localizacao */
	CREATE  TABLE IF NOT EXISTS Localizacao (
	  cod INT NOT NULL AUTO_INCREMENT,
	  nome VARCHAR(45) NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Localizacao - Seleção */
	SELECT * FROM localizacao ORDER BY nome ASC;
	SELECT * FROM localizacao WHERE cod = ?;
	/* Localizacao - Inserção */
	INSERT INTO localizacao(nome) VALUES(?)
	/* Localizacao - Alteração */
	UPDATE localizacao SET nome = ? WHERE cod = ?
	/* Localizacao - Remoção */	
	DELETE FROM localizacao WHERE cod = ?;
	/* Especie */
	CREATE  TABLE IF NOT EXISTS Especie (
	  cod INT NOT NULL AUTO_INCREMENT,
	  nome VARCHAR(45) NOT NULL,
	  PRIMARY KEY (cod)
	)
	/* Espécie - Seleção */
	SELECT * FROM especie ORDER BY nome ASC;
	SELECT * FROM especie WHERE cod = ?;
	/* Espécie - Inserção */
	INSERT INTO especie(nome) VALUES(?)
	/* Espécie - Alteração */
	UPDATE especie SET nome = ? WHERE cod = ?
	/* Espécie - Remoção */
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