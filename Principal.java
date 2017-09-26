import java.util.ArrayList;
import java.util.Iterator;


public class Principal{

	public static void main(String[] args) {
		ArrayList<Cliente> clientes = new ArrayList<>();
		ArrayList<Evento> eventos = new ArrayList<>();
		ArrayList<Ambientes> ambientes = new ArrayList<>();
		
  		Cliente c1 = new Cliente( "897.7855.655-06", "moacir@gmailcom", 
				 "Rua Rio de Janeiro, 501", 2218764, 98765, "moacir", 12345);

		
		clientes.add(c1);
		System.out.println(c1);
		
		Ambiente a1 = new Ambiente("vila forro", 10 ,"Rua: sem nome","sem nome","sem ref",10000);
		 ambientes.add(a1);
		System.out.println(a1);	
		
		//Esporte e = new Esporte("voley" , "Jose, Antonio, Carlos, Paulo");
		
		Evento ev = new Esporte("voley", "4 pessoas", "13/10/2017", "14hrs", "Jose, Antonio, Carlos, Paulo", null);
		eventos.add(ev);
		
			
		}
			
		}
		

