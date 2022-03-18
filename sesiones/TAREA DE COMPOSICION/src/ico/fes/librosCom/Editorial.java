package ico.fes.librosCom;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex
 */
public class Editorial {
    private String Tipo;
    private String Nombre;

    public Editorial() {
    }

    public Editorial(String Tipo, String Nombre) {
        this.Tipo = Tipo;
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    @Override
    public String toString() {
        return "Editorial{" + "Tipo=" + Tipo + ", Nombre=" + Nombre + '}';
    }
    
    
}
