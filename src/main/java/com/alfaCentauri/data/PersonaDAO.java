package com.alfaCentauri.data;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;

@Stateless
public class PersonaDAO implements ITypeDAO{
    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;

    @Override
    public int insertar(Object nuevo) throws SQLException {
        return 0;
    }

    @Override
    public List listar() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public int actualizar(Object objeto) throws SQLException {
        return 0;
    }

    @Override
    public int eliminar(int id) throws SQLException {
        return 0;
    }

    @Override
    public Object buscarPorId(int id) throws SQLException {
        return null;
    }

    @Override
    public Object buscar(Object objeto) throws SQLException {
        return null;
    }
}
