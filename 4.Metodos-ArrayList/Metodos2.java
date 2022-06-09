package com.welcome;

import java.util.Scanner;

public class Metodos2 {

	
	// MÉTODO INICIALIZADOR
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inicializando programa");
		calcularPantalla();
		int edad = 40;
		int valorDevuelto = calculoDevolucion();
		
		// VAMOS A HACER UN CÁLCULO CON PARÁMETROS...
		
		System.out.println("Dime dos precios");
		Scanner scann = new Scanner(System.in);
		int respuesta = scann.nextInt();
		int respuesta2 = scann.nextInt();
		
		int precio = calculo(respuesta, respuesta2);
		System.out.println(precio);
		
		System.out.println("Para finalizar, dime tu nombre");
		Scanner scann2 = new Scanner(System.in);
		String nombre = scann2.nextLine();
		
		// int calculo = calcularPortes(precio, nombre);
		System.out.println("El precio final con portes es de " + calcularPortes(precio, nombre));
		
	}
	
	// MÉTODO SENCILLO SIN DEVOLVER VALORES
	
	public static void calcularPantalla() {
		System.out.println("Estoy dentro del método que NO DEVUELVE ");
		int resultado = 50;
	}
	
	// MÉTODO SENCILLO QUE DEVUELVE VALORES
	
	public static int calculoDevolucion() {
		System.out.println("Estoy dentro del método que devuelve");
		int resultado = 100;
		return resultado;
	}
	
	// MÉTODO CON PARÁMETROS
	
	
	public static void calculo(int num1) {
		double resultado = (int) (num1 + num2);
	}
	
	public static double calculo(double num1, double num2) {
		double resultado = num1 + num2;
		return resultado;
	}
	
	public static int calculo(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}
	
	public static void calculo() {
		System.out.println("hola");
	}
	
	
	public static int calcularPortes(int precio, String nombre) {
		System.out.println("Bienvenido " + nombre + " estamos calculando los portes...");
		int calculo = precio + 4;
		return calculo;
	}
	
	
	
	
	

}
