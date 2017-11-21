package data;

public class Funcionario {

	private String nome, cpf, rg, datanascimento, sexo, estadocivil, endereco, numero, complemento, cep, bairro, cidade,
			estado, ddd, telefone, celular, email, cargo;
	private int index;

	public Funcionario(String pnome, String pcpf, String prg, String pdatanascimento, String psexo, String pestadocivil,
			String pendereco, String pnumero, String pcomplemento, String pcep, String pbairro, String pcidade,
			String pestado, String pddd, String ptelefone, String pcelular, String pemail, String pcargo, int pindex) {

		this.nome = pnome;
		this.cpf = pcpf;
		this.rg = prg;
		this.datanascimento = pdatanascimento;
		this.sexo = psexo;
		this.estadocivil = pestadocivil;
		this.endereco = pendereco;
		this.numero = pnumero;
		this.complemento = pcomplemento;
		this.cep = pcep;
		this.bairro = pbairro;
		this.cidade = pcidade;
		this.estado = pestado;
		this.ddd = pddd;
		this.telefone = ptelefone;
		this.celular = pcelular;
		this.email = pemail;
		this.index = pindex;
		this.cargo = pcargo;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDatanascimento() {
		return datanascimento;
	}

	public void setDatanascimento(String datanascimento) {
		this.datanascimento = datanascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
