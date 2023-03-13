package com.v2g.openbootcamp;

public class Main {
    /**
     * Método principal del programa
     *
     * Repaso de las principales estructuras de control
     *
     * @param args arreglo con parámetros enviados por consola
     * @return void
     *
     */
    public static void main(String[] args) {

        // 1- Creamos dos instancias de coche
        CocheCRUDImpl coche1 = new CocheCRUDImpl("Seat Ibiza");

        // 2- Simulamos guardar
        coche1.save();

        // 3- Simulamos listar
        coche1.findAll();

        // 4- Simulamos borrar
        coche1.delete();

    }
}
