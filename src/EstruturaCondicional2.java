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
		
		System.out.print("Gêneropara (1 para 'M' ou outro numero para 'F'): ");
		char genero =  scan.nextShort() == 1 ? 'M' : 'F';
		
		double imc = peso / (altura * altura);
		
		if(genero == 'F') {
			if(imc < 19.1) {
				System.out.println(nome + ", está abaixo do peso ideal.");
			} else if(imc <= 25.8) {
				System.out.println(nome + ", está no peso ideal.");
			} else if(imc <= 27.3) {
				System.out.println(nome + ", está um pouco acima do peso.");
			} else if(imc <= 32.3) {
				System.out.println(nome + ", está acima do peso ideal.");
			} else {
				System.out.println(nome + " está obeso.");
			}
		}
		if(genero == 'M') {
			if(imc < 20.7) {
				System.out.println(nome + ", está abaixo do peso ideal.");
			} else if(imc <= 26.4) {
				System.out.println(nome + ", está no peso ideal.");
			} else if(imc <= 27.8) {
				System.out.println(nome + ", está um pouco acima do peso.");
			} else if(imc <= 31.1) {
				System.out.println(nome + ", está acima do peso ideal.");
			} else {
				System.out.println(nome + " está obeso.");
			}
		}
		
		
		scan.close();
		
	}
}
