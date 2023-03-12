package com.v2g.bootcamp;

/**
 * ShoppingList
 * <p>
 * Imprime por pantalla los productos de la lista de compra
 *
 * @author Verónica García Gayol
 */
public class ShoppingList {
    //Variable de clase con productos
    private static String[] products = {"Pan", "Leche", "Azúcar", "Arroz", "Pollo"};

    /**
     * Método principal del programa
     *
     * @param args arreglo con parámetros enviados por consola
     * @return void
     */
    public static void main(String[] args) {
        // Mostramos listado
        System.out.println("Lista de la compra: ");
        System.out.println(printProductShoppingList(products));
    }

    /**
     * Método que devuelve la lista de productos a partir de un array de productos
     *
     * @param productsList
     * @return String
     */
    public static String printProductShoppingList(String[] productsList) {
        String[] products = productsList;
        String productList = ""; //Variable de método que almacena el listado final

        //Bucle que recorre los productos generando el listado a devolver
        for (int i = 0; i < products.length; i++) {
            productList += (i + 1) + " - " + products[i] + "\n";
        }
        return productList;
    }
}
