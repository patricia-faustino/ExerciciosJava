
public class PrincipalFolhaPagamento {
	public static void main(String[] args) {
		FolhaPagamento folha = new FolhaPagamento();
		double salario =  folha.calcularSalario(160, 12, 32.80, 40.2);
		
		System.out.println("Salário calculado: " + salario);
	}

}
