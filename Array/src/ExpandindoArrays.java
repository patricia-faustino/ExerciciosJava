public class ExpandindoArrays {
	public static void main(String[] args) {
		int[] numeros1 = { 5, 8};
		int[] numeros2 = java.util.Arrays.copyOf(numeros1, 5);
		for(int numero: numeros2) {
			System.out.println(numero);
		}
		
	}
}
