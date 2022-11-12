package com.alfaCentauri.client.cascade;

import com.alfaCentauri.client.RunTestJPA;
import com.alfaCentauri.domain.Persona;
import com.alfaCentauri.domain.Usuario;

import javax.persistence.Persistence;

public class PersistenciaCascadaJPA extends RunTestJPA {

    /**
     * @param args Lista de argumentos.
     **/
    @Override
    public void main(String[] args) {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("PersonaPU");
        this.entityManager = entityManagerFactory.createEntityManager();
        this.entityTransaction = entityManager.getTransaction();
        //Inicia la transaccion
        entityTransaction.begin();
        //Paso 1. Crea nuevo objeto
        //objeto en estado transitivo
        Persona persona1 = new Persona("Hugo", "Hernandez", "hhernandez@mail.com", "55778822");

        //Crear objeto usuario (tiene dependencia con el objeto persona)
        Usuario usuario1 = new Usuario( );
        usuario1.setUsuario("hhernandez");
        usuario1.setPassword("1234");

        entityManager.persist(usuario1);
        entityTransaction.commit();
        //objetos en estados detached
        RunTestJPA.logger.debug("objeto persistido persona:" + persona1);
        RunTestJPA.logger.debug("objeto persistido usuario:" + usuario1);
        entityManager.close();
    }
}
