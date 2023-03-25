package org.example;

public class ClaseCadena {

    public static String DevuelveIniciales(String nombreCompleto) {
        // matches es una función que permite comprobar si una cadena de texto cumple con una expresión regular
        if (!nombreCompleto.matches("^[a-zA-Z ]*$")) {
            return "";
        }
        String[] nombres = nombreCompleto.split(" ");
        // StringBuilder es una clase que permite concatenar cadenas de texto de forma eficiente lo he buscado en refactoring budu
        StringBuilder iniciales = new StringBuilder();


        for (String nombre : nombres) {//declaracion de variable de tipo string y asignacion de valor a la variable nombre
            if (!nombre.isEmpty()) {
                iniciales.append(nombre.charAt(0)).append(".");
            }
        }
        return iniciales.toString().toUpperCase();
    }
}