/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsproyectop1.ds.proyectop1;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;
// ww w.  j a  v a  2s  .co  m
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;


/**
 *
 * @author coque
 */
public class main {
           
    public static void main(String[] args) {
        
        //*************** Concetar con la base de datos*********************
        String base = "VfmPbt0NKi";
        String user = "VfmPbt0NKi";
        String password = "C1t0EIKAKP";
        String url = "jdbc:mysql://remotemysql.com:3306/"+ base;
        Connection conn = null;
         
        
        // Step 1: Loading or 
        // registering MySQL JDBC driver class
        try {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException cnfex) {
            System.out.println("Problem in"
                    + " loading MySQL JDBC driver");
            cnfex.printStackTrace();
        }
        
        
        try { 
            //Class.forName("com.mysql.jdbc.Driver");
            
            conn = (Connection) DriverManager.getConnection(url,user,password);
            System.out.println("Conexion exitosa");
            
             String query = "SELECT id,nombre FROM basura";
              Statement st = conn.createStatement();
              ResultSet rs = st.executeQuery(query);
              
              while (rs.next()){
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
//        String lastName = rs.getString("last_name");
//        Date dateCreated = rs.getDate("date_created");
//        boolean isAdmin = rs.getBoolean("is_admin");
//        int numPoints = rs.getInt("num_points");
        
        // print the results
        System.out.format("%s,%s\n", id, nombre);
      }
      st.close();
              
             
            // Do something with the Connection
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            System.exit(0); 
        }
        
        
        
        
        
        
        
        //Iniciar el juego
        //String respuesta = JOptionPane.showInputDialog("Escriba su usurio para ir al menu prinicpal");
        String[] options = {"Iniciar Juego", "Salir"};
        int seleccion = JOptionPane.showOptionDialog(null, 
                "Es necesario que seleccione una opcion", "Titulo", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, options, options[0]);
        //System.out.println(respuesta);
        //
        
        if(seleccion == 1){
            System.exit(0); 
        }else if (seleccion == 0){
            String respuesta = JOptionPane.showInputDialog(null, 
                    "Ingrese nombre de usuario", "Error!", 
            JOptionPane.ERROR_MESSAGE);
            
            String[] optionsMenu = {"Nivel Básico", "Nivel Intermedio","Nivel Avanzado","Registros"};
            int seleccionMenu = JOptionPane.showOptionDialog(null, 
                "Bienenido " + respuesta + "Selecciona una opción para iniciar el juego:", "Titulo", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, optionsMenu, optionsMenu[0]);
            
            switch (seleccionMenu){
                case 0:
                    nivelBasico();
                    break; // break es opcional
                case 1:
                    nivelIntermedio();
                          // Declaraciones
                    break; // break es opcional
                case 2:
                    nivelAvanzado();  // Declaraciones
                    break; // break es opcional
                    
                default : 
                    System.exit(0);
            }
            
            
            
            
            
            
        }
        
    }
    
    public static void nivelBasico(){
        
        String[] optionsMenu = {"20", "35","50"};
            int seleccionMenu = JOptionPane.showOptionDialog(null, 
                "<html>Nivel Basico:"
                + "<br>Debes clasificar la basura entre Orgánico e Inorgánico."
                + "<br>Selecciona la cantidad de basura a clasificar.</html>", "Titulo", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, optionsMenu, optionsMenu[0]);
                  
    }
    
    public static void nivelIntermedio(){
        String[] optionsMenu = {"20", "35","50"};
            int seleccionMenu = JOptionPane.showOptionDialog(null, 
                "<html>Nivel Basico:"
                + "<br>Debes clasificar entre Orgánico, Inorgánico y Reciclable"
                + "<br>Selecciona la cantidad de basura a clasificar.</html>", "Titulo", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, optionsMenu, optionsMenu[0]);
        
    }
    
