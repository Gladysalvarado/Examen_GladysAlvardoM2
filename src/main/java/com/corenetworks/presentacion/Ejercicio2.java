package com.corenetworks.presentacion;


import java.io.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Ingrese el nombre del archivo de origen: ");
            String archivoOrigen = br.readLine();
            System.out.print("Ingrese el nombre del archivo cifrado: ");
            String archivoCifrado = br.readLine();

            System.out.print("Ingrese un valor numérico entre 1 y 255: ");
            int valorXOR = Integer.parseInt(br.readLine());

                if (valorXOR < 1 || valorXOR > 255) {
                System.out.println("El valor numérico debe estar entre 1 y 255.");
                return;
            }

           cifrarArchivo(archivoOrigen, archivoCifrado, valorXOR);

            System.out.println("Cifrado completado con éxito.");
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }

    private static void cifrarArchivo(String archivoOrigen, String archivoCifrado, int valorXOR) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivoOrigen));
             BufferedWriter bw = new BufferedWriter(new FileWriter(archivoCifrado))) {

            int caracter;
            while ((caracter = br.read()) != -1) {
                int caracterCifrado = caracter ^ valorXOR;
                     bw.write(caracterCifrado);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}