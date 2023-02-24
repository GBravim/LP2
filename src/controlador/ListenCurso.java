package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import visao.CursoGUI;

public class ListenCurso implements ActionListener{
	
	private CursoGUI GUI;
	
	public ListenCurso(CursoGUI GUI) {
		this.GUI = GUI;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == GUI.getBtnLimpar()) {	//Eventos do Botão Limpar
			GUI.getTextCodigo().setText("");
			GUI.getTextNome().setText("");
			GUI.getTextCargaH().setText("");
			GUI.getTextCoordenador().setText("");
			GUI.getArea().setSelectedItem("");
		}
		else {	//Eventos do Botão Enviar
			if(GUI.getTextCargaH().getText().isBlank() || GUI.getTextCodigo().getText().isBlank() || GUI.getTextCoordenador().getText().isBlank() || GUI.getTextNome().getText().isBlank() || GUI.getArea().getSelectedItem().toString().isBlank()) {
				JOptionPane.showMessageDialog(null, "Você esqueceu de preencher os campos!","Erro!", -1);	
			}
			else {
				GUI.getPessoa().setCurso(GUI.getTextNome().getText());
				GUI.getPessoa().setCodigo(GUI.getTextCodigo().getText());
				GUI.getPessoa().setCargaH(GUI.getTextCargaH().getText());
				GUI.getPessoa().setCoord(GUI.getTextCoordenador().getText());
				GUI.getPessoa().setArea(GUI.getArea().getSelectedItem().toString());
				GUI.setVisible(false);
				GUI.getRetorno().setPessoa(GUI.getPessoa());
				GUI.getRetorno().setVisible(true);
				JOptionPane.showMessageDialog(null, "DADOS CADASTRADOS COM SUCESSO!!");
				GUI.getDefaultCloseOperation();
			}
		}
	}

}