    public static void nivelAvanzado(){
        String[] optionsMenu = {"20", "35","50"};
            int seleccionMenu = JOptionPane.showOptionDialog(null, 
                "<html>Nivel Basico:"
                + "<br>Debes clasificar entre Orgánico, Papel, Vidrio, Metal,"
                + "Plástico, Textiles y Basura tecnológica."
                + "<br>Selecciona la cantidad de basura a clasificar.</html>", "Titulo", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, optionsMenu, optionsMenu[0]);
            
            
            
                   
            String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            
//            String cadena = "<html>";
//            for(int i=0; i<= cars.length;i++){
//                
//            }


// Cantidad de objetos y nivel Avanzado elegido
cantidad de objetos elegidos/7 

20,35,50/7

if(35){
    // 5 consultas a la base por cada categoria 7/7
    
    select *
    from basura
    where 
    
}else if(20){
    // 3 consultas  a la base por categoria  6/7
    // 1 categhoria con 2 consultas 1/7
    
}elseif(50){
     // 7 consolutas a la base por categorai 6/7
     // 1 consulta con 8 1/7
        
}

   


long startTime = System.currentTimeMillis();
for (;;) {
    String[] basuraMenu = {"Orgánico", "Papel",
                 "Vidrio","Metal","Plástico","Textiles","Basura tecnológica"};
            int basuraMostrar = JOptionPane.showOptionDialog(null, 
                "Cascara de platano", "Titulo", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                null, basuraMenu, basuraMenu[0]);
            
    long elapsed = System.currentTimeMillis() - startTime;
    if (elapsed >= 10000) {
        break;
    }
}







//int count = 0;
//for(;;)
//    {
//    try {
//        Thread.sleep(1000);
//        
//        count ++;
//       System.out.println(count); 
//        if(count == 10){
//            break;
//        }
//    } catch (InterruptedException e) {
//        // TODO Auto-generated catch block
//        e.printStackTrace();
//    }
//}
// int n = 0;
// 
// while (n <= 15){
//           String[] basuraMenu = {"Orgánico", "Papel",
//                 "Vidrio","Metal","Plástico","Textiles","Basura tecnológica"};
//            int basuraMostrar = JOptionPane.showOptionDialog(null, 
//                "Cascara de platano", "Titulo", 
//                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
//                null, basuraMenu, basuraMenu[0]);  
//        n++;
// }







//            
// int TIME_VISIBLE = 10000;
// 
//boolean bandera = false;
//
// Timer timer = new Timer (TIME_VISIBLE, new ActionListener () {
//    public void actionPerformed(ActionEvent e){
//     System.out.println("se acabo el timepo");
//      bandera = true;
//    }
//});
//
//timer.start();
// 
//int n = 1;
//    while (n <= 10){
//        String[] basuraMenu = {"Orgánico", "Papel",
//            "Vidrio","Metal","Plástico","Textiles","Basura tecnológica"};
//            int basuraMostrar = JOptionPane.showOptionDialog(null, 
//                "Cascara de platano", "Titulo", 
//                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
//                null, basuraMenu, basuraMenu[0]);
//    n++;
//}
//
// 
        
// new Timer(TIME_VISIBLE, new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//             int n = 1;
//             
//               while (n <= 10){
//                   String[] basuraMenu = {"Orgánico", "Papel",
//                 "Vidrio","Metal","Plástico","Textiles","Basura tecnológica"};
//                int basuraMostrar = JOptionPane.showOptionDialog(null, 
//                "Cascara de platano", "Titulo", 
//                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
//                null, basuraMenu, basuraMenu[0]);
//                n++;
//               }
//        }
//      }).start();

            
            
            

            

/// Mostrar los resultados 
  JOptionPane.showMessageDialog(null, "<html><table>" +
"  <tr>" +
"    <th>Firstname</th>" +
"    <th>Lastname</th>" +
"    <th>Age</th>" +
"  </tr>" +
"  <tr>" +
"    <td>Jill</td>" +
"    <td>Smith</td>" +
"    <td>50</td>" +
"  </tr>" +
"  <tr>" +
"    <td>Eve</td>" +
"    <td>Jackson</td>" +
"    <td>94</td>" +
"  </tr>" +
"</table></html>");
            
        
    }
}
