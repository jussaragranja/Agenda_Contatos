package br.com.agenda.repository;

import java.util.Scanner;

import br.com.agenda.controller.Controller;
import br.com.agenda.models.Address;
import br.com.agenda.models.Contact;
import br.com.agenda.models.Email;
import br.com.agenda.models.Phone;

public class Repository {

	public static Controller controller = new Controller();
	private static Scanner id_delete;
	
	public static void add_contact() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Identificador: ");
		String id = input.nextLine();
		
		System.out.println("Nome: ");
		String name = input.nextLine();
		
		System.out.println("Profiss�o: ");
		String occupation = input.nextLine();
		
		System.out.println("Telefone: ");
		String numero = input.nextLine();
		
		System.out.println("Tipo: ");
		String tipo = input.nextLine();
		
		System.out.println("Operadora: ");
		String operadora = input.nextLine();
		
		System.out.println("Email: ");
		String email = input.nextLine();
		
		System.out.println("Descri��o: ");
		String descricao = input.nextLine();
		
		System.out.println("Rua: ");
		String street = input.nextLine();
		
		System.out.println("Bairro: ");
		String district = input.nextLine();
		
		System.out.println("Cidade: ");
		String city = input.nextLine();
		
		System.out.println("Estado: ");
		String state = input.nextLine();
	
		Phone phone1 = new Phone(numero, tipo, operadora);
		Address address1 = new Address(city, state, district, street);
		Email email1 = new Email(email, descricao);
		Contact contact = new Contact(id, name, occupation, phone1, email1, address1);
	
		controller.add_contact(contact);
	}
	
	public static void read_contact() {
		controller.read_contact();
	}
	
	public static void delete_contact() {
		System.out.println("Digite o ID do contato: ");
		id_delete = new Scanner(System.in);
		Integer id1 = id_delete.nextInt();
		controller.delete_contact(id1);
	}
}
