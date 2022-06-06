package com.welcome;

public class condicionales {

	public static void main(String[] args) {
		
		// CONDICIONAL DE TIPO SIMPLE (O CONDICIONAL IF). 
		
		/*
		
		int nota = 3;
	
		if (nota < 4) {
			System.out.println("Tienes una nota menor a 4");
		}
		
		*/
		
		// CONDICIONAL DOBLE (O CONDICIONAL IF ELSE).
		
		/* 
		Boolean estoyEstudiando = false;
		
		if (estoyEstudiando) {
			System.out.println("Pues es duro estudiar. Muchos ánimos");
		} else {
			System.out.println("Más tranquilo entonces sin estudiar");
		}

		*/
		/*
		int nota = 6;
		
		if (nota > 5) {
			System.out.println("Has aprobado");
		} else {
			System.out.println("Has suspendido");
		}
		*/
		
		// CONDICIONALES MÚLTIPLES (HAY DE DOS TIPOS)
		
		// PRIMER TIPO -> CONDICIONAL LLAMADO "ELSE IF". 
		/*
		
		int nota = -5;
		             //and
		if (nota >= 0 && nota < 5) {
			System.out.println("SUSPENSO");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("SUFICIENTE-BIEN");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("NOTABLE");
		} else if (nota >= 9 && nota <= 10) {
			System.out.println("EXCELENTE");
		} else {
			System.out.println("valor no válido");
		}
		*/
		/* 
		int tomates = 3;
		int melocotones = 1;
		
		if (tomates == 3 && melocotones == 1) {
			System.out.println("Tienes o bien 2 tomates o bien 3");
		}
		*/
		
		// SEGUNDO TIPO -> EL SWITCH
		/*
		
		int notaExamen = 11;
		
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
		default: System.out.println("valor no valido");
		break;
		}
		*/
		
	
	}
}
