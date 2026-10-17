package Exercicios;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a Temperatura em Fahrenheit (°F): ");
		double fahrenheit = entrada.nextDouble();
		
		double graus = (fahrenheit - 32) * (5.0/9.0);
		
		System.out.printf("A temperatura em °C é: %.2f graus", graus);
	}

}
