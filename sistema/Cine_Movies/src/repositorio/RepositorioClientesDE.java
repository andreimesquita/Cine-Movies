package repositorio;

import repositorio.modelo.Cliente;
/** 
 * Reposit�rio dos clientes.
 */
public class RepositorioClientesDE {

	private Cliente inicio, fim;
	private int tamanho;
	/** Adiciona uma informa��o no fim da lita. */
	public void add(Cliente cliente) {
		addNoFim(cliente);
	}
	/** Adiciona uma informa��o no final da lista. */
	public void addNoFim(Cliente cliente) {
		if (tamanho == 0)
			inicio = fim = cliente;
		else {
			fim.setProximo(cliente);
			cliente.setAnterior(fim);
			fim = cliente;
		}
		tamanho++;
	}
	/** Adiciona uma informação no início da lista. */
	public void addNoInicio(Cliente cliente) {
		if (tamanho == 0)
			inicio = fim = cliente;
		else {
			inicio.setAnterior(cliente);
			cliente.setProximo(inicio);
			inicio = cliente;
		}
		tamanho++;
	}
	/**
	 * Adiciona uma informação na lista na posição enviada ccomo parâmetro.
	 */
	public void addPorIndice(int indice,Cliente cliente) {
		if (indice == 0) {
			addNoInicio(cliente);
		} else if (indice == tamanho) {
			addNoFim(cliente);
		} else {
			Cliente ClienteNaPosicao = getCliente(indice);
			Cliente anterior = ClienteNaPosicao.getAnterior();
			cliente.setProximo(ClienteNaPosicao);
			ClienteNaPosicao.setAnterior(cliente);
			cliente.setAnterior(anterior);
			anterior.setProximo(cliente);
			tamanho++;
		}
	}

	/** Remove a primeira informação da lista. */
	public Cliente removePrimeiro() {
		Cliente ClienteInicioCopy = inicio;
		if (tamanho == 0) {
			return null; // gerar exceção se for o caso.
		} else if (tamanho == 1) {
			inicio = fim = null;
		} else {
			inicio = inicio.getProximo();
			inicio.setAnterior(null);
		}
		tamanho--;
		return (ClienteInicioCopy);
	}

	/** Remove a ultima informação na lista. */
	public Cliente removeUltimo() {
		Cliente clienteFimCopy = fim;
		if (tamanho == 0) {
			return null;
		} else if (tamanho == 1) {
			inicio = fim = null;
		} else {
			fim = fim.getAnterior();
			fim.setProximo(null);
		}
		tamanho--;
		return (clienteFimCopy);
	}

	/** Remove uma informação em uma determinada posição. */
	public Cliente remove(int index) {
		if(index < 0 || index >= tamanho) return null;
		if (index == 0) {
			return removePrimeiro();
		}
		if (index == (tamanho - 1)) {
			return removeUltimo();
		}
		Cliente clienteAtual = getCliente(index);
		Cliente clienteAnterior = clienteAtual.getAnterior();
		clienteAnterior.setProximo(clienteAtual.getProximo());
		tamanho--;
		return (clienteAtual);

	}

	/** Retorna o primeiro elemento da lista. */
	public Cliente getPrimeiroCliente() {
		return inicio;
	}

	/** Retorna o último elemento da lista. */
	public Cliente getUltimoCliente() {
		return fim;
	}

	/** Retorna o tamaho da lista. */
	public int getTamanho() {
		return tamanho;
	}

	/** Retorna o índice do objeto enviado como parâmetro. */
	public int getIndice(Cliente cliente) {
		int ct = 0;
		for (Cliente aux = inicio; aux != null; aux = aux.getProximo()) {
			if (aux.getCodigo() == cliente.getCodigo()) {
				return (ct);
			}
			ct++;
		}
		return (-1);
	}

	/** Retorna o objeto pelo índice enviado como parâmetro. */
	public Cliente get(int indice) {
		return (getCliente(indice));
	}

	/** Retorna o objeto pelo índice enviado como parâmetro. */
	private Cliente getCliente(int indice) {
		Cliente aux = inicio;
		if (indice >= tamanho) {
			return null;
		}
		for (int cont = 0; cont < indice; cont++) {
			aux = aux.getProximo();
		}
		return (aux);
	}

	/** Atualiza o dado contido em determinada posição na lista. */
	public void set(int index, Object dado) {
		getCliente(index);
	}
	/**
	 * 
	 * @return retorna uma parte da lista entre os elementos da posição posIni
	 *         e, inclusive, da posição posFim.
	 */
	public RepositorioClientesDE sublista(int posIni, int posFim) {
		if (posFim >= tamanho) {
			throw new NullPointerException(
					"Posi��o final � maior do que o tamanho da lista.");
		}
		RepositorioClientesDE lde = new RepositorioClientesDE();
		for (int x = 0; x < posIni; x++) {
			inicio = inicio.getProximo();
		}
		for (int x = posIni; x <= posFim; x++) {
			lde.add(inicio);
			inicio = inicio.getProximo();
		}
		return lde;
	}
	/**
	 * inverte os elementos da lista.
	 * @deprecated
	 */
	public void inverter() {
		Cliente inicioCopy = inicio;
		Cliente fimCopy = fim;
		for (Cliente e = inicio; e != null; e = e.getAnterior()) {
			Cliente proximo = e.getProximo();
			e.setProximo(e.getAnterior());
			e.setAnterior(proximo);
		}
		inicio = fimCopy;
		fim = inicioCopy;
	}
}