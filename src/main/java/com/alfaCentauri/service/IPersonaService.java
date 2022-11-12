package com.alfaCentauri.service;

import com.alfaCentauri.domain.Persona;

import javax.ejb.Local;
import java.util.List;

@Local
public interface IPersonaService {
    /**
     * @return Return a list of persons.
     **/
    List<Persona> listarPersonas();

    /**
     * @param persona Type Persona.
     * @return Return a object Persona.
     **/
    Persona encontrarPersonaPorId(Persona persona);

    /**
     * @param persona Type Persona.
     * @return Return a object Persona.
     **/
    Persona encontrarPersona(Persona persona);

    /**
     * @param persona Type Persona.
     * @return Return a object Persona.
     **/
    Persona encontrarPersonaPorEmail(Persona persona);

    /**
     * @param persona Type Persona.
     **/
    void registrarPersona(Persona persona);

    /**
     * @param persona Type Persona.
     **/
    void modificarPersona(Persona persona);

    /**
     * @param persona Type Persona.
     **/
    void eliminarPersona(Persona persona);
}
