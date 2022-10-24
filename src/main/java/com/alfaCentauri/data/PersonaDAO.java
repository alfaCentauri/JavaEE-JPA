package com.alfaCentauri.data;

import java.sql.SQLException;
import java.util.List;

public class PersonaDAO implements ITypeDAO{
    @Override
    public int insertar(Object nuevo) throws SQLException {
        return 0;
    }

    @Override
    public List listar() {
        return null;
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
