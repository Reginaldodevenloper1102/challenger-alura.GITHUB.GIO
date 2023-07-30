import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ConversorGrafico extends JFrame{
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem opcao1;
	private JMenuItem opcao2;
	private JMenuItem opcao3;
	private JMenuItem opcao4;
	private JMenuItem opcao5;
	
	public ConversorGrafico() {
		setSize(400,300);
		setTitle("Conversor ONE =] ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel painel = new JPanel();
		
		exibirMenu();
		painel.add(menuBar);
		add(painel);
	}
	
	public void exibirMenu() {
		menuBar = new JMenuBar();
		menu = new JMenu("ENTRAR NO SISTEMA");
		opcao1 = new JMenuItem("Connverter REAL PARA EURO");
		opcao2 = new JMenuItem("Connverter REAL PARA DÓLAR");
		opcao3 = new JMenuItem("Connverter REAL PARA PESOS ARG.");
		opcao4 = new JMenuItem("Converter Temperatura Célsius.");
		opcao5 = new JMenuItem("Converter Temperatura Farenhaith.");
		
		menu.add(opcao1);
		menu.add(opcao2);
		menu.add(opcao3);
		menu.add(opcao4);
		menu.add(opcao5);
		
		menuBar.add(menu);
		
		opcao1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 String moeda;
		         moeda = javax.swing.JOptionPane.showInputDialog("Digite 1: Para saber conversão de real para Euro"
		         		+ "\n1 - Euro:");
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
		         
		         
		         
			}
			
		});
		opcao2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 String moeda;
		         moeda = javax.swing.JOptionPane.showInputDialog("Digite 2: Para saber conversão de real para Dólar:"
		         		+ "\n2 - Dólar:");
		         
				 int opcao;
		         opcao = Integer.parseInt(moeda);
		         
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
		         
		         
			}
			
		});
		opcao3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 String moeda;
		         moeda = javax.swing.JOptionPane.showInputDialog("Digite 3: Para saber conversão de real para Peso Arg.:"
		         		+ "\n3 - Pesos:");
		         
				 int opcao;
		         opcao = Integer.parseInt(moeda);
		         
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
			
		});
		opcao4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String temperatura;
		        temperatura = javax.swing.JOptionPane.showInputDialog("Digite 4 e Converta para Célsius:"
		        		+ "\n4: ");
		        
		        int opcao;
		        opcao = Integer.parseInt(temperatura);
		        
		        if(opcao == 4) {
		       	 String valor;
		       	 valor = JOptionPane.showInputDialog("Digite a temperatura que deseja converter");
		       	 double valorReal = Double.parseDouble(valor);
		       	 int temperturaConvertida = (int) (5*(valorReal - 32)) / 9;
		       		 String msg;
					 msg = "A temperauta em grau Celsius é: "+temperturaConvertida + "°C";
		       	 JOptionPane.showMessageDialog(null, msg);
			 }
		         
		         
			}
			
		});
		opcao5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String temperatura;
		        temperatura = javax.swing.JOptionPane.showInputDialog("Digite 5 e Converta para Farenhaith:"
		        		+ "\n5:");
		        
		        int opcao;
		        opcao = Integer.parseInt(temperatura);
		        

		        if(opcao == 5) {
		       	 String valor;
		       	 valor = JOptionPane.showInputDialog("Digite a temperatura que deseja converter:");
		       	 double valorReal = Double.parseDouble(valor);
		       	 int temperturaConvertida = (int) (5*(valorReal + 59)) / 9;
		       		 String msg;
					 msg = "A temperauta em grau Farenhaith é: "+temperturaConvertida + "°F";
		       	 JOptionPane.showMessageDialog(null, msg);

		     } 
		        
			}
           
		});
		
		
	}
	   
	public static void main(String[] args) {
		ConversorGrafico janela = new ConversorGrafico();
		janela.setVisible(true);
			}
	
		

		}

		
