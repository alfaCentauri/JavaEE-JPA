package com.alfaCentauri.service;

import com.alfaCentauri.domain.Persona;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface IPersonaServiceRemote {
    List<Persona> listarPersonas();

    Persona encontrarPersonaPorId(Persona persona);

    Persona encontrarPersonaPorEmail(Persona persona);

    void registrarPersona(Persona persona);

    void modificarPersona(Persona persona);

    void eliminarPersona(Persona persona);
}
