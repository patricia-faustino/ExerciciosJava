
public class ChamaCorreioEletronico {
	public static void main(String[] args) {
		String[] emails = new String[2];
		/*emails[0] = "joaodascouves@algaworks.com";
		emails[1] = "zemane@algaworks.com";*/
		
		
		CorreioEletronico correio = new CorreioEletronico();
		/*correio.enviarEmails(emails);*/
		correio.enviarEmails(new String[]{ "joaodascouves@algaworks.com",
		"zemane@algaworks.com" });
	}
}
