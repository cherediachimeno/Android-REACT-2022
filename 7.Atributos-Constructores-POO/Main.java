package com.welcome;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido al concesionario. ¿Quieres comprar un coche?");
		
		Scanner scanner = new Scanner(System.in);
		String respuesta = scanner.nextLine();
		respuesta = respuesta.toLowerCase().trim();
		Coche miCoche = null;
		Coche miCoche2 = null;
		
		// CONDICIONAL PARA COMPRAR COCHE...
		if (respuesta.equals("si") || respuesta.equals("sí")) {
			
			System.out.println("perfecto. ¿Qué marca quieras?");
			Scanner scanner2 = new Scanner(System.in);
			String marca = scanner2.nextLine();
			
			System.out.println("perfecto. ¿Qué modelo quieras?");
			String modelo = scanner2.nextLine();
			
			System.out.println("Quieres que sea gasolina, diesel o eléctrico?");
			String tipo = scanner2.nextLine();
			tipo = tipo.toLowerCase();

			
			System.out.println("¿De cuántas puertas quieres el coche?");
			scanner2 = new Scanner(System.in);
			int puertas = scanner2.nextInt();
			
			System.out.println("¿De qué potencia? 5000 o 6000");
			int potencia = scanner2.nextInt();
			
			miCoche = new Coche(marca, modelo, tipo, puertas, potencia);
			// System.out.println(miCoche.marca + miCoche.modelo + miCoche.puertas + miCoche.potencia);
			miCoche2 = new Coche();
			
		}
			
		miCoche.acelerar();
		
		System.out.println("Quieres seguir acelerando?");

		scanner = new Scanner(System.in);
		String quieresAcelerar = scanner.nextLine();
		quieresAcelerar = quieresAcelerar.toLowerCase().trim();
		
		if (respuesta.equals("si") || respuesta.equals("sí")) {
			miCoche.acelerar();
			
	}
		//System.out.println(miCoche);
		
	//	System.out.println(miCoche.toString());
		System.out.println("Perfecto, estos son los datos de tu nuevo vehiculo");
		System.out.println(miCoche);
		System.out.println(miCoche2);
}
	
}
