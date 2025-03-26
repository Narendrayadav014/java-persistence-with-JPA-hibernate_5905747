package com.mycompany.app;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello from Java!");

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("library_persistence_unit");
    EntityManager em = emf.createEntityManager();

  }
}