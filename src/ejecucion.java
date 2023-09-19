import java.util.Scanner;

public class ejecucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Biblioteca bi = new Biblioteca();

		String deseaContinuar = "S";
		int index = 0;
		while (deseaContinuar.equalsIgnoreCase("S")) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Que accion desea realizar : \n 1 Agregar libro \n 2 Mostrar libros disponibles"
					+ "\n 3 Buscar libro \n 4 Prestar libro \n 5 Devolver Libro");
			String opcion = scan.nextLine();

			switch (opcion) {
			case "1":
				bi.guardarLibro(index);
				index++;
				break;
			case "2":

				for (Libro libro : bi.getLibros()) {
					if (libro != null && libro.getNumero_libros_disponibles() > 0) {
						System.out.println(libro.toString());
					}
				}
				break;
			case "3":
				System.out.print("Ingrese el título del libro a buscar: ");
				String titulo = scan.nextLine();
				Libro libroEncontrado = bi.buscarLibroPorTitulo(titulo);
				if (libroEncontrado != null) {
					System.out.println(
							"El libro \"" + libroEncontrado.getTitulo() + "\" está disponible en la biblioteca.");
				} else {
					System.out.println("El libro \"" + titulo + "\" no está disponible en la biblioteca.");
				}

				break;
			case "4":
				System.out.print("Ingrese el título del libro a prestar: ");
				String libroAPrestar = scan.nextLine();
				Libro libroPrestado = bi.buscarLibroPorTitulo(libroAPrestar);
				bi.prestarLibro(libroPrestado);
				break;
			case "5":
				System.out.print("Ingrese el título del libro a devolver: ");
				String libroADevolver = scan.nextLine();
				Libro libroDevuelto = bi.buscarLibroPorTitulo(libroADevolver);
				bi.devolverLibro(libroDevuelto);
				break;
			default:
				System.out.println("Opcion no valida");
			}

			System.out.println("Desea continuar el proceso S - SI o N - NO");
			deseaContinuar = scan.nextLine();
		}

		for (Libro libro : bi.getLibros()) {
			if (libro != null) {
				System.out.println(libro.toString());
			}

		}

	}

}
