package com.v2g.openbootcamp;

/**
 * Clase CocheCRUDImpl
 *
 * @author Verónica García Gayol
 */
public class CocheCRUDImpl implements CocheCRUD {

    // Definición de variables de clase
    private String name;


    /**
     * Constructor de la clase
     */
    public CocheCRUDImpl() {
    }

    /**
     * Sobre carga de constructor de la clase con atributos
     *
     * @param name
     */
    public CocheCRUDImpl(String name) {
        this.name = name;
    }

    /**
     * Método getName
     * Obtiene el nombre del vehículo
     *
     * @return void
     */
    public String getName() {
        return name;
    }

    /**
     * Implementa el método save de la interfaz CocheCRUD
     * Guarda una instancia de coche
     *
     * @return void
     */
    @Override
    public void save() {
        System.out.println("Método save()");
        System.out.println("Guardando " + this.getName() + "...");
        System.out.println();
    }

    /**
     * Implementa el método findAll de la interfaz CocheCRUD
     * Lista todos los coches guardados
     *
     * @return void
     */
    @Override
    public void findAll() {
        System.out.println("Método findAll()");
        System.out.println("Coches: \n" +" - "+this.getName());
        System.out.println();
    }

    /**
     * Implementa el método delete de la interfaz CocheCRUD
     * Borra una instancia de coche
     *
     * @return void
     */
    @Override
    public void delete() {
        System.out.println("Método delete()");
        System.out.println("Borrando " + this.getName() + "...");
        System.out.println();
    }
}
