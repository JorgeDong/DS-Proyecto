package dsproyectop.ds.proyectop.factory.niveles;

import dsproyectop.ds.proyectop.behaviors.Repartir20Basuras;
import dsproyectop.ds.proyectop.behaviors.Repartir35Basuras;
import dsproyectop.ds.proyectop.behaviors.Repartir50Basuras;
import dsproyectop.ds.proyectop.behaviors.impl.Repartir20BasurasBasico;
import dsproyectop.ds.proyectop.behaviors.impl.Repartir35BasurasBasico;
import dsproyectop.ds.proyectop.behaviors.impl.Repartir50BasurasBasico;
import dsproyectop.ds.proyectop.bridge.PaneMaker;
import dsproyectop.ds.proyectop.factory.Basura;
import dsproyectop.ds.proyectop.factory.Nivel;
import dsproyectop.ds.proyectop.factory.basuras.BasuraBasicoOrganico;

/**
 *
 * @author MrS.
 */
public class NivelBasico extends Nivel {

    /**
     * Variable DIVISION.
     */
    private static final int DIVISION = 600;
    /**
     * Variable.
     */
    private Repartir20Basuras repartir20BasurasBasico;
    /**
     * Variable.
     */
    private Repartir35Basuras repartir35BasurasBasico;
    /**
     * Variable.
     */
    private Repartir50Basuras repartir50BasurasBasico;

    /**
     * It set up the values.
     * @return True.
     */
    @Override
    public Boolean setUp() {
        repartir20BasurasBasico = new Repartir20BasurasBasico();
        repartir35BasurasBasico = new Repartir35BasurasBasico();
        repartir50BasurasBasico = new Repartir50BasurasBasico();
        return true;
    }
    /**
     * It return the actual level of the game.
     * @return The level of the game.
     */
    @Override
    public String mostrarDescripcionNivel(final int tiempoDescripcion) {
        PaneMaker paneMaker = new PaneMaker();
        String mensaje = "<html>Nivel Basico:"
            + "<br>Debes clasificar la basura entre"
            + " Orgánico e Inorgánico."
        + "(Tienes" + tiempoDescripcion / DIVISION
        + " segundos para clasificar la mayor cantidad de basura que puedas.)"
        + "</html>";
        paneMaker.paneConfirm(mensaje);
        return "Nivel Basico";
    }
     /**
     * It Create the trash for the game.
     * @param objetosCB it´s an int of the option.
     * @return The number of the option.
     */
    @Override
    public Basura createBasuras(final int objetosCB) {
        setUp();
        switch (objetosCB) {
            case 0:
                setelementosIterados(this.repartir20BasurasBasico
                .iteraryCombinar20Basuras());
                setnombresBasuraTotal(this.repartir20BasurasBasico
                .repartir20());
                break; // break es opcional
            case 1:
                setelementosIterados(this.repartir35BasurasBasico
                .iteraryCombinar35Basuras());
                setnombresBasuraTotal(this.repartir35BasurasBasico
                .repartir35());
                break; // break es opcional
            case 2:
                setelementosIterados(this.repartir50BasurasBasico
                .iteraryCombinar50Basuras());
                setnombresBasuraTotal(this.repartir50BasurasBasico
                .repartir50());
                break; // break es opcional
            default :
            System.exit(0);
            }
            return new BasuraBasicoOrganico();
        }
}
