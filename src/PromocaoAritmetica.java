public class PromocaoAritmetica {
	public static void main(String[] args) {
		// Calculando variáveis de mesmo tipo, o resultado será este tipo
		int x = 10;
		int y = 5;
		int z = x + y;
		System.out.println(z);
		
		long a = 10;
		long b = 5;
		long c = a * b;
		System.out.println(c);
		
		// O resultado terá que ter o tipo que tem maior capacidade em bytes
		int d = 10;
		long e = 5;
		// int f = d * e; // não compila
		long f = d * e;
		System.out.println(f);
		
		// Em relação a capacidade e tipo o compilador prioriza o tipo 
		long g = 10;
		float h = 9.34f;
		// long i = g * h; // não compila
		float i = g * h;
		System.out.println(i);
		
		/* Operações com tipos iguais mesmo que armazenadas em tipos diferentes
		o resultado da operação será o tipo destas variáveis*/
		int j = 3;
		int l = 2;
		float k = j / l;
		System.out.println(k);
		
		/* Para que o resultado final seja do tipo com maior possibilidade decimal, 
		ao menos uma das variáveis deve ser declarada com este tipo*/
		int m = 3;
		float n = 2;
		float o = m /n;
		System.out.println(o);
		
		// Caso não tenha como fazer como o exemplo acima, faça o casting na própria operação
		int p = 3;
		int q = 2;
		float r = p / (float) q;
		System.out.println(r);
	}
}
