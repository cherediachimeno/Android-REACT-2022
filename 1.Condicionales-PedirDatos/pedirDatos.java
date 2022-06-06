package com.welcome;

import java.util.Scanner;

public class pedirDatos {

	public static void main(String[] args) {

		System.out.println("¿Que nota has sacado en el examen?");
		
		// FORMA MÁS INTERESANTE DE PEDIR DATOS AL USUARIO...
		// UTILIZAREMOS LA ESTRUCTURA DEL SCANNER. 
		
		// PRIMER PASO -> CREACIÓN DE LAS FUNCIONALIDADES
		// OJO HAY QUE IMPORTAR ESAS FUNCIONALIDADES.
		
		Scanner preguntando = new Scanner(System.in);	
		// SEGUNDO PASO -> PEDIMOS AL USUARIO Y GRABAMOS ESA INFORMACIÓN EN UNA VARIABLE
		
		int notaExamen = preguntando.nextInt();
		
		switch(notaExamen) {
		case 1:
		case 2:
		case 3:
		case 4: System.out.println("suspenso");
		break;
		case 5:
		case 6:	System.out.println("bien");
		break;
		case 7: 
		case 8: System.out.println("notable");
		break;
		case 9:
		case 10: System.out.println("excelente");
		break;
		default: System.out.println("valor no valido");
		break;
		}
		
		// preguntando = new Scanner(System.in);

		System.out.println("Y... ¿como te llamas?");
		
		String nombre = preguntando.nextLine();
		
		System.out.println("Hola " + nombre + " tienes como nota un " + notaExamen);
		
		preguntando.close(); 
	}

}
