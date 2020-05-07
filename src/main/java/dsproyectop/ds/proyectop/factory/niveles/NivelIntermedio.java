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
    /**
     * Variable DIVISION.
     */
    private static final int DIVISION = 600;
    /**
     * Variable.
     */
    private Repartir20Basuras repartir20BasurasIntermedio;
    /**
     * Variable.
     */
    private Repartir35Basuras repartir35BasurasIntermedio;
    /**
     * Variable.
     */
    private Repartir50Basuras repartir50BasurasIntermedio;
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
    public String mostrarDescripcionNivel(final int tiempoDescripcion) {
        PaneMaker paneMaker = new PaneMaker();
        String mensaje = "<html>Nivel Intermedio:"
        + "<br>Debes clasificar entre Orgánico,"
        + " Inorgánico y Reciclable."
        + "(Tienes " + tiempoDescripcion / DIVISION
        + " segundos para clasificar la mayor cantidad de basura que puedas.)"
        + "</html>";
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
        setUp();
        switch (objetos) {
            case 0:
                setelementosIterados(this.repartir20BasurasIntermedio
                .iteraryCombinar20Basuras());
                setnombresBasuraTotal(this.repartir20BasurasIntermedio
                .repartir20());
                break; // break es opcional
            case 1:
                setelementosIterados(this.repartir35BasurasIntermedio
                .iteraryCombinar35Basuras());
                setnombresBasuraTotal(this.repartir35BasurasIntermedio
                .repartir35());
                break; // break es opcional
            case 2:
                setelementosIterados(this.repartir50BasurasIntermedio
                .iteraryCombinar50Basuras());
                setnombresBasuraTotal(this.repartir50BasurasIntermedio
                .repartir50());
                break; // break es opcional
            default :
            System.exit(0);
        }
        return objetos;
    }
}
