package com.alfaCentauri.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public abstract class RunTestJPA{
    static Logger log = LogManager.getRootLogger();

    EntityManagerFactory entityManagerFactory;

    EntityTransaction entityTransaction;

    /**
     * @param args Lista de argumentos.
     **/
    abstract void main(String[] args);
}
