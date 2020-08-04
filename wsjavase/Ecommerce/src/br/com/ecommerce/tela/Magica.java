package br.com.ecommerce.tela;

import javax.swing.JOptionPane;

public class Magica {
	
	    // retorna mensagem do tipo String
		public static String t (String msg) {
			return JOptionPane.showInputDialog(msg).toUpperCase();
		};
		
		// retorna mensagem do tipo Integer
		public static int i (String msg) {
			return Integer.parseInt(t(msg));
		};
		
		// retorna mensagem do tipo Integer
		public static Float f (String msg) {
			return Float.parseFloat(t(msg));
		};
		
		// retorna mensagem do tipo Double
		public static Double d (String msg) {
			return Double.parseDouble(t(msg));
		};
}
