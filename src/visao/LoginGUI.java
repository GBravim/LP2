package visao;

import java.awt.EventQueue;
import modelo.Usuario;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ListenLogin;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LoginGUI extends JFrame {
	
	private ListenLogin LL = new ListenLogin(this);
	private JPanel contentPane;
	private StartGUI retorno;
	private Usuario pessoa;
	private JLabel lblLogin;
	private JLabel lblSenha;
	private JTextField textNome;
	private JPasswordField Senha;
	private JButton btnLimpar;
	private JButton btnEntra;
	private JButton btnVoltar;
	/**
	 * Cria objeto pessoa
	 */
	public void setPessoa(Usuario pessoa) {
		this.pessoa = pessoa;
	}	
	public void setRetorno(StartGUI retorno) {
		this.retorno = retorno;
	}
	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginGUI frame = new LoginGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Cria frame.
	 */
	public LoginGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 262, 247);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * Cria legenda lblLogin para o campo textNome
		 */
		lblLogin = new JLabel("LOGIN:");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogin.setBounds(10, 11, 64, 34);
		contentPane.add(lblLogin);
		/**
		 * Cria legenda lblSenha para o campo Senha
		 */
		lblSenha = new JLabel("SENHA: ");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(10, 66, 64, 34);
		contentPane.add(lblSenha);
		/**
		 * Cria campo textNome referente ao login do usuario
		 */
		textNome = new JTextField();
		textNome.addKeyListener(new KeyAdapter() {
			/**
			 * Tratamento de evento: Caso o usuario pressione "enter", muda para a proxima opcao (proximo campo)
			 */
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					e.getComponent().transferFocus();
				}
			}
		});
		textNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNome.setBounds(84, 12, 134, 34);
		contentPane.add(textNome);
		textNome.setColumns(10);
		/**
		 * Cria campo Senha referente a senha do usuario
		 */
		Senha = new JPasswordField();
		Senha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Senha.setBounds(84, 67, 134, 34);
		contentPane.add(Senha);
		/**
		 * Cria botao btnLimpar para limpar todos os campos preenchidos
		 */
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(LL);
		btnLimpar.setBounds(10, 111, 98, 23);
		contentPane.add(btnLimpar);
		/**
		 * Cria botao btnEntrar para fazer login
		 */
		btnEntra = new JButton("ENTRAR");
		btnEntra.addActionListener(LL);
		btnEntra.setBounds(118, 111, 100, 23);
		contentPane.add(btnEntra);
		/**
		 * Cria botao btnVoltar para voltar para a janela anterior
		 */
		btnVoltar = new JButton("VOLTAR");
		btnVoltar.addActionListener(LL);
		btnVoltar.setBounds(10, 159, 208, 23);
		contentPane.add(btnVoltar);
	}
	/*
	 * Getters e setters
	 */
	/**
	 * Retorna um objeto JTextField utilizado para entrada do nome do Usuario
	 * */
	public JTextField getTextNome() {
		return textNome;
	}
	/**
	 * Retorna um objeto JTextField utilizado para entrada da senha do Usuario
	 * */
	public JPasswordField getSenha() {
		return Senha;
	}
	/**
	 * Retorna um objeto JFrame que representa o frame principal do programa
	 * */
	public StartGUI getRetorno() {
		return retorno;
	}
	/**
	 * Retorna objeto Usuario atribuido ao frame atual
	 * */
	public Usuario getPessoa() {
		return pessoa;
	}
	/**
	 * Retorna objeto JButton atribuido à função de limpar os campos de entrada do frame
	 * */
	public JButton getBtnLimpar() {
		return btnLimpar;
	}
	/**
	 * Retorna objeto JButton atribuido à função de finalizar a entrada dos campos do frame
	 * */
	public JButton getBtnEntra() {
		return btnEntra;
	}
	/**
	 * Retorna objeto JButton atribuido à função de retornar ao frame principal do programa
	 * */
	public JButton getBtnVoltar() {
		return btnVoltar;
	}
}