public class Carro {
	public static final int VELOCIDADE_MAXIMA = 180;
	
	public void acelerar(int velocidade) {
		if(velocidade > VELOCIDADE_MAXIMA) {
			System.out.println("Velocidade acima do permitido.");
		} else {
			System.out.println("Acelerando...");
		}
	}
}
