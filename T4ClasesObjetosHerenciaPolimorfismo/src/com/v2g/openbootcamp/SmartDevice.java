package com.v2g.openbootcamp;

/**
 * SmartDevice
 * <p>
 * Define los objetos tipo SmartDevice
 *
 * @author: Verónica García Gayol
 */
public class SmartDevice {

    // Atributos de la clase
    private String brand;
    private int manufacturingYear;
    private String operatingSystem;
    private double price;
    private float screenSize;

    /**
     * Constructor vacío
     */
    public SmartDevice() {
    }

    /**
     * Constructor con todos los atributos
     *
     * @param brand
     * @param manufacturingYear
     * @param operatingSystem
     * @param price
     * @param screenSize
     */
    public SmartDevice(
            String brand,
            int manufacturingYear,
            String operatingSystem,
            double price,
            float screenSize) {
        this.brand = brand;
        this.manufacturingYear = manufacturingYear;
        this.operatingSystem = operatingSystem;
        this.price = price;
        this.screenSize = screenSize;
    }


    /**
     * Métodos getters y setter de la clase
     */
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getManufacturingYear() {
        return this.manufacturingYear;
    }

    public  void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getPrice() {
        return this.price;
    }

    public  void setPrice(double price) {
        this.price = price;
    }

    public float getScreenSize() {
        return this.screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
    }

    /**
     * Sobreescritura del método toString
     */
    @Override
    public String toString() {
        return " - Marca: " + this.getBrand() + "\n" +
                " - Año fabricación: " + this.getManufacturingYear() + "\n" +
                " - Sistema operativo: " + this.getOperatingSystem() + "\n" +
                " - Precio: " + this.getPrice() + "€ \n" +
                " - Tamaño pantalla: " + this.getScreenSize() +"\"";
    }
}
