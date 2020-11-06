public class CorreioEletronico {
	void enviarEmails(String... emails) {
		for(String email : emails) {
			System.out.println("Email enviado para: " + email);
		}
		
	}
}
