package br.com.agenda.models;

public class Address {//Cadastro de enderešos
	
	private String city;
	private String state;
	private String district;
	private String street;
	
	//Construtor
	public Address(String city, String state, String district, String street) {
		this.city = city;
		this.state = state;
		this.district = district;
		this.street = street;
	}
	
	//Gets e Sets
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "\nCidade: " + city + "\nEstado: " + state + "\nBairro: " + district + "\nRua: " + street + "\n";
	}
	
}
