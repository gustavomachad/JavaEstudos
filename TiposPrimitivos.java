/*
 * 8 tipos!
 * byte, short, int e long. s�o todos inteiros apenas se diferenciam pelo tamanho
 * byte = -128 at� +127
 * short = +- 32.767
 * int = 2bilh�es e alguma coisa
 * long= muito grande
 * 
 * float e double s�o para n�meros reais (flutuantes) = (3.0  12.246)
 *
 * char caracteres = 'a' '?' ' ' 
 * boolean sempre ser� false e true
 * 
 * 
 * 
 * 
 * 
 */

package Curso1;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
	    short numeroDeVoos = 542;
	    int id = 56789;
	    long pontosAcumulados = 5234845223L;
	    
	    // Tipos num�ricos reais
	    float salario = 11_445.44F;
	    double vendasAcumuladas = 2;
	    
	    // Tipo booleano
	    boolean estaDeF�rias = false; // true
	    
	    // Tipo caractere
	    char status = 'A'; //ativo
	    
	    // Dias de empresa
	    System.out.println(anosDeEmpresa * 365);
	     
	    // N�mero de viagens 
	    
	    System.out.println(numeroDeVoos / 2);
	    
	    // Pontos por real
	     
	    System.out.println(pontosAcumulados / vendasAcumuladas);
	     
	     System.out.println(id + ": ganha -> " + salario);
	     System.out.println("F�rias? " + estaDeF�rias);
	     System.out.println("Status: " + status);
	    
	    
	}
}















