package com.alfaCentauri.data;

import com.alfaCentauri.domain.Usuario;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;

/****/
@Stateless
public class UsuarioDAO implements ITypeDAO{
    @PersistenceContext(unitName="UsuarioPU")
    EntityManager entityManager;

    @Override
    public void insertar(Object nuevo) throws SQLException {
        Usuario usuario = (Usuario) nuevo;
        entityManager.persist(usuario);
    }

    @Override
    public List listar() {
        return entityManager.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public void actualizar(Object objeto) throws SQLException {
        Usuario usuario = (Usuario) objeto;
        entityManager.merge(usuario);
    }

    @Override
    public void eliminar(Object objeto) throws SQLException {
        Usuario usuario = (Usuario) objeto;
        entityManager.remove( entityManager.merge(usuario) );
    }

    @Override
    public Object buscarPorId(int id) throws SQLException {
        return entityManager.find(Usuario.class, id);
    }

    @Override
    public Object buscar(Object objeto) throws SQLException {
        return entityManager.find(Usuario.class, objeto);
    }
}
