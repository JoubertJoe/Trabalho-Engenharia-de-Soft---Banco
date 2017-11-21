package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Deposito extends JFrame {

	private JPanel contentPane;
	private JTextField txtData, txtDeposito, txtFavorecido, txtAgencia, txtConta, txtValor;
	private JLabel lblData, lblDepositoN, lblFavorecido, lblAgencia, lblConta, lblValor;
	private JButton btnVoltar, btnSalvar, btnEditar;
	private JTextField textField;

	public Deposito() {
		super("DEPOSITO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		criaComponentes();
		criaAcao();

		this.setVisible(true);
	}

	public void criaComponentes() {

		lblData = new JLabel("Data:");
		lblData.setBounds(10, 30, 46, 14);
		contentPane.add(lblData);

		txtData = new JTextField();
		txtData.setBounds(80, 27, 120, 20);
		contentPane.add(txtData);
		txtData.setColumns(10);

		lblDepositoN = new JLabel("Deposito n\u00BA:");
		lblDepositoN.setBounds(326, 30, 60, 14);
		contentPane.add(lblDepositoN);

		txtDeposito = new JTextField();
		txtDeposito.setBounds(396, 27, 128, 20);
		contentPane.add(txtDeposito);
		txtDeposito.setColumns(10);

		lblFavorecido = new JLabel("Favorecido:");
		lblFavorecido.setBounds(10, 75, 73, 14);
		contentPane.add(lblFavorecido);

		txtFavorecido = new JTextField();
		txtFavorecido.setBounds(80, 72, 444, 20);
		contentPane.add(txtFavorecido);
		txtFavorecido.setColumns(10);

		lblAgencia = new JLabel("Agencia:");
		lblAgencia.setBounds(10, 129, 60, 14);
		contentPane.add(lblAgencia);

		txtAgencia = new JTextField();
		txtAgencia.setBounds(80, 126, 128, 20);
		contentPane.add(txtAgencia);
		txtAgencia.setColumns(10);

		lblConta = new JLabel("Conta:");
		lblConta.setBounds(340, 129, 46, 14);
		contentPane.add(lblConta);

		txtConta = new JTextField();
		txtConta.setBounds(396, 126, 128, 20);
		contentPane.add(txtConta);
		txtConta.setColumns(10);

		lblValor = new JLabel("Valor:");
		lblValor.setBounds(340, 219, 46, 14);
		contentPane.add(lblValor);

		txtValor = new JTextField();
		txtValor.setBounds(396, 216, 128, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);

		btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(10, 318, 104, 23);
		contentPane.add(btnVoltar);

		btnEditar = new JButton("Editar");
		btnEditar.setBounds(208, 318, 104, 23);
		contentPane.add(btnEditar);

		btnSalvar = new JButton("Confirmar");
		btnSalvar.setBounds(427, 318, 97, 23);
		contentPane.add(btnSalvar);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setBounds(10, 179, 46, 14);
		contentPane.add(lblTelefone);
		
		textField = new JTextField();
		textField.setBounds(80, 176, 128, 20);
		contentPane.add(textField);
		textField.setColumns(10);

	}

	public void criaAcao() {

		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				fechar();

				Menu menu = new Menu();

			}
		});

		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "Deposito efetuado com sucesso!");

			}
		});

	}

	public void fechar() {

		this.setVisible(false);
	}
}
