package com.alfaCentauri.service;

import com.alfaCentauri.domain.Persona;
import com.alfaCentauri.data.PersonaDAO;

import javax.inject.Inject;
import java.sql.SQLException;
import java.util.List;

public class PersonaService implements IPersonaService{
    @Inject
    private PersonaDAO personaDao;
    private Persona persona;

    /**
     * @return Return a list of persons.
     **/
    @Override
    public List<Persona> listarPersonas() {
        return personaDao.listar();
    }

    /**
     * @param persona Type Persona.
     * @return Return a object Persona.
     **/
    @Override
    public Persona encontrarPersonaPorId(Persona persona) {
        try {
            this.persona = (Persona) personaDao.buscarPorId(persona.getIdPersona());
        } catch (SQLException error) {
            System.out.println("Error de consulta por id: " + error.getMessage());
            this.persona = null;
        }
        return this.persona;
    }

    /**
     * @param persona Type Persona.
     * @return Return a object Persona.
     **/
    @Override
    public Persona encontrarPersona(Persona persona) {
        try {
            this.persona = (Persona) personaDao.buscar(persona);
        } catch (SQLException error) {
            System.out.println("Error de consulta por id: " + error.getMessage());
            this.persona = null;
        }
        return this.persona;
    }

    /**
     * @param persona Type Persona.
     * @return Return a object Persona.
     **/
    @Override
    public Persona encontrarPersonaPorEmail(Persona persona) {
        try {
            this.persona = (Persona) personaDao.findPersonaByEmail(persona);
        } catch (Exception error) {
            System.out.println("Error de consulta por email: " + error.getMessage());
            this.persona = null;
        }
        return this.persona;
    }

    /**
     * @param persona Type Persona.
     **/
    @Override
    public void registrarPersona(Persona persona) {
        try {
            personaDao.insertar(persona);
        } catch (SQLException error) {
            System.out.println("Error de inserción: " + error.getMessage());
        }
    }

    /**
     * @param persona Type Persona.
     **/
    @Override
    public void modificarPersona(Persona persona) {
        try {
            personaDao.actualizar(persona);
        } catch (SQLException error) {
            System.out.println("Error de actualización: " + error.getMessage());
        }
    }

    /**
     * @param persona Type Persona.
     **/
    @Override
    public void eliminarPersona(Persona persona) {
        try {
            personaDao.eliminar(persona);
        } catch (SQLException error) {
            System.out.println("Error al borrar: " + error.getMessage());
        }
    }
}
