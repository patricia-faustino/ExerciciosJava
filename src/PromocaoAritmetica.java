public class PromocaoAritmetica {
	public static void main(String[] args) {
		// Calculando vari�veis de mesmo tipo, o resultado ser� este tipo
		int x = 10;
		int y = 5;
		int z = x + y;
		System.out.println(z);
		
		long a = 10;
		long b = 5;
		long c = a * b;
		System.out.println(c);
		
		// O resultado ter� que ter o tipo que tem maior capacidade em bytes
		int d = 10;
		long e = 5;
		// int f = d * e; // n�o compila
		long f = d * e;
		System.out.println(f);
		
		// Em rela��o a capacidade e tipo o compilador prioriza o tipo 
		long g = 10;
		float h = 9.34f;
		// long i = g * h; // n�o compila
		float i = g * h;
		System.out.println(i);
		
		/* Opera��es com tipos iguais mesmo que armazenadas em tipos diferentes
		o resultado da opera��o ser� o tipo destas vari�veis*/
		int j = 3;
		int l = 2;
		float k = j / l;
		System.out.println(k);
		
		/* Para que o resultado final seja do tipo com maior possibilidade decimal, 
		ao menos uma das vari�veis deve ser declarada com este tipo*/
		int m = 3;
		float n = 2;
		float o = m /n;
		System.out.println(o);
		
		// Caso n�o tenha como fazer como o exemplo acima, fa�a o casting na pr�pria opera��o
		int p = 3;
		int q = 2;
		float r = p / (float) q;
		System.out.println(r);
	}
}
