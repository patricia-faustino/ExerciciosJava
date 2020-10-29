public class OperadoresComparacao {
	
	public static void main(String[] args) {
		int a = 20;
		int b = 15;
		boolean igual = a == b;
		boolean diferente = a != b;
		boolean maior =  a > b;
		boolean menor = a < b;
		boolean maiorOuIgual = a >= b;
		boolean menorOuIgual = a <= b;
		
		System.out.println(maior);
		System.out.println(maiorOuIgual);
		System.out.println(menor);
		System.out.println(menorOuIgual);
		System.out.println(igual);
		System.out.println(diferente);
		
		boolean bloqueado = true;
		bloqueado = !bloqueado; // passa a valer false
		
		boolean resultado = !(b > a); // legibilidade ruim, mas válido
		System.out.println(resultado);
		System.out.println(bloqueado);
	}
}
