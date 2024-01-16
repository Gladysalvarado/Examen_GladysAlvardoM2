package com.corenetworks.presentacion;


import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rutaArchivo;
        File archivo= null;
        System.out.println("Ingrese la ruta completa del archivo: ");
        rutaArchivo = scanner.nextLine();

        archivo = new File(rutaArchivo);

        if (archivo.exists()) {
            // imprimir informacion sobre el archivo
            System.out.println("Información del archivo:");
            System.out.println("Nombre: " + archivo.getName());
            System.out.println("Ruta: " + archivo.getAbsolutePath());
            System.out.println("Tamaño: " + archivo.length() + " bytes");
            System.out.println("Es un directorio: " + archivo.isDirectory());
            System.out.println("Es un archivo: " + archivo.isFile());
            System.out.println("Última modificación: " + archivo.lastModified());
        } else {
            System.out.println("El archivo no existe.");
        }

        scanner.close();
    }
}