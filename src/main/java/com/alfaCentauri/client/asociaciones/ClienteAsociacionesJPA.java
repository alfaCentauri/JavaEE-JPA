package com.alfaCentauri.client.asociaciones;

import com.alfaCentauri.client.RunTestJPA;
import com.alfaCentauri.domain.Persona;
import com.alfaCentauri.domain.Usuario;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.domain.Usuario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class ClienteAsociacionesJPA implements RunTestJPA {
    /**
     * @param args Lista de argumentos.
     **/
    @Override
    public void main(String[] args) {
        this.entityManagerFactory = Persistence.createEntityManagerFactory("SgaPU");
        this.entityManager = this.entityManagerFactory.createEntityManager();
        
        List<Persona> personas = this.entityManager.createNamedQuery("Persona.findAll").getResultList();
        
        //cerramos la conexion
        this.entityManager.close();
        
        //Imprimir los objetos de tipo persona
        for(Persona persona : personas){
            logger.debug("Persona:" + persona);
            //recuperamos los usuarios de cada persona
            for(Usuario usuario: persona.getUsuarioList()){
                logger.debug("Usuario:" + usuario);
            }
        }
    }
}
