package visao;

import java.awt.EventQueue;
import modelo.Usuario;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ListenStart;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StartGUI extends JFrame {
	
	private ListenStart LS = new ListenStart(this);
	private Usuario pessoa;
	private JPanel contentPane;
	private JLabel lblProjeto;
	private JButton btnCadastra;
	private JButton btnLogin;
	private JButton btnFinal;
	/**
	 * Atribui ao objeto StartGUI um objeto do tipo Usuario
	 */
	public void setPessoa(Usuario p) {
		this.pessoa = p;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartGUI frame = new StartGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Cria frame
	 */
	public StartGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 294, 213);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * Cria legenda lblProjeto "Projeto LP2"
		 */
		lblProjeto = new JLabel("Projeto LP2");
		lblProjeto.setBounds(109, 11, 84, 14);
		contentPane.add(lblProjeto);
		/**
		 * Cria botao btnCadastra para cadastrar novo usuario
		 */
		btnCadastra = new JButton("CADASTRAR NOVO USUÁRIO");
		btnCadastra.addActionListener(LS);
		btnCadastra.setBounds(10, 36, 258, 35);
		contentPane.add(btnCadastra);
		/**
		 * Cria botao btnLogin para realizar login
		 */
		btnLogin = new JButton("LOGIN");
		btnLogin.addActionListener(LS);
		btnLogin.setBounds(10, 82, 258, 35);
		contentPane.add(btnLogin);
		/**
		 * Cria botao btnFinal para encerrar sessao
		 */
		btnFinal = new JButton("ENCERRAR");
		btnFinal.addActionListener(LS);
		btnFinal.setBounds(10, 128, 258, 35);
		contentPane.add(btnFinal);
	}
	/**
	 * Método para retornar variável do tipo Usuario
	 * */
	public Usuario getPessoa() {
		return pessoa;
	}
	/**
	 * Método para retornar variável do tipo JButton visada para ser utilizada no cadastro
	 * */
	public JButton getBtnCadastra() {
		return btnCadastra;
	}

	/**
	 * Método para retornar variável do tipo JButton visada para ser utilizada no login 
	 * de um Usuario previamente cadastrado
	 * */
	public JButton getBtnLogin() {
		return btnLogin;
	}

	/**
	 * Método para retornar variável do tipo JButton visada para encerrar o programa
	 * */
	public JButton getBtnFinal() {
		return btnFinal;
	}
	
}