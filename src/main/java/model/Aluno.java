package model;

public class Aluno {
	private int id_matricula;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	public int getId_matricula() {
		return id_matricula;
	}
	public void setId_matricula(int id_matricula) {
		this.id_matricula = id_matricula;
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
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
