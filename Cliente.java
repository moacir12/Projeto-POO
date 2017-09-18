//Autor: Moacir José
import java.util.Scanner;

 // classe Cliente.
  
public class Cliente {
	
	//Atributos
		private String cpf;
		private String email;
		private String endereco;
		private int dataDeNascimento;
		private int telefone;
		private String senha;
		private String login;

		Scanner entrada = new Scanner(System.in);
		
		
		//contrutor de Cliente
		public Cliente( String cpf, String email,String endereco, int dataDeNascimento, int telefone ){
			this.cpf= cpf;
			this.email= email;
			this.endereco=endereco;
			this.dataDeNascimento=dataDeNascimento;
			this.telefone=telefone;
			this.login=login;
			this.senha=senha;

			
		}
		
		
		//  dados do cliente
		String getDados(){
			return " Dados do cliente:\n\n CPF: " + this.cpf + "\n Email: " + this.email + "\n Endereço: " +this.endereco+" \n Data de Nascimento: " + this.dataDeNascimento + "\n Telefone: " + this.telefone ;
		}
		
		// login do cliente
		 public String getLogin(){
			return this.login;
		}
		
		// senha do cliente
		 public	String getSenha(){
				return this.senha;
			}
		 void setcadastrarCliente(String cpf){
				System.out.println("Digite seu  cpf: ");
				String c= entrada.next();
				this.cpf= c;	
		 }



}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
			

	
