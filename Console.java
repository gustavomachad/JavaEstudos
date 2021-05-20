package Curso1;
import java.util.Scanner;
public class Console {
public static void main(String[] args) {
	
	System.out.println("Bom");
	System.out.println(" dia! \n\n");
	
	System.out.println("Bom");
	System.out.println("dia!");
	
	System.out.printf("Megasena: %d %d %d %d %d %d %n" ,
			1, 2, 3, 4, 5, 6);

	System.out.printf("Salário: %.1f%n", 1234.5678);
	System.out.printf("Nome: %s%n", "João \n");
	
	
	Scanner entrada = new Scanner(System.in);
	
	
	System.out.println("Digite o seu nome: ");
	String nome = entrada.nextLine();
	
	System.out.println("Digite o seu sobrenome: ");
	String sobrenome = entrada.nextLine();
	
	System.out.println("Digite a sua idade ");
	int idade = entrada.nextInt();
	
	
	System.out.printf("Seu nome é %s %s e você tem %d anos de idade. %n", 
			nome, sobrenome, idade);
	entrada.close();
	
	
	
}
}
