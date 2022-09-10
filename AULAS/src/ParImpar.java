import java.util.Scanner;

public class ParImpar {
		public static void main (String[] args) {
			
			Scanner leia = new Scanner(System.in);
			int numero;
			
			System.out.print("Digite um numero: ");
			numero = leia.nextInt();
			
		 	if (numero<0) {
				System.out.print("O numero é negativo");
			}
			else if (numero==0) {
				System.out.print("O numero é neutro");
			}
			else if (numero % 2 == 0) {
				System.out.print("O número é par");
			}
			else {
				System.out.println("O número é impar");
			}
		
			
		
		}

}
