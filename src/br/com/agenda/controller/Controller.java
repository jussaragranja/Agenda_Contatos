package br.com.agenda.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.agenda.models.Contact;

public class Controller {

	private List<Contact> list_contact = new ArrayList<>();
	
	public void add_contact(Contact contact) {
		list_contact.add(contact);
		System.out.println("\nCADASTRADO COM SUCESSO!\n");
	}
	public void read_contact(){
		System.out.println("_____AGENDA DE CONTATOS_____");
		if (list_contact.size() == 0){
			System.out.println("\nAGENDA VAZIA!!\n");
		}
		for (int i = 0; i < list_contact.size(); i++) {
			System.out.println(list_contact.get(i).toString());
		}
	}
	public void delete_contact(int id1) {
		list_contact.remove(id1);
		System.out.println("\nCONTATO REMOVIDO!\n");
	}
	//public Contact update_contact(int id) {
	//	return contact;
	//}
}