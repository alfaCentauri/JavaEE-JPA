package com.alfaCentauri.data;

import com.alfaCentauri.domain.Persona;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.sql.SQLException;
import java.util.List;

@Stateless
public class PersonaDAO implements ITypeDAO, IPersonaDAO{
    @PersistenceContext(unitName="PersonaPU")
    EntityManager entityManager;

    @Override
    public void insertar(Object nuevo) throws SQLException {
        Persona persona = (Persona) nuevo;
        entityManager.persist(persona);
    }

    @Override
    public List listar() {
        return entityManager.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public void actualizar(Object objeto) throws SQLException {
        Persona persona = (Persona) objeto;
        entityManager.merge(persona);
    }

    @Override
    public void eliminar(Object objeto) throws SQLException {
        Persona persona = (Persona) objeto;
        var result = entityManager.merge(persona);
        entityManager.remove(result);
    }

    @Override
    public Object buscarPorId(int id) throws SQLException {
        return entityManager.find(Persona.class, id);
    }

    @Override
    public Object buscar(Object objeto) throws SQLException {
        return entityManager.find(Persona.class, objeto);
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
        Query query = entityManager.createQuery("from Persona p where p.email =: email");
        query.setParameter("email", persona.getEmail());
        return (Persona) query.getSingleResult();
    }
}
