package visao;

import java.awt.EventQueue;
import modelo.Usuario;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ListenCurso;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CursoGUI extends JFrame {
	
	private ListenCurso LC = new ListenCurso(this);
	private JPanel contentPane;
	private StartGUI retorno;
	private Usuario pessoa;
	private JTextField textCodigo;
	private JTextField textNome;
	private JTextField textCargaH;
	private JTextField textCoordenador;
	private JButton btnEnviar;
	private JButton btnLimpar;
	private JComboBox area;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CursoGUI frame = new CursoGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CursoGUI() {
		/**
		 * Definição das extremidades do frame
		 * */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		/**
		 * Adição do campo de texto para entrada do código do curso
		 * */
		textCodigo = new JTextField();
		textCodigo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					e.getComponent().transferFocus();
				}
			}
		});
		textCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textCodigo.setBounds(51, 38, 267, 29);
		contentPane.add(textCodigo);
		textCodigo.setColumns(10);
		/**
		 * Adição do rótulo referente ao código do curso
		 * */
		JLabel lblCodigo = new JLabel("CÓDIGO:");
		lblCodigo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigo.setBounds(51, 10, 59, 34);
		contentPane.add(lblCodigo);
		/**
		 * Adição do rótulo referente ao nome do curso
		 * */
		JLabel lblNome = new JLabel("NOME DO CURSO:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNome.setBounds(51, 77, 167, 34);
		contentPane.add(lblNome);
		/**
		 * Adição do campo de Entrada para o nome do curso
		 * */
		textNome = new JTextField();
		textNome.addKeyListener(new KeyAdapter() {
			/**
			 * Evento para tratar a leitura da tecla ENTER de forma que transfira para o próximo
			 * campo com que se possa interagir
			 * */
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					e.getComponent().transferFocus();
				}
			}
		});
		textNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textNome.setColumns(10);
		textNome.setBounds(51, 106, 267, 29);
		contentPane.add(textNome);
		/**
		 * Adição do rótulo referente à carga horaria do curso
		 * */
		JLabel lblCargaHorria = new JLabel("CARGA HORÁRIA:");
		lblCargaHorria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCargaHorria.setBounds(51, 145, 138, 34);
		contentPane.add(lblCargaHorria);
		/**
		 * Adição do campo de texto para entrada da Carga Horária do curso
		 * */
		textCargaH = new JTextField();
		textCargaH.addKeyListener(new KeyAdapter() {
			/**
			 * Evento para tratar a leitura da tecla ENTER de forma que transfira para o próximo
			 * campo com que se possa interagir
			 * */
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					e.getComponent().transferFocus();
				}
			}
		});
		textCargaH.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textCargaH.setColumns(10);
		textCargaH.setBounds(52, 173, 267, 29);
		contentPane.add(textCargaH);
		/**
		 * Adição do rótulo referente à área do curso
		 * */
		JLabel lblArea = new JLabel("ÁREA:");
		lblArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblArea.setBounds(51, 212, 138, 34);
		contentPane.add(lblArea);
		/**
		 * Adição de uma JComboBox contendo alguns exemplos de possíveis áreas para entrada do curso
		 * */
		area = new JComboBox();
		area.addKeyListener(new KeyAdapter() {
			/**
			 * Evento para tratar a leitura da tecla ENTER de forma que transfira para o próximo
			 * campo com que se possa interagir
			 * */
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					e.getComponent().transferFocus();
				}
			}
		});
		area.setModel(new DefaultComboBoxModel(new String[] {"", "Ciência da Computação", "Matemática", "Estatástica", "Ciências Atuariais"}));
		area.setFont(new Font("Tahoma", Font.PLAIN, 14));
		area.setBounds(51, 242, 267, 29);
		contentPane.add(area);
		/**
		 * Adição do campo de texto para entrada do nome do Coordenador do Curso
		 * */
		textCoordenador = new JTextField();
		textCoordenador.addActionListener(LC);
		textCoordenador.addKeyListener(new KeyAdapter() {
			/**
			 * Evento para tratar a leitura da tecla ENTER da mesma forma que o campo do Botão ENVIAR é tratado
			 * */
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					e.setSource(btnEnviar);
				}
			}
		});
		textCoordenador.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textCoordenador.setColumns(10);
		textCoordenador.setBounds(52, 309, 267, 29);
		contentPane.add(textCoordenador);
		/**
		 * Adição do rótulo "Coordenador"
		 * */
		JLabel lblCoordenador = new JLabel("COORDENADOR:");
		lblCoordenador.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCoordenador.setBounds(51, 281, 138, 34);
		contentPane.add(lblCoordenador);
		/**
		 * Adição do Botão para Limpar os campos
		 * */
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.addActionListener(LC);
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLimpar.setBounds(90, 372, 85, 29);
		contentPane.add(btnLimpar);
		/**
		 * Adição do Botão para enviar as entradas registradas aos seus devidos campos no objeto Usuario
		 * */
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.addActionListener(LC);
		btnEnviar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEnviar.setBounds(196, 372, 85, 29);
		contentPane.add(btnEnviar);
	}
	//Getters & Setters
	/**
	 * Atribui um objeto Usuario ao frame
	 * */
	public void setPessoa(Usuario p) {
		this.pessoa = p;
	}
	/**
	 * Atribui um objeto JFrame que será considerado como o frame principal
	 * */
	public void setRetorno(StartGUI retorno) {
		this.retorno = retorno;
	}
	/**
	 * Retorna um objeto JTextField atribuido à entrada do código do curso a ser cadastrado
	 * */
	public JTextField getTextCodigo() {
		return textCodigo;
	}
	/**
	 * Retorna um objeto JTextField atribuido à entrada do nome do curso a ser cadastrado
	 * */
	public JTextField getTextNome() {
		return textNome;
	}
	/**
	 * Retorna um objeto JTextField atribuido à entrada da carga horária do curso a ser cadastrado
	 * */
	public JTextField getTextCargaH() {
		return textCargaH;
	}
	/**
	 * Retorna objeto JTextField atribuido à entrada do coordenador do curso a ser cadastrado
	 * */
	public JTextField getTextCoordenador() {
		return textCoordenador;
	}
	/**
	 * Retorna objeto JFrame que representa o frame principal do programa
	 * */
	public StartGUI getRetorno() {
		return retorno;
	}
	/**
	 * Retorna objeto Usuario para registro dos campos atribuidos ao curso
	 * */
	public Usuario getPessoa() {
		return pessoa;
	}
	/**
	 * Retorna objeto JButton atribuido à função de registro dos campos de entrada
	 * */
	public JButton getBtnEnviar() {
		return btnEnviar;
	}
	/**
	 * Retorna objeto JButton atribuido à função de limpar os campos de entrada
	 * */
	public JButton getBtnLimpar() {
		return btnLimpar;
	}
	/**
	 * Retorna objeto JComboBox com as opções de entrada para o campo Usuario.area
	 * */
	public JComboBox getArea() {
		return area;
	}
}