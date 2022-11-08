package com.alfaCentauri.client.cicloVidaJPA;

import com.alfaCentauri.client.RunTestJPA;
import com.alfaCentauri.domain.Persona;

import javax.persistence.Persistence;

public class EncontrarObjetoJPA extends RunTestJPA {
    /**
     * @param args Lista de argumentos.
     **/
    @Override
    public void main(String[] args) {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("SgaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
        this.entityTransaction = this.entityManager.getTransaction();
        //Paso 1. Inicia la transacción
        this.entityTransaction.begin();
        //Paso 2. Ejecuta SQL de tipo select
        Persona persona1 = this.entityManager.find(Persona.class, 5);
        //Paso 3. termina la transaccion
        this.entityTransaction.commit();

        //Objeto en estado de detached
        logger.debug("Objeto recuperado:" + persona1);

        //Cerramos el entity manager
        this.entityManager.close();

    }
}
