
public class Telefono {

	private final int medida = 0;
	private int pantalla;
	private boolean esTactil;
	private String marca;
	private String modelo;
	
	/*
	public Telefono(int medida, int pantalla, boolean esTactil, String marca, String modelo) {
		super();
		this.medida = medida;
		this.pantalla = pantalla;
		this.esTactil = esTactil;
		this.marca = marca;
		this.modelo = modelo;
	}
	*/
	
	final public void llamar() {
		System.out.println("llamando");
	}


	public void mandarMensaje() {
		System.out.println("mandando mensaje");
	}
	

	public void conectarseInternet() {
		System.out.println("conectándose");
	}
	
	
	
	public int getMedida() {
		return medida;
	}
	public int getPantalla() {
		return pantalla;
	}
	public boolean isEsTactil() {
		return esTactil;
	}
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}

	
}
