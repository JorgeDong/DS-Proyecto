package dsproyectop.ds.proyectop.factory.niveles;

import dsproyectop.ds.proyectop.behaviors.Repartir20Basuras;
import dsproyectop.ds.proyectop.behaviors.Repartir35Basuras;
import dsproyectop.ds.proyectop.behaviors.Repartir50Basuras;
import dsproyectop.ds.proyectop.behaviors.impl.Repartir20BasurasAvanzado;
import dsproyectop.ds.proyectop.behaviors.impl.Repartir35BasurasAvanzado;
import dsproyectop.ds.proyectop.behaviors.impl.Repartir50BasurasAvanzado;
import dsproyectop.ds.proyectop.facade.PaneMaker;
import dsproyectop.ds.proyectop.factory.Nivel;




/**
 *
 * @author MrS.
 */
public class NivelAvanzado extends Nivel {
    Repartir20Basuras repartir20BasurasAvanzado = new Repartir20BasurasAvanzado();
    Repartir35Basuras repartir35BasurasAvanzado = new Repartir35BasurasAvanzado();
    Repartir50Basuras repartir50BasurasAvanzado = new Repartir50BasurasAvanzado();
    /**
     * Variable tiempo.
     */
    private static final int TIEMPO = 50000;
    /**
     * It return the actual level of the game.
     * @return The level of the game.
     */
    @Override
    public String mostrarDescripcionNivel(int tiempoDescripcion) {
        PaneMaker paneMaker = new PaneMaker();
        String mensaje = "<html>Nivel Avanzado:"
            + "<br>Debes clasificar entre Orgánico, Papel, Vidrio, Metal,"
            + "Plástico, Textiles y Basura tecnológica."
        + "(Tienes" + tiempoDescripcion/600 + " segundos para clasificar la mayor cantidad de basura que puedas.)" + "</html>";
        paneMaker.paneConfirm(mensaje);
        return "Nivel Avanzado";
    }

     /**
     * It Create the trash for the game.
     * @param objetos it´s an int of the option.
     * @return The number of the option.
     */
    @Override
    public Integer createBasuras(final int objetos) {
           
        switch (objetos) {
            case 0:
                 setnombresBasuraTotal(this.repartir20BasurasAvanzado.repartir());
                break; // break es opcional
            case 1:
                setnombresBasuraTotal(repartir35BasurasAvanzado.repartir());
                break; // break es opcional
            case 2:
                setnombresBasuraTotal(repartir50BasurasAvanzado.repartir());      
                break; // break es opcional
            default :
            System.exit(0);
            }
        return objetos;
    }
}
