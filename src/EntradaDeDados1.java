import java.util.Scanner;

public class EntradaDeDados1 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("Oi" + nome + "!");
		entrada.close();
		
	}
}
