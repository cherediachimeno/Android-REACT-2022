
public class Flor {

	static int vitalidad;
	boolean Felicidad;
	
	Flor(){
		vitalidad = 0;
		Felicidad = false;
	}
	
	
	public void regar() {
		vitalidad = vitalidad + 10;
		if (vitalidad >= 30) {
			Felicidad = true;
		}
		if (vitalidad > 40) {
			Felicidad = false;
			System.out.println("la planta se ha muerto por el agua");
		}
	}


	public int getVitalidad() {
		return vitalidad;
	}


	public boolean isFelicidad() {
		return Felicidad;
	}

	
	
	
}
