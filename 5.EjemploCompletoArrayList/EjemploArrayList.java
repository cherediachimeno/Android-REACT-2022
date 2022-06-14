import java.util.ArrayList;
import java.util.Scanner;

public class EjemploArrayList {

	static int numeroSeriesVistas;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> seriesVistas = new ArrayList<>();
		Boolean bucle = true;
			
		System.out.println("¿Has visto alguna serie este último mes? Afirmativo (true), negativo (false)");
		Scanner scan = new Scanner(System.in);
		Boolean visto = scan.nextBoolean();
		
		while (visto) {
			// PRIMERO, PREGUNTAMOS SERIES VISTAS.
			// GUARDO EN UNA VARIABLE INT LA CANTIDAD QUE HE PREGUNTADO AL USUARIO AL LLAMAR A LA FUNCIÓN
			numeroSeriesVistas = numeroSeriesVistas();
			
			// SEGUNDO, PREGUNTAR SERIES VISTAS
			seriesVistas = preguntarSeries();
			System.out.println("Perfecto");
			visto = false;
		}
		
		do {
	
		System.out.println("En este rato, has visto alguna serie más?");
		scan = new Scanner(System.in);
		String seriesVistaAhora = scan.nextLine();
		seriesVistaAhora = seriesVistaAhora.toLowerCase().trim();
		if (seriesVistaAhora.equals("sí") || seriesVistaAhora.equals("si")) {
			
			System.out.println("Qué serie acabas de ver?");
			String serie = scan.nextLine();
			seriesVistas.add(serie);
			
			
		} else {
			System.out.println("Perfecto, las series que has visto las he apuntado aquí: " + seriesVistas);
			System.out.println("Adiós");
			bucle = false;
		}
		
		} while(bucle);
		
		System.out.println("Quieres comprobar si has visto una serie?");
		Scanner comprobar = new Scanner(System.in);
		String comprobacion = scan.nextLine();
		comprobacion = comprobacion.toLowerCase().trim();
		
		if (comprobacion.equals("sí") || comprobacion.equals("si")) {
			
			System.out.println("Dime serie y te digo si la has visto");
			String comprobarSerieConcreta = comprobar.nextLine();
			
			if (seriesVistas.indexOf(comprobarSerieConcreta) == -1) System.out.println("Esta serie NO la has visto");
			else System.out.println("Serie VISTA");
			
		} else System.out.println("Menos mal, gracias y adiós");
			
	}
	
	public static int numeroSeriesVistas() {
		
		System.out.println("Cuántas series has visto");
		Scanner escaneando = new Scanner(System.in);
		int cantidad = escaneando.nextInt();
		
		return cantidad;
	}
	
	
	public static ArrayList<String> preguntarSeries(){
		ArrayList<String> series = new ArrayList<>();
		
		for (int i = 0; i < numeroSeriesVistas; i++) {
			System.out.println("Dime nombre de la serie");
			Scanner scanner = new Scanner(System.in);
			String respuesta = scanner.nextLine();
			series.add(respuesta);
		}
		
		return series;
		
	}

}














// EJEMPLO 1
/*
ArrayList<String> objetivos = new ArrayList<>();

System.out.println("¿Cuántos objetivos principales tienes de aquí a final de año?");

Scanner scan = new Scanner(System.in);
int cantidad = scan.nextInt();
String respuesta;

for (int i = 0; i < cantidad; i++) {
	System.out.println("Dime objetivo");
	Scanner scanner = new Scanner(System.in);
	respuesta = scanner.nextLine();
	objetivos.add(respuesta);
}

System.out.println("Aquí todos tus objetivos: " + objetivos);
*/

