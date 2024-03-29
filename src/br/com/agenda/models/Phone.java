package br.com.agenda.models;

public class Phone { //Classe para cadastro de telefones

	private String number;
	private String type;
	private String mobile_operator;
	
	public Phone(String number, String type, String mobile_operator) {
		this.number = number;
		this.type = type;
		this.mobile_operator = mobile_operator;
	}
	
	public String getNumero() {
		return number;
	}
	public void setNumero(String number) {
		this.number = number;
	}
	public String getTipo() {
		return type;
	}
	public void setTipo(String type) {
		this.type = type;
	}
	public String getOperadora() {
		return mobile_operator;
	}
	public void setOperadora(String mobile_operator) {
		this.mobile_operator = mobile_operator;
	}

	@Override
	public String toString() {
		return "\nNumero: " + number + "\nTipo: " + type + "\nOperadora: " + mobile_operator + "\n";
	}
	
	
	
}
