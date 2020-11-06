public class ExemplosArraysObjetos {
	public static void main(String[] args) {
		VagaEmprego[] vagasPublicadas = new VagaEmprego[5];
		VagaEmprego vaga = new VagaEmprego();
		
		vaga.titulo = "Programador Java";
		vaga.salario = 80000;
		
		vagasPublicadas[0] = vaga;
		vagasPublicadas[2] = new VagaEmprego();
		vagasPublicadas[2].titulo = "Web Designer";
		vagasPublicadas[2].salario = 65000;
		
		for(int i=0; i < vagasPublicadas.length; i++) {
			if(vagasPublicadas[i] != null) {
				System.out.println(vagasPublicadas[i].titulo + " " + vagasPublicadas[i].salario);
			}
		}
		
	}
}
