package br.com.polimorfismo.tela;

import javax.swing.JOptionPane;

public class Tela {
	
	public static float f(String msg) {
		return Float.parseFloat(t(msg));
	}
	public static int i(String msg) {
		return Integer.parseInt(t(msg));
	}
	
	public static String t(String msg) {
		return JOptionPane.showInputDialog(msg).toLowerCase();
	}
	
	public static double d(String msg) {
		return Double.parseDouble(t(msg));
	}
	
	public static boolean b(String msg) {
		return Boolean.parseBoolean(t(msg));
	}
	
	public static boolean b2(String msg) {
		if (JOptionPane.showConfirmDialog(null, msg, "Aplicacao Polimorfismo", JOptionPane.YES_NO_OPTION)==0) {
			return true;
		} 
			return false;
	}
}

