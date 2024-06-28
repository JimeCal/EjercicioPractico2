/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractico.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author bague
 */
public class EjercicioPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Cancion 
        Cancion song = new Cancion(1, "Die for you", "The Weeknd", "4:41" , 2016 );
        //Informacion de la cancion
        JOptionPane.showMessageDialog(null, "Informacion de la cancion:" + "\n" + "ID: " + song.getId() + "\n" + "Titulo: " + song.getTitulo() + "\n" + "Autor: " + song.getAutor() + "\n" + "Duracion: " + song.getDuracion() + "\n" + "Año de creacion: " + song.getAnio());
    }
    
}
