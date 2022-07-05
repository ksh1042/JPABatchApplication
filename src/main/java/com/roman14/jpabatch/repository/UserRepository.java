package com.roman14.jpabatch.repository;

import com.roman14.jpabatch.entity.User;

import java.util.List;

public class UserRepository extends AbstractRepository
{
  public UserRepository()
  {
    super();
  }

  public void addUser(List<User> users)
  {
    em.getTransaction().begin();

    for ( User user : users )
    {
      em.persist(user);
    }

    em.getTransaction().commit();
  }

  public void addUser(User user)
  {
    em.getTransaction().begin();

    em.persist(user);

    em.getTransaction().commit();
  }
}
