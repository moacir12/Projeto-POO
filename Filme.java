import java.util.Scanner;

class Filmes extends Evento{
	public Filmes(String nome, String descricao, String dataEvento,
			String horaEvento, String sinopse, String elenco) {
		super(nome, descricao, dataEvento, horaEvento, sinopse, elenco);
			}

	
	private String nomeDoFilme;
	private int censura;
	private String genero;
	
	Scanner entrada = new Scanner(System.in);

	public String getNomeDoFilme() {
		return nomeDoFilme;
	}

	public void setNomeDoFilme(String nomeDoFilme) {
		this.nomeDoFilme = nomeDoFilme;
	}

	public int getCensura() {
		return censura;
	}

	public void setCensura(int censura) {
		this.censura = censura;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	//Metodos
	
	void registrarCinema(){
		
	}

	void pesquisarCinema(){
		
	}

}
