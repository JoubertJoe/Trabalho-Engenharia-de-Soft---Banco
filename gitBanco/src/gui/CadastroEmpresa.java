package gui;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class CadastroEmpresa extends JFrame {

	private JPanel contentPane;
	private JLabel lblNome, lblCNPJ, lblEndereco, lblBairro, lblCidade, lblUF, lblCep, lblFixo, lblCelular, lblEmail,
			lblDataCadastro;
	private JLabel lblInsEstadual, lblInsMunicipal;
	private JTextField txtNome, txtCNPJ, txtEndereco, txtBairro, txtCidade, txtCEP, txtFixo, txtCelular, txtEmail,
			txtDataCad;
	private JTextField txtInsEstadual, txtInsMunicipal;
	private JButton btnVoltar, btnEditar, btnSalvar;
	private JComboBox comboBox;

	public CadastroEmpresa() {
		super("CADASTRO EMPRESA");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		criaComponentes();
		criaAcao();

		this.setVisible(true);
	}

	public void criaComponentes() {

		lblNome = new JLabel("Raz\u00E3o Social: ");
		lblNome.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblNome.setBounds(10, 23, 95, 14);
		contentPane.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(96, 21, 438, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(45);

		lblCNPJ = new JLabel("CNPJ: ");
		lblCNPJ.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCNPJ.setBounds(10, 63, 57, 14);
		contentPane.add(lblCNPJ);

		txtCNPJ = new JTextField();
		txtCNPJ.setBounds(96, 57, 438, 20);
		contentPane.add(txtCNPJ);
		txtCNPJ.setColumns(10);

		lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEndereco.setBounds(10, 101, 76, 14);
		contentPane.add(lblEndereco);

		txtEndereco = new JTextField();
		txtEndereco.setBounds(96, 99, 438, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);

		lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblBairro.setBounds(10, 145, 57, 14);
		contentPane.add(lblBairro);

		txtBairro = new JTextField();
		txtBairro.setBounds(96, 139, 186, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);

		lblCidade = new JLabel("Cidade: ");
		lblCidade.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCidade.setBounds(10, 183, 57, 14);
		contentPane.add(lblCidade);

		txtCidade = new JTextField();
		txtCidade.setBounds(96, 177, 186, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);

		lblUF = new JLabel("UF:");
		lblUF.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblUF.setBounds(292, 183, 46, 14);
		contentPane.add(lblUF);

		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Acre\t\t ", "Alagoas\t\t ", "Amap\u00E1\t\t ",
				"Amazonas\t\t ", "Bahia\t\t ", "Cear\u00E1\t\t ", "Distrito Federal\t\t ", "Esp\u00EDrito Santo\t\t ",
				"Goi\u00E1s\t\t ", "Maranh\u00E3o\t\t ", "Mato Grosso\t\t ", "Mato Grosso do Sul\t\t ",
				"Minas Gerais\t\t ", "Par\u00E1\t\t ", "Para\u00EDba\t\t ", "Paran\u00E1\t\t ", "Pernambuco\t\t ",
				"Piau\u00ED\t\t ", "Rio de Janeiro\t\t ", "Rio Grande do Norte\t\t ", "Rio Grande do Sul\t\t ",
				"Rond\u00F4nia\t\t ", "Roraima\t\t ", "Santa Catarina\t\t ", "S\u00E3o Paulo\t\t ", "Sergipe\t\t ",
				"Tocantins" }));
		comboBox.setBounds(384, 177, 150, 20);
		contentPane.add(comboBox);

		lblCep = new JLabel("CEP:");
		lblCep.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCep.setBounds(292, 141, 57, 14);
		contentPane.add(lblCep);

		txtCEP = new JTextField();
		txtCEP.setBounds(350, 139, 184, 20);
		contentPane.add(txtCEP);
		txtCEP.setColumns(10);

		lblFixo = new JLabel("Fixo:");
		lblFixo.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblFixo.setBounds(10, 222, 57, 14);
		contentPane.add(lblFixo);

		txtFixo = new JTextField();
		txtFixo.setBounds(96, 220, 186, 20);
		contentPane.add(txtFixo);
		txtFixo.setColumns(10);

		lblCelular = new JLabel("Celular:");
		lblCelular.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblCelular.setBounds(292, 222, 57, 14);
		contentPane.add(lblCelular);

		txtCelular = new JTextField();
		txtCelular.setBounds(347, 220, 187, 20);
		contentPane.add(txtCelular);
		txtCelular.setColumns(10);

		lblEmail = new JLabel("Email:");
		lblEmail.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblEmail.setBounds(10, 264, 46, 14);
		contentPane.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setBounds(96, 262, 438, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);

		lblDataCadastro = new JLabel("Data Cadastro:");
		lblDataCadastro.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblDataCadastro.setBounds(270, 345, 95, 14);
		contentPane.add(lblDataCadastro);

		txtDataCad = new JTextField();
		txtDataCad.setBounds(384, 343, 150, 20);
		contentPane.add(txtDataCad);
		txtDataCad.setColumns(10);

		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(16, 423, 113, 23);
		contentPane.add(btnVoltar);

		btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(408, 423, 113, 23);
		contentPane.add(btnSalvar);

		btnEditar = new JButton("Editar");
		btnEditar.setBounds(225, 423, 113, 23);
		contentPane.add(btnEditar);

		lblInsEstadual = new JLabel("Ins. Estadual:");
		lblInsEstadual.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblInsEstadual.setBounds(10, 304, 95, 14);
		contentPane.add(lblInsEstadual);

		txtInsEstadual = new JTextField();
		txtInsEstadual.setBounds(96, 302, 150, 20);
		contentPane.add(txtInsEstadual);
		txtInsEstadual.setColumns(10);

		lblInsMunicipal = new JLabel("Ins. Municipal:");
		lblInsMunicipal.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblInsMunicipal.setBounds(270, 304, 95, 14);
		contentPane.add(lblInsMunicipal);

		txtInsMunicipal = new JTextField();
		txtInsMunicipal.setBounds(384, 302, 150, 20);
		contentPane.add(txtInsMunicipal);
		txtInsMunicipal.setColumns(10);

	}

	public void criaAcao() {

		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Menu menu = new Menu ();
				
				fechar();
			}
		});

		btnEditar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

			}
		});

		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");

			}
		});
	}
	
	public void fechar() {
		
		this.setVisible(false);
	}
}
