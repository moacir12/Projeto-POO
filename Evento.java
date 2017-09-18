import java.util.Scanner;

// classe Evento.
public class Evento {
	//Atributos
	private String descricao;
	private String dataEvento;
	private String horaEvento;
	private String sinopse;
	private String elenco;
	
Scanner entrada = new Scanner(System.in);
	
	
	//contrutor de evento
	public Evento(String descricao, String dataEvento, String horaEvento, String sinopse,String elenco){
		this.descricao= descricao;
		this.dataEvento=dataEvento;
		this.horaEvento= horaEvento;
		this.sinopse=sinopse;
		this.elenco=elenco;
	}

	//  Dados  do evento
		String getDados(){
			return "Dados do evento:\n \nDescricao: " + this.descricao + "\n DataEvento: " + this.dataEvento + "\n Horário: " + this.horaEvento +"\n Sinopse "+ this.sinopse +"\n Elenco: " + this.elenco;
		}	
	
	
	//Metados
	void mostarEvento()
		
		
	}
	void pesquisarEvento(){
		
		
	}
	void mostrarDescontoPorCompraAntercipada(){
		
	}
		
		
		
		
	
		
		
		
		
		
		
	}
	
	
	
	
	

