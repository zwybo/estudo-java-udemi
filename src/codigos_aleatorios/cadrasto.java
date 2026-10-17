package codigos_aleatorios;

import java.util.Scanner;

public class cadrasto {
  public static void main(String [] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Cadastre-se para entrar no sistema.");
	System.out.println("Digite seu novo nome de usuario: ");
	String usuario = entrada.nextLine();
	System.out.println("Okay, " + usuario);
	
	String senha;
	String csenha;
	boolean senhac = false;
	
	while (!senhac) {
		System.out.println("Digite sua nova senha: ");
		senha = entrada.nextLine();
		
		System.out.println("Confirme sua senha: ");
		csenha = entrada.nextLine();
		
		if (senha.equals(csenha)) {
			System.out.println("Conta cadrastada com sucesso!");
			senhac = true;
		}
		else {
			System.out.println("As senhas não coincidem! Tente novamente.\n");
		}
		
	  }
	
    }
}
