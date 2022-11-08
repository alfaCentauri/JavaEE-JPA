package com.alfaCentauri.service;

import com.alfaCentauri.data.UsuarioDAO;
import com.alfaCentauri.domain.Usuario;

import javax.inject.Inject;
import java.util.List;

public class UsuarioService implements IUsuarioService {
    @Inject
    private UsuarioDAO usuarioDAO;

    private Usuario usuario;

    public UsuarioService() {
        usuarioDAO = new UsuarioDAO();
    }

    /**
     * @return Return
     **/
    @Override
    public List<Object> listarUsuarios() {
        return usuarioDAO.listar();
    }

    @Override
    public Object encontrarObjectById(Object object) {
        return null;
    }

    @Override
    public void registrarObject(Object nuevo) {

    }

    @Override
    public void modificar(Object modificado) {

    }

    @Override
    public void eliminar(Object toErase) {

    }
}
