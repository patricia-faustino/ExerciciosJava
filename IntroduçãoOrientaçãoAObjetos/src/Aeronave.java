public class Aeronave {
	int totalAssentosNormais;
	int totalAssentosEspeciais;
	int assentosNormaisReservados;
	int assentosEspeciasReservados;
	
	void reservarAssentos(int numeroAssentos) {
		assentosNormaisReservados += numeroAssentos;
	}
	
	void reservarAssentos(int assentosNormais, int assentosEspeciais) {
		this.assentosNormaisReservados += assentosNormais;
		this.assentosEspeciasReservados += assentosEspeciais;
	}
	
	int calcularAssentosDisponiveis() {
		return totalAssentosNormais - assentosNormaisReservados + totalAssentosEspeciais - assentosEspeciasReservados;
	}
	
	/*void alterarTotalAssentos(int totalAssentos) {
		this.totalAssentos =  totalAssentos ;
	}*/
}
