package com.welcome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PracticandoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Los arrayList serían un tipo de array más completo
		
		// ¿Cómo hacíamos los array "simples"?
		
		/*
		int array[] = {0, 1, 2, 3, 4, 5, 6};
		// LIMITACIÓN 1 -> DE TIPO, no superada por los arrayList
		// LIMITACIÓN 2 -> DE TAMAÑO, superada por los arrayList
		
		System.out.println(Arrays.toString(array));
		array[1] = 55;
		System.out.println(Arrays.toString(array));
		*/
		
		// VAMOS A DECLARAR UN ARRAYLIST
		
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("David");
	//	System.out.println(lista);
		lista.add("Ana");
		lista.add("Montse");
	//	System.out.println(lista);
	//	System.out.println(lista.size());
		lista.remove(0);
		System.out.println(lista);
		
		System.out.println(lista.size()); 
		
		// VAMOS A RECORRERLO...
		/*
		for (Object o: lista) {
			System.out.println(o);
		} */
		
		System.out.println(lista);
		
		// lista.clear();
		
		lista.add("Gustavo");
		lista.add("Pablo");
		lista.add(1, "Nacho");
		lista.set(1, "Álvaro");

		
		
	//	String nombre = lista.get(3);
	//	System.out.println("El elemento situado en el índice 3 es... " + nombre);
		
	//	System.out.println(lista.isEmpty());
		/*
		if (lista.isEmpty()) System.out.println("La lista está vacía, podemos añadir elementos");
		else {
			System.out.println("La lista NO está vacía..., vamos a vaciarla");
			lista.clear();
		} */
		
		
		System.out.println(lista);
		
		System.out.println("Vienes a recoger a tu hijo... ¿Cómo se llama?");
		Scanner scann = new Scanner(System.in);
		String nombre = scann.nextLine();
		
		if(lista.indexOf(nombre) == -1) System.out.println("Creo que te equivocas, no hay ningún niño que se llame así");
		else System.out.println("Estupendo, ahora te traigo a " + nombre);
		
		
		
	}

}
