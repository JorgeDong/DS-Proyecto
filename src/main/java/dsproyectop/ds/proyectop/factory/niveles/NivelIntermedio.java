package dsproyectop.ds.proyectop.factory.niveles;

import dsproyectop.ds.proyectop.facade.PaneMaker;
import dsproyectop.ds.proyectop.factory.Basura;
import dsproyectop.ds.proyectop.factory.Nivel;
import dsproyectop.ds.proyectop.factory.basuras.BasuraIntermedioInorganico;
import dsproyectop.ds.proyectop.factory.basuras.BasuraIntermedioOrganico;
import dsproyectop.ds.proyectop.factory.basuras.BasuraIntermedioReciclable;
import java.util.Collections;

/**
 *
 * @author MrS.
 */
public class NivelIntermedio extends Nivel {
    /**
     * Variable tiempo.
     */
    private static final int TIEMPO = 5000;
    /**
     * It return the actual level of the game.
     * @return The level of the game.
     */
    @Override
    public String mostrarDescripcionNivel() {
        PaneMaker paneMaker = new PaneMaker();
        String mensaje = "<html>Nivel Intermedio:"
        + "<br>Debes clasificar entre Orgánico,"
        + " Inorgánico y Reciclable.</html>";
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
        final int seis = 6;
        final int siete = 7;
        final int once = 11;
        final int doce = 12;
        final int diesiciete = 17;
        Basura basuraIntermedioOrganica = new BasuraIntermedioOrganico();
        Basura basuraIntermedioInorganica = new BasuraIntermedioInorganico();
        Basura basuraIntermedioReciclable = new BasuraIntermedioReciclable();
    /*En este metodo mezclamos para que quede el arreglo
    final a mostrar de basuras dependiedo del tama*/
        Collections.shuffle(basuraIntermedioOrganica.getNombresBasura());
        Collections.shuffle(basuraIntermedioInorganica.getNombresBasura());
        Collections.shuffle(basuraIntermedioReciclable.getNombresBasura());
        switch (objetos) {
            case 0:
                //20
                //Tamaño para margen
                for (int i = 0; i < seis; i++) {
                    nombresBasuraTotal.add(
                        basuraIntermedioOrganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraIntermedioInorganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraIntermedioReciclable.getNombresBasura().get(i));
                }
                nombresBasuraTotal.add(
                    basuraIntermedioInorganica.getNombresBasura().get(siete));
                nombresBasuraTotal.add(
                    basuraIntermedioReciclable.getNombresBasura().get(siete));
                System.out.println(nombresBasuraTotal.size());
                break; // break es opcional
            case 1:
                for (int i = 0; i < once; i++) {
                    nombresBasuraTotal.add(
                        basuraIntermedioOrganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraIntermedioInorganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraIntermedioReciclable.getNombresBasura().get(i));
                }
                nombresBasuraTotal.add(
                    basuraIntermedioInorganica.getNombresBasura().get(doce));
                nombresBasuraTotal.add(
                    basuraIntermedioReciclable.getNombresBasura().get(doce));
                    System.out.println(nombresBasuraTotal.size());
                break; // break es opcional
            case 2:
                for (int i = 0; i < seis; i++) {
                    nombresBasuraTotal.add(
                        basuraIntermedioOrganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraIntermedioInorganica.getNombresBasura().get(i));
                    nombresBasuraTotal.add(
                        basuraIntermedioReciclable.getNombresBasura().get(i));
                }
                nombresBasuraTotal.add(
                    basuraIntermedioInorganica.getNombresBasura()
                    .get(diesiciete));
                nombresBasuraTotal.add(
                    basuraIntermedioReciclable.getNombresBasura()
                    .get(diesiciete));
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
            String[] basuraMenu = {"Orgánico", "Inorgánico", "Reciclable"};
            int i;
            for (i = 1; i < nombresBasuraSeparado.size(); i++) {
                //System.out.println(nombresBasuraTotal.get(i));
                int basuraMostrar = paneMaker.paneOptions(
                        basuraMenu, nombresBasuraSeparado.get(i)
                        .toString() + " (" + i + "/" + objetos + ")");
                System.out.println(basuraMostrar);
                int n = Integer.parseInt(idBasuraTotal.get(i).toString());
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
