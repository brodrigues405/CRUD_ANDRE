package util;

import dao.ContatoDao;
import model.Contato;


public class TestConnection {

	public static void main(String[] args) {
		
		//Connection conn = ConnectionSingleton.getConnection();
		//System.out.println(conn); 
		
		
		Contato contato = new Contato("Andre Rodrigues", "00565972154", 29, "91423985", "brodrigues405@gmail.com");
		
		
		boolean r = new ContatoDao().inserirContato(contato);
		System.out.println(r); 
		
		
		
		
	}

}
