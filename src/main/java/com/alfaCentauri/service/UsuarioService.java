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
    public List<Object> listAll() {
        return usuarioDAO.listar();
    }

    @Override
    public Object findUserById(Object object) {
        return null;
    }

    @Override
    public void save(Object newObject) {

    }

    @Override
    public void update(Object modificado) {

    }

    @Override
    public void delete(Object toErase) {

    }
}
