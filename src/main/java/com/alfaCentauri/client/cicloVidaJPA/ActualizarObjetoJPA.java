package com.alfaCentauri.client.cicloVidaJPA;

import com.alfaCentauri.client.RunTestJPA;
import com.alfaCentauri.domain.Persona;

import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ActualizarObjetoJPA extends RunTestJPA {
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
        //El id proporcionado debe existir en la base de datos
        Persona persona1 = this.entityManager.find(Persona.class, 1);
        //Paso 3. termina la trasaccion 1
        this.entityTransaction.commit();
        //Objeto en estado detache
        logger.debug("Objeto recuperado:" + persona1);
        //Paso 4. setValue (nuevoValor)
        persona1.setApellido("Juarez");
        //Paso5. Inicia transaccion 2
        EntityTransaction entityTransaction2 = this.entityManager.getTransaction();
        entityTransaction2.begin();
        //Paso 6. Modificamos el objeto
        this.entityManager.merge(persona1);
        //Paso 7. Termina transaccion 2
        entityTransaction2.commit();
        //objeto en estado detached ya modificado
        logger.debug("Objeto recuperado:" + persona1);
        //Cerramos el entity manager
        this.entityManager.close();
    }
}
