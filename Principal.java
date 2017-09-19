import java.util.Scanner;



  //Classe que chamada os métodos 
 


public class Principal {

	public static void main(String[] args) {
		Cliente cl = new Cliente(null, null, null, 0, 0);
		cadastrarCliente(cl); 
		
	}
	private static void cadastrarCliente(Cliente cl){
		Scanner sc = new Scanner(System.in);
		System.out.println("informe cpf");
		String cpf = sc.next();
		System.out.println("informe email");
		String email = sc.next();
		System.out.println("informe endereco");
		String endereco = sc.next();
		System.out.println("informe dataDeNascimento");
		int dataDeNascimento = sc.nextInt();
		System.out.println("informe telefone");
		int telefone = sc.nextInt();
		
	}
}

		
