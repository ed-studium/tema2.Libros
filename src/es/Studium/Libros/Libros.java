package es.Studium.Libros;

import es.Studium.Libros.Autor;

public class Libros {

	private String titulo;
	private Autor autor;
	private String anyoPublicacion;
	private String editorial;
	private int numPaginas;

	public Libros () {
		titulo="";
		autor=new Autor();
		anyoPublicacion="";
		editorial="";
		numPaginas=0;
	}
	public Libros (String t, Autor au, String a, String e, int n) {
		titulo=t;
		autor=au;
		anyoPublicacion=a;
		editorial=e;
		numPaginas=n;	
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String t) {
		titulo=t;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor au) {
		autor=au;
	}
	public String getAnyoPublicacion() {
		return anyoPublicacion;
	}
	public void set(String a) {
		anyoPublicacion=a;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String e) {
		editorial=e;
	}
	public int getNumPaginas() {
		return numPaginas;
	}
	public void setNumPaginas(int n) {
		numPaginas=n;
	}
}