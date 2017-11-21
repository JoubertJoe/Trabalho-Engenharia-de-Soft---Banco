package data;

import java.util.ArrayList;

public class Cadastro {

	ArrayList<Cliente> ALCliente = new ArrayList<>();

	public ArrayList<Cliente> getListaDeClientes() {
		return ALCliente;
	}

	public void setListaDeClientes(ArrayList<Cliente> listaDeClientes) {
		this.ALCliente = listaDeClientes;
	}

	public void addCliente(String nome, String cpf, String rg, String datanascimento, String sexo, String estadocivil,
			String endereco, String numero, String complemento, String cep, String bairro, String cidade, String estado,
			String ddd, String telefone, String celular, String email, int index ) {
		
		Cliente cliente = new Cliente(nome, cpf, rg, datanascimento, sexo, estadocivil, endereco, numero, complemento,
				cep, bairro, cidade, estado, ddd, telefone, celular, email, ALCliente.size()+1);
		
		ALCliente.add(cliente);
	}

}

