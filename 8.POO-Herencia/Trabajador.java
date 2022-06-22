
public class Trabajador {

	// ATRIBUTOS
	
	private String DNI;
	private int numeroSeguridadSocial;
	private String nombre;
	private String apellidos;
	private String direccion;
	private String correo;
	private boolean estudiando;
	private int tramoSalarial;

	// MÉTODOS
	// PRIMER MÉTODO: UN CONSTRUCTOR A MODO DE REGISTRO DE INFORMACIÓN
	
	public Trabajador(String DNI, int social, String nombre, String apellido, String direccion, String mail, boolean estudiando, int tramo) {
		
		this.DNI = DNI;
		this.numeroSeguridadSocial = social;
		this.nombre = nombre;
		this.apellidos = apellido;
		this.direccion = direccion;
		this.correo = mail;
		this.estudiando = estudiando;
		this.tramoSalarial = tramo;
		
	}
	
	// RESTO DE MÉTODOS
	
	
	
	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public int getNumeroSeguridadSocial() {
		return numeroSeguridadSocial;
	}

	public void setNumeroSeguridadSocial(int numeroSeguridadSocial) {
		this.numeroSeguridadSocial = numeroSeguridadSocial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public boolean isEstudiando() {
		return estudiando;
	}

	public void setEstudiando(boolean estudiando) {
		this.estudiando = estudiando;
	}

	public int getTramoSalarial() {
		return tramoSalarial;
	}

	public void setTramoSalarial(int tramoSalarial) {
		this.tramoSalarial = tramoSalarial;
	}

	
}