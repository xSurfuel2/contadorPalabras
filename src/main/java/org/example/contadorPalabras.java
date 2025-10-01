package org.example;
import java.io.*;


public class contadorPalabras
{
    public static void main(String[] args) {
        int totalPalabras = 0;

        try {
            InputStreamReader isr = new InputStreamReader(System.in); // flujo de entrada
            BufferedReader br = new BufferedReader(isr);              // buffer de lectura

            String linea;
            while ((linea = br.readLine()) != null) {
                if (!linea.trim().isEmpty()) { // ignorar líneas vacías
                    String[] palabras = linea.trim().split("\\s+"); // separar por uno o más espacios
                    totalPalabras += palabras.length;
                    System.out.println("Palabras en la línea: " + palabras.length + " | Línea: " + linea);
                }
            }

            br.close();
            isr.close();

            System.out.println("Número total de palabras: " + totalPalabras);
        } catch (IOException e) {
            System.err.println("Error al leer la entrada: " + e.getMessage());
        }
    }
}
