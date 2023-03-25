package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce tu nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        String iniciales = ClaseCadena.DevuelveIniciales(nombreCompleto);
        if (iniciales.isEmpty()){
            System.out.println("No has introducido un nombre válido.");
        } else {
            System.out.println("Tus iniciales son: " + iniciales);
        }
    }
}
