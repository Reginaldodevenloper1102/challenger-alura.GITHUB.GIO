import java.util.Scanner;

public class ConversorApp {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner(System.in);
		int input = 0;
		
		while(input !=9 ) {
			Conversor.exibirMenu();
			input = entrada.nextInt();
			
			switch(input) {
			case 1:
				Conversor.conversor("cm","metro",entrada);
					
				
				break;
			
			case 3:
				Conversor.conversor("cm","metro",entrada);
				
				break;
			
			case 4:
				Conversor.conversor("cm","metro",entrada);
				
				break;
			
			case 5:
				Conversor.conversor("cm","metro",entrada);
				
				break;
			
			 
			case 6:
				Conversor.conversor("cm","metro",entrada);
				
				break;
			case 9:
				System.out.println("Que pena!Saindo do sistema");
				
				
			default;
			   System.out.println("Digite uma opão válida");
			break;
			
			}
		
		
		
		}
		
		System.out.println();
		entrada.close();
		

	}

}
