
public class TesteCliente {
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		
		cliente.setStatus(Cliente.Status.ATIVO);
		System.out.println(cliente.getStatus());
		
		cliente.setStatus(Cliente.Status.EM_ANALISE);
		System.out.println(cliente.getStatus());
		
	}
}
