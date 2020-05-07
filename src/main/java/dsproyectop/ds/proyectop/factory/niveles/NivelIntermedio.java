package dsproyectop.ds.proyectop.factory.niveles;

import dsproyectop.ds.proyectop.behaviors.Repartir20Basuras;
import dsproyectop.ds.proyectop.behaviors.Repartir35Basuras;
import dsproyectop.ds.proyectop.behaviors.Repartir50Basuras;
import dsproyectop.ds.proyectop.behaviors.impl.Repartir20BasurasIntermedio;
import dsproyectop.ds.proyectop.behaviors.impl.Repartir35BasurasIntermedio;
import dsproyectop.ds.proyectop.behaviors.impl.Repartir50BasurasIntermedio;
import dsproyectop.ds.proyectop.bridge.PaneMaker;
import dsproyectop.ds.proyectop.factory.Nivel;


/**
 *
 * @author MrS.
 */
public class NivelIntermedio extends Nivel {

    Repartir20Basuras repartir20BasurasIntermedio;
    Repartir35Basuras repartir35BasurasIntermedio;
    Repartir50Basuras repartir50BasurasIntermedio;

    /**
     * It set up the values.
     * @return True.
     */
    @Override
    public Boolean setUp() {
        repartir20BasurasIntermedio = new Repartir20BasurasIntermedio();
        repartir35BasurasIntermedio = new Repartir35BasurasIntermedio();
        repartir50BasurasIntermedio = new Repartir50BasurasIntermedio();
        
        return true;
    }
    /**
     * It return the actual level of the game.
     * @return The level of the game.
     */
    @Override
    public String mostrarDescripcionNivel(int tiempoDescripcion) {
        PaneMaker paneMaker = new PaneMaker();
        String mensaje = "<html>Nivel Intermedio:"
        + "<br>Debes clasificar entre Orgánico,"
        + " Inorgánico y Reciclable."
        + "(Tienes " + tiempoDescripcion/600 + " segundos para clasificar la mayor cantidad de basura que puedas.)" + "</html>";
        paneMaker.paneConfirm(mensaje);
        return "Nivel Intermedio";
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
                setnombresBasuraTotal(this.repartir20BasurasIntermedio.repartir());
                break; // break es opcional
            case 1:
                setnombresBasuraTotal(this.repartir35BasurasIntermedio.repartir());
                break; // break es opcional
            case 2:
                setnombresBasuraTotal(this.repartir50BasurasIntermedio.repartir());
                break; // break es opcional
            default :
            System.exit(0);
        }
        return objetos;
    }
}
