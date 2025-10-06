/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.example.ejemplojsf.servicio;





import org.example.ejemplojsf.modelo.Pelicula;

import java.util.List;

/**
 *
 * @author dachm
 */
public interface PeliculaServicio {
    
    List<Pelicula> consultarPeliculas();
    Pelicula agregarPelicula(Pelicula p);
    boolean borrarPelicula(Pelicula p);
    void actualizarPelicula(Pelicula p);
    Pelicula buscarPelicula(Pelicula p);
    
}
