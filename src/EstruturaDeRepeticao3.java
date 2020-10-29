import java.util.Scanner;

public class EstruturaDeRepeticao3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o último número: ");
		int numeroFinal =  entrada.nextInt();
		
		for(int i = 1; i <= numeroFinal; i++) {
			System.out.println(i);
		}
		entrada.close();
	}
}
