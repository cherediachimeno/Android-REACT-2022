package com.welcome;

public class DesarrolloBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TERCER TIPO DE BUCLE -> BUCLE FOR
             //valor inicial -  condición	 - acción que realiza

		/* 
		for (int i = 1; i < 5; i++) {
			
			System.out.println("Estamos dando una vuelta, en concreto vamos por la vuelta número " + i);
		
			}
		
		for (int contador = 1; contador <= 100; contador++) {
			
			System.out.println("Estamos dando una vuelta" + " el contador está en... " + contador);
		
			}
		
		String nombre = "Pablo";
		
		for (int i = 1; i <= nombre.length(); i++ ) {
			System.out.println("Estamos dando vueltas hasta que acabe la longitud de la variable nombre que contiene el String " + nombre);
			System.out.println("Vuelta nº " + i);
			System.out.println("El nombre tiene... " + nombre.length() + " caracteres");
			// System.out.println("Este es el caracter... " + nom)
		}

		*/
		
		// RECORRIENDO ARRAYS 
		/*
		String[] coches = {"Volvo", "Fiat", "Renault", "BMW", "Citroen"};
		//	System.out.println(coches[4]);
			
			String[] trenes = {"UT447", "UT448", "UT252"};
			
			for (int i = 0; i < coches.length; i++){
				System.out.println("Estoy dando vueltas en el bucle... " + "Posición nº " + i + " cuya marca es " + coches[i]);
				for (int j = 0; j < trenes.length; j++) {
					System.out.println("recorriendo trenes, modelo " + trenes[j]);
				}
			}
			
			*/
		
		// CUARTO BUCLE, FOR PARA ARRAYS (EXCLUSIVO PARA ARRAYS). 
		
		String[] alumnosCurso = {"Carmen", "Ivan", "Maria", "Enrique", "David", "Didac", "Nil", "Aina", "Lourdes"};
		
		int[] notasCurso = {10, 5, 5, 5, 5, 10, 9, 7, 4};
		int contador = 0;
		
		/* 
		for (int i = 0; i < alumnosCurso.length; i++) {
			System.out.println(alumnosCurso[i]);
			System.out.println(notasCurso[i]);
		}
		*/
	
	
		for (String i : alumnosCurso) {
			System.out.println(i + " " + notasCurso[contador]);
			contador++;
			
			// System.out.println(notasCurso[j]);
			
			}
		/*
		
		for (String i : alumnosCurso) System.out.println(i);
		for (int i = 0; i < alumnosCurso.length; i++) {
			System.out.println(alumnosCurso[i]);
			System.out.println("probando");
			
		}
		for (int i : notasCurso) {
			
			System.out.println(i);
		}
		
		*/
	

}
}