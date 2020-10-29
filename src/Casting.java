public class Casting {
	public static void main(String[] args) {
		long x = 10;
		//Assumindo riscos da conversão
		int y = (int) x;
		System.out.println(y);
		
		// O sistema perde espaço e para se adequar o número muda totalmente
		long z = 9300000035L;
		int w = (int) z;
		System.out.println(w);
		
		int a = 102344;
		long b = a;
		System.out.println(b);
		
		double c = 20.5;
		
		//Assumindo riscos da conversão
		float d = (float) c;
		System.out.println(d);
		
		float e = 934.5f;
		
		// conversão automática
		double f = c;
		System.out.println(f);
		
		double largura = 100;
		// int tamanho = largura; // não compila, o casting não é feito automaticamente
		
		int tamanho = (int) largura;
		System.out.println(tamanho);
		
		largura = 100.37;
		tamanho = (int) largura; // perde precisão
		System.out.println(tamanho);
	
	}
}
