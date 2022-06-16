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
	public String marca;
	final int ruedas = 4;
	
	// ATRIBUTOS QUE SE VAN MODIFICANDO...
	
	int velocidadActual;
	int kilometraje;
	int deposito;
	
	// MÉTODOS - FUNCIONALIDADES QUE REALIZA EL COCHE
	
	// PRIMERO, CONSTRUCTOR
	
	public Coche() {
		System.out.println("estoy pasando por el constructor por defecto");
		this.modelo = "Serie 3";
	}
	
	public Coche(String marca, String modelo, String tipo, int puertas, int potencia){
		this.marca = marca;
		this.modelo = modelo;
		this.puertas = puertas;
		this.potencia = potencia;
		
		if(tipo.equals("gasolina")) esGasolina = true;
		else if(tipo.equals("diesel")) esDiesel = true;
		else if(tipo.equals("eléctrico")) esElectrico = true;
		
		deposito = 100;
	}
	
	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	// SEGUNDO, MÉTODOS 
	
	public void definir(String modelo, Boolean esGasolina) {
		this.modelo = modelo;
		this.esGasolina = esGasolina;
		puertas = 5;
		potencia = 5000;
	}
	
	public void acelerar() {
		System.out.println("El coche está acelerando");
		velocidadActual = 120;
		kilometraje = kilometraje + 10;
		deposito = deposito - 25;
		if (deposito < 55) System.out.println("cuidado, hay que rellenar depósito");
	}
	public void frenar() {
		System.out.println("El coche está frenando");
	}
	private void arreglar() {
		System.out.println("El coche se está arreglando");
	}
	
	@Override
	public String toString() {
		return "Coche [potencia=" + potencia + ", puertas=" + puertas + ", esElectrico=" + esElectrico + ", esDiesel="
				+ esDiesel + ", esGasolina=" + esGasolina + ", modelo=" + modelo + ", marca=" + marca + ", ruedas="
				+ ruedas + ", velocidadActual=" + velocidadActual + ", kilometraje=" + kilometraje + ", deposito="
				+ deposito + "]";
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
