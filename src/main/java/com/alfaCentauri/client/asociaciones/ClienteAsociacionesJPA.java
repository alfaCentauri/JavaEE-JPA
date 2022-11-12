package com.alfaCentauri.client.asociaciones;

import com.alfaCentauri.client.RunTestJPA;
import com.alfaCentauri.domain.Persona;
import com.alfaCentauri.domain.Usuario;
import javax.persistence.Persistence;
import java.util.List;

public class ClienteAsociacionesJPA extends RunTestJPA {
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
