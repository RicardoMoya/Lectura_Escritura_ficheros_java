package Main;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class EscrituraFicheros {

	public static void main(String[] args) {

		String[] lineas = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..." };


		/** FORMA 2 DE ESCRITURA. Con el fichero codificado en UTF-8 **/
		Writer out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("fichero_escritura2.txt"), "UTF-8"));
			
			// Escribimos linea a linea en el fichero
			for (String linea : lineas) {
				try {
					out.write(linea+"\n");
				} catch (IOException ex) {
					System.out.println("Mensaje excepcion escritura: " + ex.getMessage());
				}
			}

		} catch (UnsupportedEncodingException | FileNotFoundException ex2) {
			System.out.println("Mensaje error 2: " + ex2.getMessage());
		} finally {
			try {
				out.close();
			} catch (IOException ex3) {
				System.out.println("Mensaje error cierre fichero: " + ex3.getMessage());
			}
		}
	}

}
