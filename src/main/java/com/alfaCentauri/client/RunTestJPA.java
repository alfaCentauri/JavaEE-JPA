package com.alfaCentauri.client;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public abstract class RunTestJPA{
    protected static Logger logger = LogManager.getRootLogger();

    protected EntityManagerFactory entityManagerFactory;

    protected EntityManager entityManager;

    protected EntityTransaction entityTransaction;

    /**
     * @param args Lista de argumentos.
     **/
    public abstract void main(String[] args);
}
