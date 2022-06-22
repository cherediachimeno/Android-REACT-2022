import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Eres de RRHH o no?");
		Scanner scanner = new Scanner(System.in);
		String respuesta = scanner.nextLine();
		
		if(respuesta.equals("si")) pregunta();
		
		System.out.println("quieres volver a consultar?");
		scanner = new Scanner(System.in);
		String respuesta2 = scanner.nextLine();
		
		if(respuesta2.equals("si")) pregunta();
		
		}
	
	public static void pregunta() {
		Trabajador David = new Trabajador("777106510P", 242445572, "David", "Rodríguez Balboa", "C/ La plaza 1, 1º 3a", "david.rod@gmail.com", true, 3);
		System.out.println("¿Qué información deseas conocer del trabajador? 1. DNI, 2. Nº SS, 3. NOMBRE, 4. APELLIDOS. 5. DIRECCION, 6. CORREO, 7. ESTÁ ESTUDIANDO, 8. TRAMO");
		Scanner scanner = new Scanner(System.in);
		int seleccion = scanner.nextInt();
		
		switch (seleccion) {
		
		case 1: System.out.println(David.getDNI());
		break;
		case 2: System.out.println(David.getNumeroSeguridadSocial());
		break;
		case 3: System.out.println(David.getNombre());
		break;
		case 4: System.out.println(David.getApellidos());
		break;
		
	}
	
	}
}
