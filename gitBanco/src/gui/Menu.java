package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JButton btnCadastrarEmpresa, btnCadastrarFuncionario, btnCadastrarCliente, btnDesposito, btnTransferencia;
	private JLabel label;

	public Menu() {
		super ("MENU");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Joube\\Desktop\\16x16.png"));
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

		btnCadastrarEmpresa = new JButton("Cadastrar Empresa");
		btnCadastrarEmpresa.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrarEmpresa.setBounds(166, 239, 175, 23);
		contentPane.add(btnCadastrarEmpresa);

		btnCadastrarFuncionario = new JButton("Cadastrar Funcionario");
		btnCadastrarFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrarFuncionario.setBounds(166, 286, 175, 23);
		contentPane.add(btnCadastrarFuncionario);

		btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrarCliente.setBounds(166, 333, 175, 23);
		contentPane.add(btnCadastrarCliente);

		btnDesposito = new JButton("Deposito\r\n");
		btnDesposito.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDesposito.setBounds(166, 381, 175, 23);
		contentPane.add(btnDesposito);

		btnTransferencia = new JButton("Transferencia");
		btnTransferencia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTransferencia.setBounds(166, 427, 175, 23);
		contentPane.add(btnTransferencia);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Joube\\Desktop\\Smaugold 200x200.png"));
		label.setBounds(141, 11, 200, 217);
		contentPane.add(label);

	}

	public void criaAcao() {
		
		
		btnCadastrarEmpresa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				CadastroEmpresa empresa = new CadastroEmpresa();
				
				fechar();
				
			}
		});
		
		btnCadastrarFuncionario.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				CadastroFuncionario funcionario = new CadastroFuncionario();
				
				fechar();
				
			}
		});

		btnCadastrarCliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				CadastroCliente clientezinho = new CadastroCliente();
				
				fechar();
			}
		});
		
		btnDesposito.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Deposito deposito = new Deposito();
				
				fechar();
			}
		});
		
		btnTransferencia.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Transferencia transfere = new Transferencia();
				fechar();
			}
		});
	}
	
	public void fechar() {
		
		this.setVisible(false);
	}
}
