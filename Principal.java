import java.util.ArrayList;
import java.util.Iterator;


public class Principal{

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Evento> eventos = new ArrayList<>();
		@SuppressWarnings("unused")
		ArrayList<Ambientes> ambientes = new ArrayList<>();
		
  		Cliente c1 = new Cliente( "897.7855.655-06", "moacir@gmailcom", 
				 "Rua Rio de Janeiro, 501", 2218764, 98765, "moacir", 12345);

		
		clientes.add(c1);
		
		//Ambiente a = new Ambiente("vila forro", 10 ,"Rua: sem nome","sem nome","sem ref",10000);
		//ambientes.add(c1);
		
		//Esporte e = new Esporte("voley" , "Jose, Antonio, Carlos, Paulo");
		
		Evento ev = new Esporte("voley", "4 pessoas", "13/10/2017", "14hrs", "Jose, Antonio, Carlos, Paulo", null);
		eventos.add(ev);
		
		for (Iterator<Evento> iterator = eventos.iterator(); iterator.hasNext();) {
			System.out.println(iterator.toString());
			
		}
			
		}
		//Filmes f = new Filme("Rambo", 18, "Ação, açao");
		
		//verificar dados:
	     // System.out.println(c.getDados());
		 // System.out.println(a.getDados());
		//  System.out.println(e.getDados());
		 // System.out.println(ev.getDados());
		  //System.out.println(f.getDados());
}
