package com.v2g.openbootcamp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Instanciamos objeto de tipo SmartDevice
        // Constructor vacío con setters
        SmartDevice generic = new SmartDevice();
        generic.setBrand("Xiaomi");
        generic.setManufacturingYear(2020);
        generic.setOperatingSystem("Android 10.0");
        generic.setPrice(256.99);

        // Instanciamos objeto de tipo SmarPhone
        // Directamente pasando atributos al constructor
        SmartPhone ulephone = new SmartPhone("Ulefone",2020,"Android 10.0",339.99,6.3f,"48MP");

        // Instanciamos objeto de tipo SmartWatch
        // Directamente pasando atributos al constructor
        SmartWatch prixton = new SmartWatch("PRIXTON SW41", 2022,"Android Wear 1.1",85.45,1.69f,"Unisex","Sports");

        // Resultado SmartDevice
        System.out.println("SmartDevice engloba los atributos comunes a los dispositivos inteligentes:");
        System.out.println(generic.toString());
        System.out.println();


        // Resultado SmartPhone
        System.out.println("SmartPhone hereda los atributos de su clase padre SmartDevice añadiendo los suyos propios:");
        System.out.println(ulephone.toString());
        System.out.println();


        // Resultado SmartWath
        System.out.println("SmartWatch también hereda los atributos de su clase padre SmartDevice añadiendo los suyos propios:");
        System.out.println(prixton.toString());
        System.out.println();

    }
}
