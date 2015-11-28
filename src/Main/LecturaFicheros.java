package Main;

import java.io.File;
import java.util.Scanner;

public class LecturaFicheros {

	public static void main(String[] args) {

		// Fichero del que queremos leer
		// (debemos especificar la ruta -> ejem: c:\\nombreCarpeta\...\fichero.txt o \var\www\fichero.txt)
		File fichero = new File("fichero_leer.txt");
		Scanner s = null;

		try {
			// Leemos el contenido del fichero
			System.out.println("... Leemos el contenido del fichero ...");
			s = new Scanner(fichero);

			// Leemos linea a linea el fichero
			while (s.hasNextLine()) {
				String linea = s.nextLine(); 	// Guardamos la linea en un String
				System.out.println(linea);		// Imprimimos la linea
			}

		} catch (Exception ex) {
			System.out.println("Mensaje: " + ex.getMessage());
		} finally {
			// Cerramos el fichero tanto si la lectura ha sido correcta o no
			try {
				if (s != null)
					s.close();
			} catch (Exception ex2) {
				System.out.println("Mensaje 2: " + ex2.getMessage());
			}
		}
	}
}
