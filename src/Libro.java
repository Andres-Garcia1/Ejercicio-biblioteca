
public class Libro {

	private String titulo;
	private String autor;
	private int isbn;
	private int numero_libros_disponibles;
	private boolean prestado;

	public Libro() {
	}

	public Libro(String titulo, String autor, int isbn, int numero_libros_disponibles) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.numero_libros_disponibles = numero_libros_disponibles;
		this.prestado = false;

	}

	public void devolverLibro() {
		prestado = false;
	}

	public boolean estaPrestado() {
		return prestado;
	}

	public void prestarLibro() {
		prestado = true;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public int getNumero_libros_disponibles() {
		return numero_libros_disponibles;
	}

	public void setNumero_copias_disponibles(int numero_libros_disponibles) {
		this.numero_libros_disponibles = numero_libros_disponibles;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", numero_libros_disponibles="
				+ numero_libros_disponibles + "]";
	}

}
