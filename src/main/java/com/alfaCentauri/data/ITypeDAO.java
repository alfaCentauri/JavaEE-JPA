package com.alfaCentauri.data;

import java.sql.SQLException;
import java.util.List;

public interface ITypeDAO {
    void insertar(Object nuevo) throws SQLException;
    List listar();
    void actualizar(Object objeto) throws SQLException;
    void eliminar(Object objeto) throws SQLException;
    Object buscarPorId(int id) throws SQLException;
    Object buscar(Object objeto) throws SQLException;
}
