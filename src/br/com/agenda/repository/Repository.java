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
		
		System.out.print("Identificador: ");
		String id = input.nextLine();
		
		System.out.print("Nome: ");
		String name = input.nextLine();
		
		System.out.print("Profissão: ");
		String occupation = input.nextLine();
		
		System.out.print("Telefone: ");
		String numero = input.nextLine();
		
		System.out.print("Tipo: ");
		String tipo = input.nextLine();
		
		System.out.print("Operadora: ");
		String operadora = input.nextLine();
		
		System.out.print("Email: ");
		String email = input.nextLine();
		
		System.out.print("Descrição: ");
		String descricao = input.nextLine();
		
		System.out.print("Rua: ");
		String street = input.nextLine();
		
		System.out.print("Bairro: ");
		String district = input.nextLine();
		
		System.out.print("Cidade: ");
		String city = input.nextLine();
		
		System.out.print("Estado: ");
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
		System.out.println("Digite a posição do contato: ");
		id_delete = new Scanner(System.in);
		Integer id1 = id_delete.nextInt();
		controller.delete_contact(id1);
	}
}
