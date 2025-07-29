package JOptPane;

import javax.swing.JOptionPane;

public class InputPane {

	public static void main(String[] args) {
		String carros =	JOptionPane.showInputDialog("Informer a quantidade de carros?");// Tela Dialogo
		String pessoas =	JOptionPane.showInputDialog("Informer a quantidade de pessoas?");// Tela Dialogo
	
		double carroNumero = Double.parseDouble(carros);//Converte String
		double pessoaNumero = Double.parseDouble(pessoas);//Converte String
		
		int divisao = (int) (carroNumero / pessoaNumero); 
		
		double resto = carroNumero % pessoaNumero;
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado?"); // showConfirmDialog Tela de Confirmação
		
		if(resposta == 0) {
			JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao + " carros e sobrou "+ resto + " carros");// Janela do Resultado
		}
	}
			
}
