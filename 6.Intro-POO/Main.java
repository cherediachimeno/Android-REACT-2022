package com.welcome;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bienvenido al concesionario. ¿Quieres comprar un coche?");
		
		Scanner scanner = new Scanner(System.in);
		String respuesta = scanner.nextLine();
		respuesta = respuesta.toLowerCase().trim();
		Coche opel = null;
		
		if (respuesta.equals("si") || respuesta.equals("sí")) {
			
			System.out.println("perfecto, vamos a ello. Aquí tienes tu Opel");
			
			// CREACIÓN DE NUESTRO OBJETO
		//nombre_clase     nombre_objeto   == new nombre_clase
			
			opel = new Coche();
			
			System.out.println(opel.ruedas);
			System.out.println(opel.esGasolina);
			//System.out.println(opel.modelo);
			
			opel.definir("Corsa", true);
			
			System.out.println(opel.modelo);
			System.out.println(opel.puertas);
			System.out.println(opel.potencia);
			
			/*
			opel.eleccion(opel); */
		}
		
		
		
		// CREAMOS UN COCHE... ACELERO, FRENO... 
		
		
		
	}

}
