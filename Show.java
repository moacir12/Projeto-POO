import java.util.Scanner;

//Classe Show

public class Show {
	//Atributos
	
	private String nome;
	private String artista;
	private String estilo;
	
	Scanner entrada = new Scanner(System.in);
		
// construtor
	public Esporte( String nome, String artista,String estilo){
		this.nome = nome;
		this.artista= artista;
		this.estilo= estilo;
	}

//  dados do Show
		String getDados(){
			return "\n\nTipo de show:\n\nNome : " + this.nome + "\nArtista: " + this.artista + "\n estilo:" + this.estilo;
		}	

	//Metodos
	
	void registrarShow(){
		
	}
	
	void pesquisarShow(){
	
	}
}
