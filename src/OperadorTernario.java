import java.util.Scanner;

public class OperadorTernario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual sua idade? ");
		int idade = entrada.nextInt();
		String indicacao =  (idade >= 18) ? "adulto" :
		(idade <= 12) ? "crian�a" : "adolescente";
		System.out.println("Resultado: " + indicacao);
		// express�o booleana ? valor caso verdadeiro : valor caso falso;
		entrada.close();
	}
	
}
