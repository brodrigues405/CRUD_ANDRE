package model;

public class Contato {
	
	public Contato(String nome, String cpf, Integer idade, String telefone, String email) {
	
		this.setNome(nome);
		this.setCpf(cpf);
		this.setIdade(idade);
		this.setTelefone(telefone);
		this.setEmail(email); 
	}
	
	public Contato() {
		// TODO Auto-generated constructor stub
	}
	
	private Integer cod;
	private String nome;
	private String cpf;
	private Integer idade;
	private String telefone;
	private String email;
	
	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Contato [cod=" + cod + ", nome=" + nome + ", cpf=" + cpf
				+ ", idade=" + idade + ", telefone=" + telefone + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
