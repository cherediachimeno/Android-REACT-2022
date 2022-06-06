package com.welcome;

import java.util.Arrays;

public class Practicando {
	
	// MÉTODO INICIALIZADOR 
	
	public static void main(String[] args) {
	
		// DOS GRUPOS... EN CADA GRUPO 4 ESTUDIANTES
		String estudiante1Grupo1 = "Grace";
		String estudiante2Grupo1 = "Maria";
		String estudiante3Grupo1 = "Ana";
		String estudiante4Grupo1 = "Gustavo";
		
		
		// ESPECIFICO DESDE EL PRINCIPIO (NO SE PUEDE CAMBIAR) TANTO EL TIPO COMO LA CANTIDAD.
		
		// EN ESTE CASO, TIPO STRING, CANTIDAD DE ELEMENTOS 3
		String []grupo1 = {"Grace", "Maria", "Antonio"};
		String []grupo2 = {estudiante1Grupo1, "Maria", "Antonio"};
		String imprimir = Arrays.toString(grupo1);
		System.out.println(imprimir);
	}
}
