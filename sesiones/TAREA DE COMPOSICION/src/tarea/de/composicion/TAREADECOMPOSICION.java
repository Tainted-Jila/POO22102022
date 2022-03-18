/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea.de.composicion;

import ico.fes.librero.Libro;
import ico.fes.librosCom.Autor;
import ico.fes.librosCom.Editorial;

/**
 *
 * @author Alex
 */
public class TAREADECOMPOSICION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1=new Libro();
        libro1.setAutor(new Autor("Brandon Sanderson", 46));
        libro1.setTitulo("Mistborn");
        libro1.setCategoria("Ciencia Ficción");
        libro1.setEdit(new Editorial("Tradicional", "Nova"));
        
        System.out.println( libro1 );
        
        
        
        // TODO code application logic here
    }
    
}
