package gerais;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaConexao {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("conectaPersistence");
			System.out.println("Acessou");
	}

}
