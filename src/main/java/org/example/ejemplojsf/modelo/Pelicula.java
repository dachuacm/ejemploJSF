package org.example.ejemplojsf.modelo;

import jakarta.persistence.*;

import org.hibernate.annotations.Check;


@Entity
@Table(name="peliculas")

public class Pelicula
{
@Id
@Column(name="id_pelicula")
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;

 @Column(name="genero")
    private String tipo;

    private float duracion;

 public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
