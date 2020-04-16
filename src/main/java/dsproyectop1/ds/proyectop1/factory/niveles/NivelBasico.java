package dsproyectop1.ds.proyectop1.factory.niveles;

import dsproyectop1.ds.proyectop1.facade.PaneMaker;
import dsproyectop1.ds.proyectop1.factory.Basura;
import dsproyectop1.ds.proyectop1.factory.Nivel;
import dsproyectop1.ds.proyectop1.factory.basuras.BasuraBasicoInorganico;
import dsproyectop1.ds.proyectop1.factory.basuras.BasuraBasicoOrganico;
import java.util.Collections;

/**
 *
 * @author MrS.
 */
public class NivelBasico extends Nivel {
    /**
     * Variable tiempo.
     */
    private static final int TIEMPO = 10000;
    /**
     * It return the actual level of the game.
     * @return The level of the game.
     */
    @Override
    public String mostrarDescripcionNivel() {
        PaneMaker paneMaker = new PaneMaker();
        String mensaje = "<html>Nivel Basico:"
            + "<br>Debes clasificar la basura entre"
            + " Orgánico e Inorgánico.</html>";
        paneMaker.paneConfirm(mensaje);
        return "Nivel Basico";
    }
     /**
     * It Create the trash for the game.
     * @param objetos it´s an int of the option.
     * @return The number of the option.
     */
    @Override
    public Integer createBasuras(final int objetos) {
        final int diez = 10;
        final int diesiciete = 17;
        final int diesiocho = 18;
        final int veinticinco = 25;
        Basura basuraBasicoOrganica = new BasuraBasicoOrganico();
        Basura basuraBasicoInorganica = new BasuraBasicoInorganico();
    /* En este metodo mezclamos para que quede el arreglo
    final a mostrar de basuras dependiedo del tama*/
        Collections.shuffle(basuraBasicoOrganica.getNombresBasura());
        Collections.shuffle(basuraBasicoInorganica.getNombresBasura());
        switch (objetos) {
            case 0:
                //20
                //Tamaño para margen
                for (int i = 0; i < diez; i++) {
                    nombresBasuraTotal.add(
                        basuraBasicoOrganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraBasicoInorganica.getNombresBasura().get(i));
                }
                System.out.println(nombresBasuraTotal.size());
                break; // break es opcional
            case 1:
                for (int i = 0; i < diesiciete; i++) {
                    nombresBasuraTotal.add(
                        basuraBasicoOrganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraBasicoInorganica.getNombresBasura().get(i));
                }
                nombresBasuraTotal.add(
                    basuraBasicoInorganica.getNombresBasura().get(diesiocho));
                System.out.println(nombresBasuraTotal.size());
                break; // break es opcional
            case 2:
                for (int i = 0; i < veinticinco; i++) {
                    nombresBasuraTotal.add(
                        basuraBasicoOrganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraBasicoInorganica.getNombresBasura().get(i));
                }
                System.out.println(nombresBasuraTotal.size());
                break; // break es opcional
            default :
            System.exit(0);
            }
            return objetos;
        }
    /**
     * It Show the options of the game.
     * @param objetos it´s an int of the option.
     * @return The number of the option.
     */
    @Override
    public Integer mostrarOpciones(final int objetos) {
        PaneMaker paneMaker = new PaneMaker();
            long startTime = System.currentTimeMillis();
            String[] basuraMenu = {"Orgánico", "Inorgánico"};
            int i;
            for (i = 1; i < nombresBasuraSeparado.size(); i++) {
                //System.out.println(nombresBasuraTotal.get(i));
                int basuraMostrar = paneMaker.paneOptions(
                        basuraMenu, nombresBasuraSeparado.get(i)
                        .toString() + " (" + i + "/" + objetos + ")");
                System.out.println(basuraMostrar);
                int n = Integer.parseInt(idBasuraTotal
                .get(i).toString());
                String resultado;
                if (basuraMostrar == n - 1) {
                    System.out.println("correcto");
                    resultado = nombresBasuraSeparado
                    .get(i).toString() + " ->correcto";
                    correctos++;
                } else {
                    System.out.println("incorrecto");
                    resultado = nombresBasuraSeparado
                    .get(i).toString() + " ->inccorrecto";
                }
                resultados.add(resultado);
                long elapsed = System
                .currentTimeMillis() - startTime;
                if (elapsed >= this.TIEMPO) {
                    break;
                }
            }
        return objetos;
    }
}
