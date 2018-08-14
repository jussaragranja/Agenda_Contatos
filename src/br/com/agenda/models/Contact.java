package br.com.agenda.models;

public class Contact {
	
	private String id;
	private String name;
	private String occupation;
	private Phone phone;	
	private Email email;	
	private Address address;
	
	//Construtor
	public Contact(String id, String name, String occupation, Phone phone, Email email, Address address) {
		this.id = id;
		this.name = name;
		this.occupation = occupation;
		this.phone =  phone;
		this.email =  email;
		this.address = address;
	}
	//Get e Set
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public Email getEmail() {
		return email;
	}
	public void setEmail(Email email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "\n------------CONTATO------------\nID: " + id + "\nNome: " + name + "\n------------Telefone------------" + phone;
	//+ "\nProfiss�o: " + occupation + "\n" +
	//"\n__________Telefone__________" + phone + "\n__________Email:__________"
	//+ email + "\n__________Endere�o:__________" + address + "\n";
	}
	
	
	
}