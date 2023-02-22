package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import visao.CursoGUI;
import visao.LoginGUI;

public class ListenLogin implements ActionListener{
	
	private LoginGUI GUI;
	
	public ListenLogin(LoginGUI GUI) {
		this.GUI = GUI;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == GUI.getBtnLimpar()) {	//Eventos referentes ao bot�o Limpar
			GUI.getTextNome().setText("");
			GUI.getSenha().setText("");
		}
		else if(e.getSource() == GUI.getBtnEntra()) {	//Eventos referentes ao bot�o Entrar
			if(GUI.getPessoa() == null) {
				//Caso n�o h� nenhum registro previamente feito
				
				JOptionPane.showMessageDialog(GUI, "N�O H� CADASTRO REGISTRADO!", "ERRO", 0);
			
			}else if(GUI.getTextNome().getText().isBlank() || GUI.getSenha().getText().isBlank()) {
				//Caso haja algum campo n�o preenchido
			
				JOptionPane.showMessageDialog(GUI,"Voc� esqueceu de preencher os campos!", "Erro!",-1);
			
			}else if(GUI.getTextNome().getText().equals(GUI.getPessoa().getNome()) && GUI.getSenha().getText().equals(GUI.getPessoa().getSenha())) {
				//Caso de Login realizado com sucesso
			
				CursoGUI curso = new CursoGUI();
				curso.setRetorno(GUI.getRetorno());
				curso.setPessoa(GUI.getPessoa());
				curso.setTitle("Curso");
				curso.setVisible(true);
				GUI.setVisible(false);
				GUI.getDefaultCloseOperation();
			
			}else {
				//Caso de Login ou Senha Inv�lidos
				JOptionPane.showMessageDialog(null, "Login e/ou Senha Inv�lido(s)!", "Erro!",0);
			}
		}
		else {	//Eventos referentes ao bot�o Voltar
			GUI.setVisible(false);
			GUI.setDefaultCloseOperation(0);
			GUI.getRetorno().setVisible(true);
		}
	}

}
