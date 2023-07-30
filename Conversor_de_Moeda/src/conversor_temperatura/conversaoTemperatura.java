package conversor_temperatura;

import javax.swing.JOptionPane;

public class conversaoTemperatura {

	public static void main(String[] args) {
		String temperatura;
        temperatura = javax.swing.JOptionPane.showInputDialog("Escolha uma opção de conversão de temperratura desejada:"
        		+ "\n1 - Farenhaith:"
        		+ "\n2 - Célsius:");
        
        int opcao;
        opcao = Integer.parseInt(temperatura);
        
        if(opcao == 1) {
       	 String valor;
       	 valor = JOptionPane.showInputDialog("Digite a temperatura deseja converter");
       	 double valorReal = Double.parseDouble(valor);
       	 int temperturaConvertida = (int) (5*(valorReal - 32)) / 9;
       		 String msg;
			 msg = "A temperauta em grau Celsius é: "+temperturaConvertida + "°C";
       	 JOptionPane.showMessageDialog(null, msg);
	 }
      
        if(opcao == 2) {
       	 String valor;
       	 valor = JOptionPane.showInputDialog("Digite a temperatura deseja converter");
       	 double valorReal = Double.parseDouble(valor);
       	 int temperturaConvertida = (int) (5*(valorReal + 59)) / 9;
       		 String msg;
			 msg = "A temperauta em grau Farenhaith é: "+temperturaConvertida + "°F";
       	 JOptionPane.showMessageDialog(null, msg);

     }
  }
	
}