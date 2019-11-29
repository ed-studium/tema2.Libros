package es.Studium.Libros;

public class Autor {
	private String nombre;
	private String apellido;
	private String nacionalidad;
	public Autor() {
		nombre="";
		apellido="";
		nacionalidad="";
	}
	public Autor(String nom, String a, String nac) {
		nombre=nom;
		apellido=a;
		nacionalidad=nac;
	}
	public String getNombre () {
		return nombre;
	}
	public void setNombre(String nom) {
		nombre=nom;
	}
	public String getApellido () {
		return apellido;
	}
	public void setApellido(String a) {
		apellido=a;
	}
	public String getNacionalidad () {
		return nacionalidad;
	}
	public void setNacionalidad(String nac) {
		nacionalidad=nac;
	}
}