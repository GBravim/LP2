package principal;

import visao.StartGUI;
import modelo.Usuario;
//import controlador.*;

public class Main {

	public static void main(String[] args) {
		StartGUI tela = new StartGUI();
		Usuario pessoa = null;
		
		tela.setPessoa(pessoa);
		tela.setTitle("Projeto");
		tela.setVisible(true);
	}
}