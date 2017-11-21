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

public class Menu extends JFrame {

	private JPanel contentPane;
	private JButton btnCadastrarEmpresa, btnCadastrarFuncionario, btnCadastrarCliente, btnDesposito, btnTransferencia;

	public Menu() {
		super ("MENU");
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
		btnCadastrarEmpresa.setBounds(164, 150, 175, 23);
		contentPane.add(btnCadastrarEmpresa);

		btnCadastrarFuncionario = new JButton("Cadastrar Funcionario");
		btnCadastrarFuncionario.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrarFuncionario.setBounds(164, 197, 175, 23);
		contentPane.add(btnCadastrarFuncionario);

		btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCadastrarCliente.setBounds(164, 244, 175, 23);
		contentPane.add(btnCadastrarCliente);

		btnDesposito = new JButton("Deposito\r\n");
		btnDesposito.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnDesposito.setBounds(164, 292, 175, 23);
		contentPane.add(btnDesposito);

		btnTransferencia = new JButton("Transferencia");
		btnTransferencia.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTransferencia.setBounds(164, 338, 175, 23);
		contentPane.add(btnTransferencia);

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
				
				
				fechar();
			}
		});
	}
	
	public void fechar() {
		
		this.setVisible(false);
	}
}
