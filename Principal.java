

  //Classe que chamada os métodos 
 


public class Principal {

	public static void main(String[] args) {
		Cliente c = new Cliente( "175.678.543-06", "jose@gmailcom", 
				 "Rua Rio de Janeiro 501", 22121980, 987380045);
		

		//verificar dados:
		System.out.println(c.getDados());
	}
}