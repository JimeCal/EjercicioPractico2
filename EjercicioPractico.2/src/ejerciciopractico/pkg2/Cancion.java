/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciopractico.pkg2;

/**
 *
 * @author bague
 */
public class Cancion {
    //Atributos solicitados para la clase
    private int id;
    private String titulo;
    private String autor;
    private String duracion;
    private int anio;
    
    //Constructor de la clase Cancion
    public Cancion(int id, String titulo, String autor, String duracion, int anio) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        this.anio = anio;
    }
    //Metodos encapsuladores(getters y setters) de año
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    //Metodos encapsuladores(getters y setters) de ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //Metodos encapsuladores(getters y setters) de titulo
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    //Metodos encapsuladores(getters y setters) de autor
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    //Metodos encapsuladores(getters y setters) de duracion
    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
    
}
