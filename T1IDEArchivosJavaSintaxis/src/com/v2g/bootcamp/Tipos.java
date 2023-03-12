package com.v2g.bootcamp;

public class Tipos {

    /**
     * Método principal del programa
     *
     * @param args arreglo con parámetros enviados por consola
     * @return void
     */
    public static void main(String[] args) {

        /**
         * Tipos primitivos de datos en java
         *
         * 1 - Numéricos enteros
         *      - byte
         *      - short
         *      - int
         *      - long
         *
         * 2 - Numéricos punto flotante
         *      - float
         *      - double
         *
         * 3 - Booleanos y caractéres
         *      - true | false
         *
         * 4 - Texto
         *      - char
         *      - string
         * */

        // Imprimimos números enteros
        printNumberIntTypes();

        // Imprimimos números decimales
        printNumberDecimalTypes();

        // Imprimimos valores de tipo booleano
        printBooleanTypes();

        // Imprimimos valores de tipo texto
        printTextTypes();

    }

    /**
     * Método que imprime los tipos enteros en java
     *
     * @return void
     */
    private static void printNumberIntTypes() {
        byte typeByte = 100; // Números desde -128 hasta 127
        short typeShort = 5000; // Números desde -32768 hasta 32767
        int typeInt = 100000; // Números  desde -2147483648 hasta 2147483647
        long typeLong = 15000000000L; // Números desde -9223372036854775808 hasta 9223372036854775807

        System.out.println("Números enteros:");
        System.out.println("-Tipo byte: " + typeByte);
        System.out.println("-Tipo short: " + typeShort);
        System.out.println("-Tipo int: " + typeInt);
        System.out.println("-Tipo long: " + typeLong);
        System.out.println();
    }

    /**
     * Método que imprime los tipos decimales en java
     *
     * @return void
     */
    private static void printNumberDecimalTypes() {
        float typeFloat = 5.75f;
        double typeDouble = 19.99d;

        System.out.println("Números decimales:");
        System.out.println("-Tipo float: " + typeFloat);
        System.out.println("-Tipo double: " + typeDouble);
        System.out.println();
    }

    /**
     * Método que imprime los tipos booleanos en java
     *
     * @return void
     */
    private static void printBooleanTypes() {
        boolean typeTrueValue = true;
        boolean typeFalseValue = false;

        System.out.println("Booleanos:");
        System.out.println("-Valor verdadero: " + typeTrueValue);
        System.out.println("-Valor false: " + typeFalseValue);
        System.out.println();
    }

    /**
     * Método que imprime los tipos de texto en java
     *
     * @return void
     */
    private static void printTextTypes() {
        char typeChar = 'B';
        String typeString = "Cadena de texto";

        System.out.println("Texto:");
        System.out.println("-Tipo char: " + typeChar);
        System.out.println("-Tipo string: " + typeString);
        System.out.println();
    }

}
