package com.welcome;

import java.util.Scanner;

public class Metodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		System.out.println("Quieres ejecutar el método que te preguntará por tu nombre?");
		Scanner scann = new Scanner(System.in);
		String respuesta = scann.nextLine();
		respuesta = respuesta.toLowerCase().trim();
		
		if(respuesta.equals("si") || respuesta.equals("sí")) {
			System.out.println("Perfecto, después de ejecutar el método, podemos decir que tu nombre es " + devolucionString());
			String nombre = devolucionString();
		}
		
		*/
		
		System.out.println("Dime dos numeros...");
		Scanner scann = new Scanner(System.in);
		int num1 = scann.nextInt();
		int num2 = scann.nextInt();
		
		System.out.println("La suma es de " + suma(num1, num2));
	
	}
	
	public static void pintarPantalla() {
		
		System.out.println("Pintando pantalla desde el método");
	}
	
	public static String devolucionString() {
		System.out.println("Dime tu nombre");
		Scanner scann = new Scanner(System.in);
		String nombre = scann.nextLine();
		return nombre;
	}
	
	public static double sumaSimple() {
		int num1 = 5;
		int num2 = 10;
		double resultado = num1 + num2;
		return resultado;
	}
	

	public static int suma(int valor1, int valor2) {
		
		
		int resultado = valor1 + valor2;
		return resultado;
	}
	
	
	
	
	

	
	
	
}
