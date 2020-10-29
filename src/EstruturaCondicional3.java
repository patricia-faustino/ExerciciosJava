import java.util.Scanner;
public class EstruturaCondicional3 {
	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		
		System.out.print("Digite o final da placa: ");
		byte finalDaPlaca = entrada.nextByte();
		
		switch(finalDaPlaca) {
			case 1:
				System.out.println("Vencimento dia 11 de Janeiro");
				break;
			case 2:
				System.out.println("Vencimento dia 12 de Janeiro");
				break;
			default:
				System.out.println("Não há data registrada para essa opção.");
		}
		entrada.close();
	}
}
