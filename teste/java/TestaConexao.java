
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaConexao {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("conectaPercistence");
			System.out.println("Acessou");
	}

}
