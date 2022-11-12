package com.alfaCentauri.data;

import com.alfaCentauri.domain.Persona;

public interface IPersonaDAO {
    Persona findPersonaByEmail(Persona persona);
}
