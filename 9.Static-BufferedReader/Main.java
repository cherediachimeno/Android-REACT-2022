
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		
		Flor tulipan = new Flor();
		
		tulipan.regar();
		System.out.println(tulipan.getVitalidad());
		System.out.println(tulipan.isFelicidad());
		tulipan.regar();
		tulipan.regar();
		tulipan.regar();
		tulipan.regar();
		tulipan.regar();
		System.out.println(tulipan.getVitalidad());
		System.out.println(tulipan.isFelicidad());
	
		Flor Rosa = new Flor();
		
		Rosa.regar();
		System.out.println(Rosa.getVitalidad());
		System.out.println(Rosa.isFelicidad());
		
		
		*/
		
		Flor jardinero = new Flor();
		Flor casero = new Flor();
		
		jardinero.regar();
		jardinero.regar();
		System.out.println("La planta tiene de vitalidad... " + jardinero.getVitalidad());
		System.out.println("es feliz? " + jardinero.isFelicidad());
		
		casero.regar();
		casero.regar();
		
		System.out.println("La planta tiene de vitalidad... " + casero.getVitalidad());
		System.out.println("es feliz? " + casero.isFelicidad());
	}
	
	}
