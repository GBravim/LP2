package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Usuario;
import visao.CadastroGUI;

public class ListenCadastro implements ActionListener{
	
	private CadastroGUI GUI;
	
	public ListenCadastro(CadastroGUI GUI) {
		this.GUI = GUI;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == GUI.getBtnLimpar()) {	//Eventos do Botão Limpar
			GUI.getTextNome().setText("");
			GUI.getSenha().setText("");
		}else {	//Eventos do Botão Entrar
			if(GUI.getTextNome().getText().isBlank() || GUI.getSenha().getText().isBlank()) {
				JOptionPane.showMessageDialog(null,"Você esqueceu de preencher os campos!","Erro!", -1);
			}else {
				GUI.getRetorno().setPessoa(new Usuario(GUI.getTextNome().getText(),GUI.getSenha().getText()));
				GUI.setVisible(false);
				GUI.getRetorno().setVisible(true);
				JOptionPane.showMessageDialog(null, "CADASTRO REGISTRADO!");
				GUI.getDefaultCloseOperation();
			}
		}
	}

}
