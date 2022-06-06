import java.util.Scanner;

public class IntroduccionBucles {

	public static void main(String[] args) {

		int edad = 3;
		boolean apagado = true;
		boolean finPrograma = true;
		
		do {
			System.out.println("¿Quieres encender el ordenador?");
			Scanner scanner = new Scanner(System.in);
			String respuesta = scanner.nextLine();
			respuesta = respuesta.trim().toLowerCase();
			
			if (respuesta.equals("si") || respuesta.equals("sí")) {
				System.out.println("enhorabuena has encendido el ordenador");
				apagado = false;
			} else {
				System.out.println("Perfecto, te volveremos a preguntar hasta que lo enciendas");
			}
			
		} while (apagado);
		
		do {
			
			System.out.println("¿Qué te gustaría hacer? Tienes estas opciones: "
					+ "navegar, enviarCorreo, programar");
			Scanner scanner = new Scanner(System.in);
			String respuesta = scanner.nextLine();
			
			switch (respuesta) {
			case "navegar": System.out.println("estás navegando");
			break;
			case "enviarCorreo": System.out.println("estás enviando un correo");
			break;
			case "programar": System.out.println("estás programando...");
			break;
			}
			
			System.out.println("¿Qué quieres hacer ahora? Apagar (apagar) u otras acciones(acciones)");
			scanner = new Scanner(System.in);
			respuesta = scanner.nextLine();
			respuesta = respuesta.trim().toLowerCase();
			
			if (respuesta.equals("apagar")) {
				System.out.println("Apagando...");
				finPrograma = false;}
			
	
		} while (finPrograma);
		
		
}}
