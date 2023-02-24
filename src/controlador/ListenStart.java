package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import visao.CadastroGUI;
import visao.LoginGUI;
import visao.StartGUI;

public class ListenStart implements ActionListener{
	
	private StartGUI GUI;
	
	public ListenStart(StartGUI GUI) {
		this.GUI = GUI;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == GUI.getBtnCadastra()) {	//Eventos para o Botão de Cadastro
			CadastroGUI cadastro = new CadastroGUI();
			GUI.setVisible(false);
			cadastro.setPessoa(GUI.getPessoa());
			cadastro.setTitle("Cadastro");
			cadastro.setRetorno(GUI);
			cadastro.setVisible(true);
		}
		else if(e.getSource() == GUI.getBtnLogin()) {	//Eventos para o Botão de Login
			LoginGUI login = new LoginGUI();
			GUI.setVisible(false);
			login.setRetorno(GUI);
			login.setPessoa(GUI.getPessoa());
			login.setTitle("Login");
			login.setVisible(true);
		}
		else {	//Eventos para o Botão Encerrar
			JOptionPane.showMessageDialog(null, GUI.getPessoa());
			JOptionPane.showMessageDialog(null, "Gabriel Brunoro Bravim","Aluno",-1);
			GUI.getDefaultCloseOperation();
			System.exit(0);
		}
	}

}
