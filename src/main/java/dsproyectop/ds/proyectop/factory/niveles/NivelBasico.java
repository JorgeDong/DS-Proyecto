package dsproyectop.ds.proyectop.factory.niveles;

import dsproyectop.ds.proyectop.behaviors.Repartir20Basuras;
import dsproyectop.ds.proyectop.behaviors.Repartir35Basuras;
import dsproyectop.ds.proyectop.behaviors.Repartir50Basuras;
import dsproyectop.ds.proyectop.behaviors.impl.Repartir20BasurasBasico;
import dsproyectop.ds.proyectop.behaviors.impl.Repartir35BasurasBasico;
import dsproyectop.ds.proyectop.behaviors.impl.Repartir50BasurasBasico;
import dsproyectop.ds.proyectop.facade.PaneMaker;
import dsproyectop.ds.proyectop.factory.Nivel;


/**
 *
 * @author MrS.
 */
public class NivelBasico extends Nivel {
    
    Repartir20Basuras repartir20BasurasBasico = new Repartir20BasurasBasico();
    Repartir35Basuras repartir35BasurasBasico = new Repartir35BasurasBasico();
    Repartir50Basuras repartir50BasurasBasico = new Repartir50BasurasBasico();
    /**
     * It return the actual level of the game.
     * @return The level of the game.
     */
    @Override
    public String mostrarDescripcionNivel(int tiempoDescripcion) {
        PaneMaker paneMaker = new PaneMaker();
        String mensaje = "<html>Nivel Basico:"
            + "<br>Debes clasificar la basura entre"
            + " Orgánico e Inorgánico."
        + "(Tienes" + tiempoDescripcion/600 + " segundos para clasificar la mayor cantidad de basura que puedas.)" + "</html>";
        paneMaker.paneConfirm(mensaje);
        return "Nivel Basico";
    }
     /**
     * It Create the trash for the game.
     * @param objetosCB it´s an int of the option.
     * @return The number of the option.
     */
    @Override
    public Integer createBasuras(final int objetosCB) {
        switch (objetosCB) {
            case 0:
                setnombresBasuraTotal(this.repartir20BasurasBasico.repartir());
                break; // break es opcional
            case 1:
                setnombresBasuraTotal(this.repartir35BasurasBasico.repartir());
                break; // break es opcional
            case 2:
                setnombresBasuraTotal(this.repartir50BasurasBasico.repartir());
                break; // break es opcional
            default :
            System.exit(0);
            }
            return objetosCB;
        }
}
