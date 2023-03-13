package com.v2g.openbootcamp;

/**
 * Interfaz CocheCRUD
 *
 * @author Verónica García Gayol
 */
public interface CocheCRUD {
    /**
     * Método save
     * Guarda una instancia de coche
     *
     * @return void
     */
    public void save();

    /**
     * Método findAll
     * Lista todos los coches guardados
     *
     * @return void
     */
    public void findAll();

    /**
     * Método delete
     * Borra una instancia de coche
     *
     * @return void
     */
    public void delete();
}
