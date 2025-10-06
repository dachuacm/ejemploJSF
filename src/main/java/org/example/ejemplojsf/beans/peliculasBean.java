package org.example.ejemplojsf.beans;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import org.example.ejemplojsf.modelo.Pelicula;
import org.example.ejemplojsf.servicio.PeliculaServicio;
import org.example.ejemplojsf.servicio.PeliculaServicioImp;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Named ("peliculasbean")
@SessionScoped
public class peliculasBean implements Serializable {

    private List<Pelicula> peliculas;
    private PeliculaServicio peliServ;

    public peliculasBean() {
        peliServ=new PeliculaServicioImp();
        //peliculas=new ArrayList<Pelicula>();
        peliculas= peliServ.consultarPeliculas();


    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }
}
