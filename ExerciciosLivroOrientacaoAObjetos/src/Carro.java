public class Carro {
	
	String fabricante = "Sem fabricante";
	String modelo =  "Sem model";
	String cor = "Sem cor";
	String tipoCombustivel = "";
	int anoDeFabricacao = 2011;
	double valorDeMercado = 0;
	Proprietario proprietario =  new Proprietario();
	
	void ligar() {
		if(modelo != null) {
			System.out.println("Ligando carro " + modelo);
		}
		
	}
}
