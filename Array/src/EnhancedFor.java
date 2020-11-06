import java.util.Scanner;

public class EnhancedFor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite qual número deseja a tabuada: ");
		int numero1 =  entrada.nextInt();
		
		int[] tabuada = {1, 2, 3, 4 ,5 ,6, 7, 8, 9, 10};
		
		
		for(int x: tabuada) {
			System.out.println(x + " X " + numero1 + "= " + x * numero1);
		}
		
		entrada.close();
	}
}
