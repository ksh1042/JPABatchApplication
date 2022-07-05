package com.roman14.jpabatch.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class AbstractRepository
{
  protected EntityManagerFactory emf;
  protected EntityManager em;

  protected AbstractRepository()
  {
    this.emf = Persistence.createEntityManagerFactory("JPABatchApplication");
    this.em = this.emf.createEntityManager();
  }

  public void close()
  {
    if( this.em != null ) this.em.close();
    if( this.emf != null ) this.emf.close();
  }

}
