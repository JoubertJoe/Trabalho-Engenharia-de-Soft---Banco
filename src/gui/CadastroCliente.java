package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.SpinnerNumberModel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Window.Type;

public class CadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNomeCliente;
	private JLabel lblCpf;
	private JTextField txtCPF;
	private JTextField txtRG;
	private JLabel lblNascimento;
	private JLabel lblDia;
	private JSpinner spnDia;
	private JLabel lblMes;
	private JSpinner spnMes;
	private JLabel lblAno;
	private JSpinner spnAno;
	private JLabel lblSexo;
	private JLabel lblEstadoCivil;
	private JComboBox comboBox;
	private JLabel lblEndereo;
	private JTextField txtEndereco;
	private JLabel lblNumero;
	private JSpinner spinner_1;
	private JLabel lblComp;
	private JTextField txtComplemento;
	private JLabel lblBairro;
	private JTextField txtBairro;
	private JComboBox comboBox_1;
	private JLabel lblEstado;
	private JLabel lblDdd;
	private JTextField txtDDD;
	private JLabel lblTelefone;
	private JTextField textField;
	private JLabel label;
	private JTextField textDDD2;
	private JLabel lblCelular;
	private JTextField txtCelular;
	private JLabel lblSenha;
	private JPasswordField passwordField;
	private JButton btnVoltar;
	private JLabel lblEmail;
	private JTextField txtEmail;

	public CadastroCliente() {
		setResizable(false);
		setTitle("BANCO CADASTRO DE FUNCIONARIOS");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		criaComponentes();
		criaAcoes();

		this.setVisible(true);
	}

	public void criaComponentes() {
		JLabel lblNome = new JLabel("NOME: ");
		lblNome.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNome.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNome.setBounds(32, 42, 46, 14);
		contentPane.add(lblNome);

		txtNomeCliente = new JTextField();
		txtNomeCliente.setBounds(88, 39, 394, 20);
		contentPane.add(txtNomeCliente);
		txtNomeCliente.setColumns(45);

		lblCpf = new JLabel("CPF: ");
		lblCpf.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCpf.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCpf.setBounds(298, 72, 36, 14);
		contentPane.add(lblCpf);

		txtCPF = new JTextField();
		txtCPF.setBounds(344, 70, 138, 20);
		contentPane.add(txtCPF);
		txtCPF.setColumns(15);
		
		JLabel lblRg = new JLabel("RG: ");
		lblRg.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblRg.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRg.setBounds(74, 73, 36, 14);
		contentPane.add(lblRg);
		
		txtRG = new JTextField();
		txtRG.setColumns(15);
		txtRG.setBounds(120, 70, 152, 20);
		contentPane.add(txtRG);
		
		lblNascimento = new JLabel("NASCIMENTO: ");
		lblNascimento.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNascimento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNascimento.setBounds(31, 137, 103, 14);
		contentPane.add(lblNascimento);
		
		lblDia = new JLabel("DIA: ");
		lblDia.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblDia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDia.setBounds(157, 137, 36, 14);
		contentPane.add(lblDia);
		
		spnDia = new JSpinner();
		spnDia.setModel(new SpinnerNumberModel(1, 1, 30, 1));
		spnDia.setBounds(204, 135, 36, 20);
		contentPane.add(spnDia);
		
		lblMes = new JLabel("MES: ");
		lblMes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMes.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblMes.setBounds(271, 137, 36, 14);
		contentPane.add(lblMes);
		
		spnMes = new JSpinner();
		spnMes.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		spnMes.setBounds(318, 135, 36, 20);
		contentPane.add(spnMes);
		
		lblAno = new JLabel("ANO: ");
		lblAno.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAno.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblAno.setBounds(383, 137, 36, 14);
		contentPane.add(lblAno);
		
		spnAno = new JSpinner();
		spnAno.setModel(new SpinnerNumberModel(1930, 1900, 2017, 1));
		spnAno.setBounds(430, 135, 52, 20);
		contentPane.add(spnAno);
		
		lblSexo = new JLabel("SEXO: ");
		lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSexo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblSexo.setBounds(282, 101, 52, 14);
		contentPane.add(lblSexo);
		
		JComboBox comboSexo = new JComboBox();
		comboSexo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		comboSexo.setModel(new DefaultComboBoxModel(new String[] {"MASCULINO", "FEMININO", "N\u00C3O DECLARO"}));
		comboSexo.setBounds(344, 98, 138, 20);
		contentPane.add(comboSexo);
		
		lblEstadoCivil = new JLabel("ESTADO CIVIL: ");
		lblEstadoCivil.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstadoCivil.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEstadoCivil.setBounds(0, 101, 132, 14);
		contentPane.add(lblEstadoCivil);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SOLTEIRO", "CASADO", "DIVORCIADO", "VIUVO", "UNI\u00C3O EST\u00C1VEL", "AMAZIADO"}));
		comboBox.setFont(new Font("Arial Black", Font.PLAIN, 11));
		comboBox.setBounds(120, 98, 152, 20);
		contentPane.add(comboBox);
		
		lblEndereo = new JLabel("ENDERE\u00C7O: ");
		lblEndereo.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEndereo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEndereo.setBounds(5, 168, 93, 14);
		contentPane.add(lblEndereo);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(108, 166, 208, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		lblNumero = new JLabel("N\u00DAMERO: ");
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumero.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNumero.setBounds(5, 243, 93, 14);
		contentPane.add(lblNumero);
		
		spinner_1 = new JSpinner();
		spinner_1.setModel(new SpinnerNumberModel(0, 0, 9999, 1));
		spinner_1.setBounds(108, 241, 69, 20);
		contentPane.add(spinner_1);
		
		lblComp = new JLabel("COMP:  ");
		lblComp.setHorizontalAlignment(SwingConstants.RIGHT);
		lblComp.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblComp.setBounds(15, 218, 83, 14);
		contentPane.add(lblComp);
		
		txtComplemento = new JTextField();
		txtComplemento.setColumns(15);
		txtComplemento.setBounds(107, 216, 114, 20);
		contentPane.add(txtComplemento);
		
		lblBairro = new JLabel("BAIRRO: ");
		lblBairro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblBairro.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblBairro.setBounds(15, 193, 79, 14);
		contentPane.add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(15);
		txtBairro.setBounds(107, 191, 209, 20);
		contentPane.add(txtBairro);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"AC\t ", "AL\t ", "AP\t ", "AM\t ", "BA\t ", "CE\t ", "DF\t ", "ES\t ", "GO ", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		comboBox_1.setBounds(413, 191, 69, 20);
		contentPane.add(comboBox_1);
		
		lblEstado = new JLabel("ESTADO: ");
		lblEstado.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEstado.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEstado.setBounds(324, 193, 79, 14);
		contentPane.add(lblEstado);
		
		lblDdd = new JLabel("DDD: ");
		lblDdd.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDdd.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblDdd.setBounds(5, 280, 93, 14);
		contentPane.add(lblDdd);
		
		txtDDD = new JTextField();
		txtDDD.setColumns(15);
		txtDDD.setBounds(107, 278, 70, 20);
		contentPane.add(txtDDD);
		
		lblTelefone = new JLabel("TELEFONE: ");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblTelefone.setBounds(187, 281, 93, 14);
		contentPane.add(lblTelefone);
		
		textField = new JTextField();
		textField.setColumns(15);
		textField.setBounds(281, 278, 201, 20);
		contentPane.add(textField);
		
		label = new JLabel("DDD: ");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Arial Black", Font.PLAIN, 11));
		label.setBounds(5, 311, 93, 14);
		contentPane.add(label);
		
		textDDD2 = new JTextField();
		textDDD2.setColumns(15);
		textDDD2.setBounds(107, 309, 70, 20);
		contentPane.add(textDDD2);
		
		lblCelular = new JLabel("CELULAR: ");
		lblCelular.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCelular.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCelular.setBounds(187, 308, 93, 14);
		contentPane.add(lblCelular);
		
		txtCelular = new JTextField();
		txtCelular.setColumns(15);
		txtCelular.setBounds(281, 305, 201, 20);
		contentPane.add(txtCelular);
		
		lblSenha = new JLabel("SENHA: ");
		lblSenha.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSenha.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblSenha.setBounds(0, 368, 93, 14);
		contentPane.add(lblSenha);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(108, 366, 374, 20);
		contentPane.add(passwordField);
		
		JButton btnCadastrar = new JButton("CADASTRAR");
		btnCadastrar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnCadastrar.setBounds(40, 411, 141, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnEditar = new JButton("EDITAR");
		btnEditar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnEditar.setBounds(192, 411, 141, 23);
		contentPane.add(btnEditar);
		
		btnVoltar = new JButton("VOLTAR");
		btnVoltar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnVoltar.setBounds(341, 411, 141, 23);
		contentPane.add(btnVoltar);
		
		lblEmail = new JLabel("EMAIL: ");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEmail.setBounds(0, 343, 93, 14);
		contentPane.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(15);
		txtEmail.setBounds(108, 340, 374, 20);
		contentPane.add(txtEmail);
		
		
	}

	public void criaAcoes() {

	}
}
