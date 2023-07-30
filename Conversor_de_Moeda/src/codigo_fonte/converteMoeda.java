package codigo_fonte;
import javax.swing.JOptionPane;
	
public class converteMoeda {

	public static void main(String[] args) {
		
         String moeda;
         moeda = javax.swing.JOptionPane.showInputDialog("Escolha uma opção de conversão de moeda desejada:"
         		+ "\n1 - Euro:"
         		+ "\n2 - Dólar:"
         		+ "\n3 -Peso Arg.");
         
         int opcao;
         opcao = Integer.parseInt(moeda);
         
         if(opcao == 1) {
        	 String valor;
        	 valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter");
        	 double valorReal = Double.parseDouble(valor);
        	 final double euro = 5.383;
        	 double valorConvertido = valorReal / euro;
        		 String msg;
			 msg = "O valor em Euro é: "+valorConvertido;
        	 JOptionPane.showMessageDialog(null, msg);
         }
         if(opcao == 2) {
        	 String valor;
        	 valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter");
        	 double valorReal = Double.parseDouble(valor);
        	 final double dolar = 4.795;
        	 double valorConvertido = valorReal / dolar;
        		 String msg;
			 msg = "O valor em Dólar é: "+valorConvertido;
        	 JOptionPane.showMessageDialog(null, msg);
         }
         if(opcao == 3) {
        	 String valor;
        	 valor = JOptionPane.showInputDialog("Digite o valor em reais que deseja converter");
        	 double valorReal = Double.parseDouble(valor);
        	 final double peso = 0.018;
        	 double valorConvertido = valorReal / peso;
        		 String msg;
			 msg = "O valor em Pesos é: "+valorConvertido;
        	 JOptionPane.showMessageDialog(null, msg);
         }
	}

}
