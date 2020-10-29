public class Casting {
	public static void main(String[] args) {
		long x = 10;
		//Assumindo riscos da convers�o
		int y = (int) x;
		System.out.println(y);
		
		// O sistema perde espa�o e para se adequar o n�mero muda totalmente
		long z = 9300000035L;
		int w = (int) z;
		System.out.println(w);
		
		int a = 102344;
		long b = a;
		System.out.println(b);
		
		double c = 20.5;
		
		//Assumindo riscos da convers�o
		float d = (float) c;
		System.out.println(d);
		
		float e = 934.5f;
		
		// convers�o autom�tica
		double f = c;
		System.out.println(f);
		
		double largura = 100;
		// int tamanho = largura; // n�o compila, o casting n�o � feito automaticamente
		
		int tamanho = (int) largura;
		System.out.println(tamanho);
		
		largura = 100.37;
		tamanho = (int) largura; // perde precis�o
		System.out.println(tamanho);
	
	}
}
