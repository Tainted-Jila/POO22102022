/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.librero;

import ico.fes.librosCom.Autor;
import ico.fes.librosCom.Editorial;

/**
 *
 * @author Alex
 */
public class Libro {
    private Autor autor;
    private Editorial Edit;
    private String Titulo;
    private String Categoria;

    public Libro() {
    }

    public Libro(Autor autor, Editorial Edit, String Titulo, String Categoria) {
        this.autor = autor;
        this.Edit = Edit;
        this.Titulo = Titulo;
        this.Categoria = Categoria;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEdit() {
        return Edit;
    }

    public void setEdit(Editorial Edit) {
        this.Edit = Edit;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    @Override
    public String toString() {
        return "Libro{" + "autor=" + autor + ", Edit=" + Edit + ", Titulo=" + Titulo + ", Categoria=" + Categoria + '}';
    }
    
    
            
}
