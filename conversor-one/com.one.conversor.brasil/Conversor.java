import java.util.Scanner;

import default package;


public class Conversor {
	
	public static void exibirMenu() {
		System.out.println("======================");
		System.out.println("Bem vindo o Conversor =]");
		System.out.println("1 - Real -> Euro");
		System.out.println("2 - Real -> Dólar");
		System.out.println("3 - Real -> Pesos Arg.");
		System.out.println("4 - celsius -> Fahenait.");
		System.out.println("5 - Fahenait-> celsius.");
		System.out.println("Digite uma opção válida.");
		System.out.println("======================");
	}
	
  public static conversor(String uniOri,String uniDet,Scanner leitor) {
	  System.out.println("Ok, você escolheu: "+ uniOri + "-_>" + uniDest);
	  System.out.println("Digite o valor a ser convertido");
	  double valor = leitor.nextDouble();
	  double valorFinal = valor /proporção;
	  System.out.println("Valor final = " + valorFinal);
	  
  }
}
