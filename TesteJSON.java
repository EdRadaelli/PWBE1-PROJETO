
import com.fasterxml.jackson.databind.ObjectMapper;

public class TesteJSON {

	public static void main(String[] args) {
		
		try {
			ObjectMapper objeto = new ObjectMapper();
			//objeto para utilizar na serialização
			Pessoa pes = new Pessoa("Jyn", 28);
			
			//serializar o objeto pes
			String json = objeto.writeValueAsString(pes);
			
			System.out.println("Objeto serializado!");
			System.out.println(json);
			
			//desserializar o JSON para o objeto pes
			Pessoa desPessoa = objeto.readValue(json, Pessoa.class);
			System.out.println("JSON desserializado para objeto Pessoa:");
			System.out.println("Nome: " + desPessoa.getNome() + "\nIdade: " + desPessoa.getIdade());
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
