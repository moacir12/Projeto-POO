import java.util.Scanner;
//Autor Moacir
public class Peça {
	//Atributos
	private String nomeDaPeca;
	private String companhia;
	private String genero;
	
	Scanner entrada = new Scanner(System.in);
	
	public void Peca(String nomeDaPeca,String companhia, String genero){
		this.nomeDaPeca = nomeDaPeca;
		this.companhia = companhia;
		this.genero = genero;
	}
	
	//  dados do Peça
	String getDados(){
		return "\n\nDados da peça:\n\nNome do peça: " + this.nomeDaPeca+ "\nCompahia: " + this.companhia + "\nGenero: " + this.genero;
		}
	
	//Metodos
	
	void registrarTeatro(){
		
	}

	void pesquisarTeatro(){
		
	}
}