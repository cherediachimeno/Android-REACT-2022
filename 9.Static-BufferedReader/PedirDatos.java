package com.welcome;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PedirDatos {

	public static void main(String[] args){
		
	// EJEMPLO SCANNER 
	System.out.println("Dime la edad de tu hijo/a");
	Scanner scanner = new Scanner(System.in);
	int edad = scanner.nextInt();
	
	System.out.println("la edad de tu hijo/a es de " + edad);
	}
		/*
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("¿Estás estudiando?");
	
	String entrada = br.readLine();
	
	
	//int edad = Integer.parseInt(entrada);
	//double numero = Double.parseDouble(entrada);
	boolean estudiando = Boolean.parseBoolean(entrada);

	
	//System.out.println("La edad de tu hijo/a a es de " + edad);
	if (estudiando) System.out.println("estudias");
	else System.out.println("no estás estudiando");
		
	System.out.println(estudiando);
	*/
}
