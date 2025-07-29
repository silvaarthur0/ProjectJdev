package JOptPane;

import javax.swing.JOptionPane;

public class InputPane {

	public static void main(String[] args) {
	String carros =	JOptionPane.showInputDialog("Informer a quantidade de carros?");
	String pessoas =	JOptionPane.showInputDialog("Informer a quantidade de pessoas?");

	double carroNumero = Double.parseDouble(carros);
	double pessoaNumero = Double.parseDouble(pessoas);
	
	int divisao = (int) (carroNumero / pessoaNumero); 
	
	double resto = carroNumero % pessoaNumero;
	
	JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + "carros e sobrou "+ resto + " carros");
	}
			
}
