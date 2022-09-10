import java.util.Scanner;

public class SomaTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner leia = new Scanner(System.in);
    int numero=0, contador=0, Stotal=0;
    
    System.out.print("Digite um número: ");
    numero = leia.nextInt();
    
    do {
    	contador++;
    	System.out.print(contador);
    	
    	if(contador<numero) {
    		System.out.print("+");	
    	}
    	Stotal=Stotal + contador;
    	
    }   
    	while(contador<numero);
    	System.out.print(" = "+Stotal);
    
}
   
}
