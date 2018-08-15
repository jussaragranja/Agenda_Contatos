package br.com.agenda.main;

import java.util.Scanner;

import br.com.agenda.repository.Repository;

public class Main {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int input1 = 1;
		
		while(input1 !=0) {
		System.out.println("\n________AGENDA DE CONTATOS________\n");
		System.out.println("1 - CADASTRAR CONTATO");
		System.out.println("2 - LISTAR CONTATOS");
		System.out.println("3 - DELETAR CONTATO");
		System.out.println("4 - ALTERAR CONTATO");
		System.out.println("0 - SAIR");
		System.out.print("Escolha uma op��o: ");
		
		input1 = input.nextInt();
		
		switch (input1) {
		case 1:
			Repository.add_contact();
			break;
		case 2:
			Repository.read_contact();
			break;
		case 3:
			Repository.delete_contact();
			break;
		case 4:
			
			break;
		case 0:
			System.out.println("SAINDO...");
			System.exit(0);
			break;
		default:
			break;
		}
		}
		
	}
}
