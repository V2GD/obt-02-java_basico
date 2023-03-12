package com.v2g.openbootcamp;

public class SmartWatch extends SmartDevice {

    // Atributos específicos de la clase
    private String gender;
    private String style;

    /**
     * Constructor vacío
     *
     * */
    public SmartWatch() {
    }

    /**
     * Constructor con todos los atributos
     * @param brand
     * @param manufacturingYear
     * @param operatingSystem
     * @param price
     * @param screenSize
     * @param gender
     * @param style
     *
     * */
    public SmartWatch(
            String brand,
            int manufacturingYear,
            String operatingSystem,
            double price,
            float screenSize,
            String gender,
            String style) {
        // Herencia de los atributos de la clase padre SmartDevice
        super(brand, manufacturingYear, operatingSystem, price, screenSize);
        //Atributos propios de la clase
        this.gender = gender;
        this.style = style;
    }

    /**
     * Métodos getters y setter de la clase
     *
     * */
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * Sobreescritura del método toString
     *
     * */

    @Override
    public String toString() {
        return " - Marca: " + this.getBrand() + "\n"+
                " - Año fabricación: " + this.getManufacturingYear() + "\n"+
                " - Sistema operativo: " + this.getOperatingSystem() + "\n"+
                " - Precio: " + this.getPrice() + "€ \n"+
                " - Tamaño pantalla: " + this.getScreenSize() + "\"\n"+
                " - Género: " + this.getGender()+ "\n"+
                " - Estilo: "+ this.getStyle();
    }
}
