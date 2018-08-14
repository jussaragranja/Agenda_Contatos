package br.com.agenda.models;

public class Email { //Classe para cadastro de emails
	
	private String email; //Endereço de email
	
	private String descricao; //Pessoal ou comercial
	
	//Construtor
	public Email(String email, String descricao) {
		this.email = email;
		this.descricao = descricao;
	}
	
	//Gets e Sets
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEmail() {
		return email;
	}
	public void setTipo(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "\nEmail: " + email + "\nDescrição: " + descricao +"\n";
	}

}
