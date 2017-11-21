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
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Deposito extends JFrame {

	private JPanel contentPane;
	private JTextField txtAgencia, txtConta, txtValor;
	private JLabel lblAgencia, lblConta, lblValor;
	private JButton btnVoltar, btnDepositar;
	private JTextField txtTelefone;

	public Deposito() {
		super("Deposito");
		setIconImage(Toolkit.getDefaultToolkit().getImage("img//16x16.png"));
		setResizable(false);
		setTitle("Deposito de Valores Eletr\u00F4nicos");
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

		lblAgencia = new JLabel("Agencia:");
		lblAgencia.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAgencia.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblAgencia.setBounds(0, 13, 70, 14);
		contentPane.add(lblAgencia);

		txtAgencia = new JTextField();
		txtAgencia.setBounds(80, 11, 128, 20);
		contentPane.add(txtAgencia);
		txtAgencia.setColumns(10);

		lblConta = new JLabel("Conta:");
		lblConta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblConta.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblConta.setBounds(5, 45, 65, 14);
		contentPane.add(lblConta);

		txtConta = new JTextField();
		txtConta.setBounds(80, 42, 128, 20);
		contentPane.add(txtConta);
		txtConta.setColumns(10);

		lblValor = new JLabel("Valor:");
		lblValor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValor.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblValor.setBounds(5, 73, 65, 14);
		contentPane.add(lblValor);

		txtValor = new JTextField();
		txtValor.setBounds(80, 70, 128, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);

		btnVoltar = new JButton("Voltar");
		btnVoltar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnVoltar.setBounds(10, 318, 104, 23);
		contentPane.add(btnVoltar);

		btnDepositar = new JButton("Depositar");
		btnDepositar.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnDepositar.setBounds(10, 283, 104, 23);
		contentPane.add(btnDepositar);

		JLabel lblTelefone = new JLabel("Telefone: ");
		lblTelefone.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefone.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblTelefone.setBounds(0, 213, 70, 14);
		contentPane.add(lblTelefone);

		txtTelefone = new JTextField();
		txtTelefone.setBounds(80, 210, 128, 20);
		contentPane.add(txtTelefone);
		txtTelefone.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 149, 534, 2);
		contentPane.add(separator);
		
		JButton btnVerificaDados = new JButton("Verifica Dados");
		btnVerificaDados.setFont(new Font("Arial Black", Font.PLAIN, 11));
		btnVerificaDados.setBounds(80, 101, 128, 23);
		contentPane.add(btnVerificaDados);
		
		JLabel lblBeneficiado = new JLabel("BENEFICIADO : \r\n");
		lblBeneficiado.setVerticalAlignment(SwingConstants.TOP);
		lblBeneficiado.setHorizontalAlignment(SwingConstants.CENTER);
		lblBeneficiado.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblBeneficiado.setBounds(310, 14, 214, 110);
		contentPane.add(lblBeneficiado);
		
		JLabel lblContato = new JLabel("CONTATO :");
		lblContato.setHorizontalAlignment(SwingConstants.CENTER);
		lblContato.setFont(new Font("Arial Black", Font.PLAIN, 11));
		lblContato.setBounds(81, 162, 128, 14);
		contentPane.add(lblContato);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setIcon(new ImageIcon("img//Smaugold 200x200.png"));
		lblImagem.setBounds(291, 162, 200, 179);
		contentPane.add(lblImagem);

	}

	public void criaAcao() {

		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				fechar();

				Menu menu = new Menu();

			}
		});

		btnDepositar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "deposito efetuado com sucesso!");

			}
		});

	}

	public void fechar() {

		this.setVisible(false);
	}
}
