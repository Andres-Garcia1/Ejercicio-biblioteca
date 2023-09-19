
import java.util.Scanner;

public class Biblioteca {

	private Libro libros[] = new Libro[30];

	public Biblioteca() {

	}

	public Libro[] getLibros() {
		return libros;
	}

	public void setLibros(Libro[] libros) {
		this.libros = libros;
	}

	public void guardarLibro(int posicion) {

		Scanner scan = new Scanner(System.in);
		System.out.println("ingrese el titulo del libro por favor");

		String titulo = scan.nextLine();

		System.out.println("Digite autor del libro: ");

		String autor = scan.nextLine();

		System.out.println("Digite el codigo del libro por favor: ");

		int isbn = scan.nextInt();
		System.out.println("Ingrese el numero de libros: ");

		int numero_libros_disponibles = scan.nextInt();

		Libro li = new Libro(titulo, autor, isbn, numero_libros_disponibles);

		this.libros[posicion] = li;
	}



	public Libro buscarLibroPorTitulo(String titulo) {
		for (Libro libro : libros) {
			if (libro.getTitulo().equalsIgnoreCase(titulo)) {
				return libro;
			}
		}
		return null;
	}

	public void prestarLibro(Libro libro) {
		if (libro != null && !libro.estaPrestado()) {
			libro.prestarLibro();
			System.out.println("Se ha prestado el libro: " + libro.toString());
		} else {
			System.out.println("El libro no está disponible para prestar.");
		}
	}

	public void devolverLibro(Libro libro) {
		libro.devolverLibro();
		System.out.println("Se ha devuelto el libro: " + libro.getTitulo());
	}

}