package es.Studium.Libros;
public class Datos 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Autor a1=new Autor ("Pepe","Garcia", "Español");
		Libros l1=new Libros("Quien mato a laura",a1, "1987", "Editorial ED", 300);
		System.out.println(l1.getTitulo()+" Tiene "+l1.getNumPaginas());
		Autor a2=new Autor ("Maria","Carballo", "Español");
		Libros l2=new Libros("Recetas de Maria",a2, "2018", "Editorial MO", 420);
		System.out.println(l2.getTitulo()+" Tiene "+l2.getNumPaginas());
		Autor a3=new Autor ("Emilio","Perez", "Español");
		Libros l3=new Libros("Como aprender Java",a3, "2016", "Editorial IG", 500);
		System.out.println(l3.getTitulo()+" Tiene "+l3.getNumPaginas());
		System.out.println(l3.getTitulo()+" Tiene "+l3.getNumPaginas());
	}
}
