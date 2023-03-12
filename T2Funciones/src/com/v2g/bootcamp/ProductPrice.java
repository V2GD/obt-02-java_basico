package com.v2g.bootcamp;

import java.text.DecimalFormat;

/**
 * Clase ProductPrice
 * <p>
 * Funcionalidad necesaria para gestionar el precio de un producto
 *
 * @author Verónica García Gayol
 */
public class ProductPrice {

    // Definición de variable de clase
    private static double IVA = 0.21D;

    /**
     * Método principal del programa
     *
     * @param args arreglo con parámetros enviados por consola
     * @return void
     */
    public static void main(String[] args) {
        double priceProduct1 = 23.45;
        double priceProduct2 = 2134.56;

        System.out.println("El precio del producto 1 SIN IVA es de: " + roundDoubleTwoDecimal(priceProduct1) + "€");
        System.out.println("El precio del producto 1 CON IVA es de: " + roundDoubleTwoDecimal(priceWithTax(priceProduct1)) + "€");
        System.out.println();
        System.out.println("El precio del producto 2 SIN IVA es de: " + roundDoubleTwoDecimal(priceProduct2) + "€");
        System.out.println("El precio del producto 2 CON IVA es de: " + roundDoubleTwoDecimal(priceWithTax(priceProduct2)) + "€");
    }

    /**
     * Método que dado un precio base lo devuelve con el IVA aplicado
     *
     * @param precio base
     * @return precio base + IVA
     */
    public static double priceWithTax(double basePrice) {
        double price = basePrice;
        return price + (price*IVA);
    }

    /**
     * Método utilizado para redondeo a dos decimales
     *
     * @param numberDouble
     * @return String formal #.00
     */
    public static String roundDoubleTwoDecimal(double numberDouble) {
        DecimalFormat numberTwoDecimal = new DecimalFormat("#.00"); // Formateo a dos decimales
        return numberTwoDecimal.format(numberDouble);
    }
}
