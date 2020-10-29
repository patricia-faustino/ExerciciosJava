import java.util.Scanner;

public class EstruturaCondicional2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Nome: ");
		String nome = scan.nextLine();
		
		System.out.print("Peso: ");
		double peso =  scan.nextDouble();
		
		System.out.print("Altura: ");
		float altura =  scan.nextFloat();
		
		System.out.print("G�neropara (1 para 'M' ou outro numero para 'F'): ");
		char genero =  scan.nextShort() == 1 ? 'M' : 'F';
		
		double imc = peso / (altura * altura);
		
		if(genero == 'F') {
			if(imc < 19.1) {
				System.out.println(nome + ", est� abaixo do peso ideal.");
			} else if(imc <= 25.8) {
				System.out.println(nome + ", est� no peso ideal.");
			} else if(imc <= 27.3) {
				System.out.println(nome + ", est� um pouco acima do peso.");
			} else if(imc <= 32.3) {
				System.out.println(nome + ", est� acima do peso ideal.");
			} else {
				System.out.println(nome + " est� obeso.");
			}
		}
		if(genero == 'M') {
			if(imc < 20.7) {
				System.out.println(nome + ", est� abaixo do peso ideal.");
			} else if(imc <= 26.4) {
				System.out.println(nome + ", est� no peso ideal.");
			} else if(imc <= 27.8) {
				System.out.println(nome + ", est� um pouco acima do peso.");
			} else if(imc <= 31.1) {
				System.out.println(nome + ", est� acima do peso ideal.");
			} else {
				System.out.println(nome + " est� obeso.");
			}
		}
		
		
		scan.close();
		
	}
}
