package com.welcome;

import javax.swing.JOptionPane;

public class JOpt {

	public static void main(String[] args) {

		
		String textoNum = JOptionPane.showInputDialog("Dime un número");
		int num1 = Integer.parseInt(textoNum);
		String textoNum2 = JOptionPane.showInputDialog("Dime otro número");
		int num2 = Integer.parseInt(textoNum2);
		
		JOptionPane.showMessageDialog(null, "Los números seleccionados han sido... " + num1 + " y " + num2);
		JOptionPane.showMessageDialog(null, "La suma es de " + (num1 + num2));
	}

}