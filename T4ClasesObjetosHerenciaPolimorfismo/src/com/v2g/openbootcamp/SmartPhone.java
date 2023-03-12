package com.v2g.openbootcamp;

public class SmartPhone extends SmartDevice {

    // Atributos específicos de la clase
    private String cameraResolution;

    /**
     * Constructor vacío
     */
    public SmartPhone() {
    }

    /**
     * Constructor con todos los atributos
     *
     * @param brand
     * @param manufacturingYear
     * @param operatingSystem
     * @param price
     * @param screenSize
     * @param cameraResolution
     */
    public SmartPhone(
            String brand,
            int manufacturingYear,
            String operatingSystem,
            double price,
            float screenSize,
            String cameraResolution) {
        // Herencia de los atributos de la clase padre SmartDevice
        super(brand, manufacturingYear, operatingSystem, price, screenSize);
        // Atributos propios de la clase
        this.cameraResolution = cameraResolution;
    }

    /**
     * Métodos getters y setter de la clase
     */
    public String getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
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
                " - Tamaño pantalla: " + this.getScreenSize() + "\"\n" +
                " - Resolución camara: " + this.getCameraResolution();
    }
}
