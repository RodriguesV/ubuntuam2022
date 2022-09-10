import java.util.Scanner;

public class MinhaIdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String nome;
		int anoNascimento, idade;
		
		System.out.print("digite o nome:");
		leia.next();
		System.out.print("Digite o ano de nascimento :");
		anoNascimento = leia.nextInt();
		
		idade = 2022 - anoNascimento; 
		
		System.out.print(idade);
	}

}
