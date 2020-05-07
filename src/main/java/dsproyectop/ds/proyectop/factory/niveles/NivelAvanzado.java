package dsproyectop.ds.proyectop.factory.niveles;

import dsproyectop.ds.proyectop.behaviors.Repartir20Basuras;
import dsproyectop.ds.proyectop.behaviors.Repartir35Basuras;
import dsproyectop.ds.proyectop.behaviors.Repartir50Basuras;
import dsproyectop.ds.proyectop.behaviors.impl.Repartir20BasurasAvanzado;
import dsproyectop.ds.proyectop.behaviors.impl.Repartir35BasurasAvanzado;
import dsproyectop.ds.proyectop.behaviors.impl.Repartir50BasurasAvanzado;
import dsproyectop.ds.proyectop.bridge.PaneMaker;
import dsproyectop.ds.proyectop.factory.Nivel;


/**
 *
 * @author MrS.
 */
public class NivelAvanzado extends Nivel {

    /**
     * Variable DIVISION.
     */
    private static final int DIVISION = 600;
    /**
     * Variable.
     */
    private Repartir20Basuras repartir20BasurasAvanzado;
    /**
     * Variable.
     */
    private Repartir35Basuras repartir35BasurasAvanzado;
    /**
     * Variable.
     */
    private Repartir50Basuras repartir50BasurasAvanzado;

    /**
     * It set up the values.
     * @return True.
     */
    @Override
    public Boolean setUp() {
        repartir20BasurasAvanzado = new Repartir20BasurasAvanzado();
        repartir35BasurasAvanzado = new Repartir35BasurasAvanzado();
        repartir50BasurasAvanzado = new Repartir50BasurasAvanzado();
        return true;
    }
    /**
     * It return the actual level of the game.
     * @return The level of the game.
     */
    @Override
    public String mostrarDescripcionNivel(final int tiempoDescripcion) {
        PaneMaker paneMaker = new PaneMaker();
        String mensaje = "<html>Nivel Avanzado:"
            + "<br>Debes clasificar entre Orgánico, Papel, Vidrio, Metal,"
            + "Plástico, Textiles y Basura tecnológica."
        + "(Tienes" + tiempoDescripcion / DIVISION
        + " segundos para clasificar la mayor cantidad de basura que puedas.)"
        + "</html>";
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
        setUp();
        switch (objetos) {
            case 0:
                setelementosIterados(this.repartir20BasurasAvanzado
                .iteraryCombinar20Basuras());
                setnombresBasuraTotal(this.repartir20BasurasAvanzado
                .repartir20());
                break; // break es opcional
            case 1:
                setelementosIterados(this.repartir35BasurasAvanzado
                .iteraryCombinar35Basuras());
                setnombresBasuraTotal(repartir35BasurasAvanzado
                .repartir35());
                break; // break es opcional
            case 2:
                setelementosIterados(this.repartir50BasurasAvanzado
                .iteraryCombinar50Basuras());
                setnombresBasuraTotal(repartir50BasurasAvanzado
                .repartir50());
                break; // break es opcional
                default :
            System.exit(0);
            }
        return objetos;
    }
}
