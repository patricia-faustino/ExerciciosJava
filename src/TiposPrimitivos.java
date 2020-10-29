
public class TiposPrimitivos {
	public static void main(String[] args) {
		double precoProduto = 9.43;
		
		System.out.println(precoProduto);
		
		boolean  alunoMatriculado = true;
		boolean clienteBloqueado = false;
		System.out.println(alunoMatriculado);
		System.out.println(clienteBloqueado );
		
		// Não compila
		/*boolean alunoMatriculado2 = 1;
		boolean clienteBloqueado2 = 0;*/
		
		char turmaAluno1 = 'A';
		char tipoCliente = '2';
		char simbolo = '@';
		System.out.println(turmaAluno1);
		System.out.println(tipoCliente );
		System.out.println(simbolo);
		
		long populacaoSalvador =  2677000; 
		System.out.println(populacaoSalvador);
		
		long populacaoMundial = 7000000000L;
		System.out.println(populacaoMundial);
		
		// float saldoConta = 1030.43; // Não compila
		float saldoConta = 1030.43f;
		System.out.println(saldoConta);
		
		
		}
}
