import java.util.Scanner;

public class Tabela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    char auxPonto=' ';
	    String auxTime;
		String times[] = new String[4];
	    int pontos[] = new int[4];
	    Scanner leia = new Scanner(System.in); 
	    
	    times[0]= "PALMEIRAS";
	    times[1]= "SANTOS";
	    times[2]= "CORINTHIANS";
	    times[3]= "SÃO PAULO";
	    
	    for(int x=1; x<4; x++) {
	    	System.out.println("Rodada: "+x);
	    	for(int i=1; i<4; i++) {
	    		System.out.println(times[i]);
	    		System.out.println("[G/E/P]: ");
	    		auxPonto = leia.next().charAt(0);
	    		if(auxPonto=='G' || auxPonto=='g') {
	    			pontos[i]=pontos[i]+3;
	    		}
	    		else if(auxPonto=='E' || auxPonto=='e') {
	    			pontos[i]=pontos[i]+1;
	    		}
	    		else {
	    			pontos[i]=pontos[i]+3;
	    		}
	    	}
	    }
	    
	    for(int i=1; i<4; i++) {
	    	 System.out.println(times[i]+" - "+pontos[i]);
	    }
	    System.out.println("Digite o nome do seu time: ");
	    leia.nextLine();
	    auxTime = leia.nextLine();
	    
	    for(int i=1; i<4; i++) {
	    	if(auxTime.equals(times[i])) {
	    			System.out.println("O "+times[i]+" fez "+pontos+" pontos");
	    	}
	    }
    
    
	
	
	}

}
