public class PrincipalAeronave {
	public static void main(String[] args) {
		Aeronave aviaoGol = new Aeronave();
		aviaoGol.totalAssentosNormais = 100;
		
		Aeronave aviaoTam = new Aeronave();
		aviaoTam.totalAssentosNormais = 130;
		
		aviaoGol.reservarAssentos(10);
		aviaoTam.reservarAssentos(5);
		
		int assentosGol = aviaoGol.calcularAssentosDisponiveis();
		int assentosTam = aviaoTam.calcularAssentosDisponiveis();
		
		System.out.println("Assentos disponíveis - Gol: " + assentosGol);
		System.out.println("Assentos disponíveis - Tam: " + assentosTam);
	}
}
