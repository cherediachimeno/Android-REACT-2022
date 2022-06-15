package com.welcome;

import java.util.Scanner;

public class Coche {
	
	// UNA CLASE TIENE BÁSICAMENTE DOS COMPONENTES PRINCIPALES: 
	// POR UN LADO, TENEMOS LOS LLAMADOS ATRIBUTOS 
	// Y POR EL OTRO, TENEMOS MÉTODOS
	// ATRIBUTOS+MÉTODOS = MIEMBROS DE UNA CLASE. 
	
	// ATRIBUTOS - CARACTERÍSTICAS
	
	public int potencia;
	public int puertas;
	private Boolean esElectrico;
	private Boolean esDiesel;
	public Boolean esGasolina;
	public String modelo;
	final int ruedas = 4;
	
	// MÉTODOS - FUNCIONALIDADES QUE REALIZA EL COCHE
	
	public void definir(String m, Boolean gasolina) {
		modelo = m;
		esGasolina = gasolina;
		puertas = 5;
		potencia = 5000;
		
	}
	
	public void acelerar() {
		System.out.println("El coche está acelerando");
	}
	public void frenar() {
		System.out.println("El coche está frenando");
	}
	private void arreglar() {
		System.out.println("El coche se está arreglando");
	}
	public void llenarDeposito() {
		System.out.println("Estamos llenando el depósito");
	}
	public void cargarCoche() {
		System.out.println("Estamos cargando el coche eléctrico");
	}
	
	/*
	
	protected void eleccion(Coche o) {
		System.out.println("¿Qué quieres hacer? 1. Acelerar; 2. Frenar; 3.Llenar Depósito");
		
		Scanner scanner2 = new Scanner(System.in);
		int deseo = scanner2.nextInt();
		
		switch (deseo) {
		case 1: o.acelerar();
		break;
		case 2: o.frenar();
		break;
		case 3: o.llenarDeposito();
		break;
		}
	}
	
	*/

}
