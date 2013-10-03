package gui;

import java.text.ParseException;

import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
/**
 * Classe responsável pelas máscaras dos campos na janela.
 * @author Ândrei
 */
public class Formatacoes {
	
	    private MaskFormatter cpf;
	    private MaskFormatter rg;
	    private MaskFormatter telefone;
	    private MaskFormatter telefone2;
	    private MaskFormatter data;
	    private MaskFormatter cep;
	    private MaskFormatter tipo;
	    //private MaskFormatter 
	    /** Inicializa os campos */
		protected Formatacoes()
		{
			try {
				cpf = new MaskFormatter("###.###.###-##");
				cpf.setPlaceholderCharacter('_');
				rg = new MaskFormatter("#########");
				rg.setPlaceholderCharacter('_');
				telefone = new MaskFormatter("####-####");
				telefone.setPlaceholderCharacter('_');
				telefone2 = new MaskFormatter("####-####");
				telefone2.setPlaceholderCharacter('_');
				data = new MaskFormatter("##/##/####");
				data.setPlaceholderCharacter('_');
				cep = new MaskFormatter("#####-###");
				cep.setPlaceholderCharacter('_');
				tipo = new MaskFormatter("U");
				tipo.setPlaceholder(" ");
				tipo.setValidCharacters("CFA");
			} catch (ParseException e) {
				JOptionPane.showMessageDialog(null,"ERRO: Não foi possível criar as máscaras dos campos da janela.");
			}
		}
		/**
		 * @return the cpf
		 */
		public MaskFormatter getCpf() {
			return cpf;
		}
		/**
		 * @return the rg
		 */
		public MaskFormatter getRg() {
			return rg;
		}
		/**
		 * @return the telefone
		 */
		public MaskFormatter getTelefone2() {
			return telefone2;
		}
		/**
		 * @return the telefone
		 */
		public MaskFormatter getTelefone() {
			return telefone;
		}
		/**
		 * @return the data
		 */
		public MaskFormatter getData() {
			return data;
		}
		/**
		 * @return the cep
		 */
		public MaskFormatter getCep() {
			return cep;
		}
		/**
		 * @return the tipo
		 */
		public MaskFormatter getTipo() {
			return tipo;
		}	
}
