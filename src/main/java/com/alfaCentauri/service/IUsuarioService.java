package com.alfaCentauri.service;

import com.alfaCentauri.domain.Usuario;

import java.util.List;

public interface IUsuarioService {
    /**
     * @return Return a list of object's.
     **/
    public List<Object> listarUsuarios();

    public Object encontrarObjectById(Object object);

    public void registrarObject(Object nuevo);

    public void modificar(Object modificado);

    public void eliminar(Object toErase);
}
