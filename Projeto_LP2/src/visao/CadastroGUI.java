package visao;

import java.awt.EventQueue;
import modelo.Usuario;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ListenCadastro;

import javax.print.attribute.standard.JobPrioritySupported;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroGUI extends JFrame {
	
	private ListenCadastro LC = new ListenCadastro(this);
	private JPanel contentPane;
	private StartGUI retorno;
	private Usuario pessoa;
	private JTextField textNome;
	private JPasswordField senha;
	private JLabel lblUsuario;
	private JLabel lblSenha;
	private JButton btnEntrar;
	private JButton btnLimpar;
	
	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroGUI frame = new CadastroGUI();
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
	public CadastroGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 337);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * Cria campo textNome referente ao nome do usuario
		 */
		textNome = new JTextField();
		textNome.addKeyListener(new KeyAdapter() {
			/**
			 * Tratamento de evento: Caso o usuÃ¡rio pressione "enter", muda para a proxima opcao (proximo campo)
			 */
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					e.getComponent().transferFocus();
				}
			}
		});
		textNome.setBounds(136, 37, 163, 34);
		contentPane.add(textNome);
		textNome.setColumns(10);
		/**
		 * Cria legenda lblUsuario referente ao campo textNome
		 */
		lblUsuario = new JLabel("NOME: ");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(62, 37, 144, 34);
		contentPane.add(lblUsuario);
		/**
		 * Cria legenda lblSenha referente ao campo senha
		 */
		lblSenha = new JLabel("SENHA: ");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenha.setBounds(62, 94, 144, 34);
		contentPane.add(lblSenha);
		/**
		 * Cria botao btnLimpar para limpar todos os campos preenchidos
		 */
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(LC);
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLimpar.setBounds(62, 183, 89, 23);
		contentPane.add(btnLimpar);
		/**
		 * Cria botao btnEntrar para fazer login
		 */
		btnEntrar = new JButton("ENTRAR");
		btnEntrar.addActionListener(LC);
		btnEntrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEntrar.setBounds(210, 183, 89, 23);
		contentPane.add(btnEntrar);
		/**
		 * Cria campo de senha (senha)
		 */
		senha = new JPasswordField();
		senha.addActionListener(LC);
		senha.addKeyListener(new KeyAdapter() {
			/**
			 * Tratamento de evento: Caso o usuario pressione "enter", o botao btnEntrar eh acionado
			 */
			public void keyPressed(KeyEvent e) {
				e.setSource(btnEntrar);
			}
		});
		senha.setBounds(136, 96, 163, 34);
		contentPane.add(senha);
	}
	/*
	 * Setters e getters
	 */
	/**
	 * Atribui um objeto Usuario ao frame
	 * */
	public void setPessoa(Usuario p) {
		this.pessoa = p;
	}
	/**
	 * Atribui um objeto JFrame que será referenciado como o frame principal para o programa
	 * */
	public void setRetorno(StartGUI retorno) {
		this.retorno = retorno;
	}
	/**
	 * Retorna um objeto JFrame referenciado como o frame principal para o programa
	 * */
	public StartGUI getRetorno() {
		return retorno;
	}
	/**
	 * Retorna um objeto JTextField utilizado para entrada do nome do Usuario a ser cadastrado
	 * */
	public JTextField getTextNome() {
		return textNome;
	}
	/**
	 * Retorna um objeto JPasswordField utilizado para entrada da senha atribuida ao Usuario a ser cadastrado
	 * */
	public JPasswordField getSenha() {
		return senha;
	}
	/**
	 * Retorna um objeto Usuario
	 * */
	public Usuario getPessoa() {
		return pessoa;
	}
	/**
	 * Retorna um objeto JButton atribuido à função de finalizar o cadastro de Usuario
	 * */
	public JButton getBtnEntrar() {
		return btnEntrar;
	}
	/**
	 * Retorna um objeto JButton atribuido à função de limpar os campos de entrada o frame de cadastro
	 * */
	public JButton getBtnLimpar() {
		return btnLimpar;
	}
}