
public class Conversao {
	public static void main(String[] args) {
		Long idadeEmMilisegundos = new Long(9331200000L);
		
		// Instanciando um wrapper que transforma
		// a String "15" em tipo primitivo
		// e embrulha em um objeto wrapper
		Integer diasParaPagamento =  new Integer("15");
		
		Double precoPassagem = new Double(200.10);
		
		Float distanciaPercorrida = new Float("100.6");
		
		Boolean temPendencias = new Boolean(true);
		
		//Qualquer texto diferente de true representa false
		Boolean atrasado = new Boolean("YES");

		System.out.println(diasParaPagamento);
		System.out.println(precoPassagem);
		System.out.println(distanciaPercorrida);
		System.out.println(temPendencias);
		System.out.println(atrasado);	
		
		//Não vai rodar, pois não faz transformação por extenso
		//Decimais separados por vírgula não é convertido
		/*Integer idade = new Integer("trinta e um");
		Double precoTotal =  new Double("140,30");*/
		
		Integer idade = new Integer(31);
		
		//Métodos de conversão
		byte idadeByte = idade.byteValue();
		short idadeShort = idade.shortValue();
		double idadeDouble = idade.doubleValue();
		
		Float precoProduto = new Float(45.27f);
		
		// converte para short e trunca o valor
		short precoShort = precoProduto.shortValue();
		System.out.println(precoShort);
		
		String numero = "40";
		String valor = "12.34";
		
		//Conversão de String em tipo primitivo
		double precoProduto2 =  Double.parseDouble(valor);
		int idade2 = Integer.parseInt(numero);
		
		//Atualização a partir do Java 5
		Double preco = 25.78;
		int idade3 = new Integer(20);
		
		Integer quantidade = 10;
		Float valorUnitario = 45.35f;
		
		double total = quantidade * valorUnitario;
		System.out.println(total);
	
	}
	
}
