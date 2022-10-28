package com.alfaCentauri.data;

import com.alfaCentauri.domain.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;
import java.util.List;

/****/
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
        return null;
    }

    @Override
    public void actualizar(Object objeto) throws SQLException {

    }

    @Override
    public void eliminar(Object objeto) throws SQLException {

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
