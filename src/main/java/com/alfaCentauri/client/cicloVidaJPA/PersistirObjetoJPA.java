package com.alfaCentauri.client.cicloVidaJPA;

import com.alfaCentauri.client.RunTestJPA;
import com.alfaCentauri.domain.Persona;

import javax.persistence.Persistence;

public class PersistirObjetoJPA extends RunTestJPA {
    /**
     * @param args Lista de argumentos.
     **/
    @Override
    public void main(String[] args) {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("SgaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
        this.entityTransaction = this.entityManager.getTransaction();
        //Paso 1. Crea nuevo objeto
        //Objeto en estado transitivo
        Persona persona1 = new Persona("Pedro", "Luna", "pluna@mail.com", "13135566");
        //Paso 2. Inicia transaccion
        this.entityTransaction.begin();
        //Paso 3. Ejecuta SQL
        this.entityManager.persist( persona1 );
        logger.debug("Objeto persistido - aun sin commit:" + persona1);
        //Paso 4. commit/rollback
        this.entityTransaction.commit();
        //Objeto en estado detached
        logger.debug("Objeto persistido - estado detached:" + persona1);
        //Cerramos el entity manager
        this.entityManager.close();
    }
}
