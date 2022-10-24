package com.alfaCentauri.data;

import java.sql.SQLException;
import java.util.List;

public interface ITypeDAO {
    int insertar(Object nuevo) throws SQLException;
    List listar();
    int actualizar(Object objeto) throws SQLException;
    int eliminar(int id) throws SQLException;
    Object buscarPorId(int id) throws SQLException;
    Object buscar(Object objeto) throws SQLException;
}
