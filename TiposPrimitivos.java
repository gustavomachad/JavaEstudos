/*
 * 8 tipos!
 * byte, short, int e long. são todos inteiros apenas se diferenciam pelo tamanho
 * byte = -128 até +127
 * short = +- 32.767
 * int = 2bilhões e alguma coisa
 * long= muito grande
 * 
 * float e double são para números reais (flutuantes) = (3.0  12.246)
 *
 * char caracteres = 'a' '?' ' ' 
 * boolean sempre será false e true
 * 
 * 
 * 
 * 
 * 
 */

package Curso1;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
	    short numeroDeVoos = 542;
	    int id = 56789;
	    long pontosAcumulados = 5234845223L;
	    
	    // Tipos numéricos reais
	    float salario = 11_445.44F;
	    double vendasAcumuladas = 2;
	    
	    // Tipo booleano
	    boolean estaDeFérias = false; // true
	    
	    // Tipo caractere
	    char status = 'A'; //ativo
	    
	    // Dias de empresa
	    System.out.println(anosDeEmpresa * 365);
	     
	    // Número de viagens 
	    
	    System.out.println(numeroDeVoos / 2);
	    
	    // Pontos por real
	     
	    System.out.println(pontosAcumulados / vendasAcumuladas);
	     
	     System.out.println(id + ": ganha -> " + salario);
	     System.out.println("Férias? " + estaDeFérias);
	     System.out.println("Status: " + status);
	    
	    
	}
}















