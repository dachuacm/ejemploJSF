package org.example.ejemplojsf.servicio;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.example.ejemplojsf.modelo.Pelicula;


import java.util.List;

public class PeliculaServicioImp implements PeliculaServicio{

    protected EntityManager em;

    public PeliculaServicioImp() {
        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("basePeliculas");
        em = emf.createEntityManager();
    }


    @Override
    public List<Pelicula> consultarPeliculas() {
        TypedQuery<Pelicula> query= em.createQuery("SELECT p FROM Pelicula p",Pelicula.class);
        return query.getResultList();
    }

    @Override
    public Pelicula agregarPelicula(Pelicula p) {
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
        return p;
    }

    @Override
    public boolean borrarPelicula(Pelicula p) {
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
       return buscarPelicula(p)!=null;
    }

    @Override
    public void actualizarPelicula(Pelicula p) {
        em.getTransaction().commit();
        em.merge(p);
        em.getTransaction().commit();

    }

    @Override
    public Pelicula buscarPelicula(Pelicula p) {
        return em.find(Pelicula.class,p.getId());
    }


}
