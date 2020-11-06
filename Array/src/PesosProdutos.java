
public class PesosProdutos {
	public static void main(String[] args) {
		float[] pesosProdutos =  new float[10];
		pesosProdutos[0] = 10.2f;
		pesosProdutos[4] = 98;
		pesosProdutos[9] = 30.5f;
		
		float [] pesos = {10.2f, 0, 0, 0, 100, 0, 0, 0, 0, 30.5f};
		
		System.out.println("Somando...");
		System.out.println(pesos[0]);
		System.out.println(pesos[4]);
		System.out.println(pesos[9]);
		System.out.println("=");
		
		float total= pesos[0] + pesos[4] + pesos[9];
		System.out.println(total);
		System.out.println(pesosProdutos[8]);
	}
	
}
