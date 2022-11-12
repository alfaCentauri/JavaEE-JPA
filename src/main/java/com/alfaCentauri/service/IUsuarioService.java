package com.alfaCentauri.service;

import java.util.List;

public interface IUsuarioService {
    /**
     * @return Return a list of object's.
     **/
    public List<Object> listAll();

    /**
     * Find a user by id.
     * @param object Type Object.
     * @return Return object with user or null.
     */
    public Object findUserById(Object object);

    /**
     * Save a user.
     * @param newObject Type Object.
     */
    public void save(Object newObject);

    public void update(Object modificado);

    public void delete(Object toErase);
}
