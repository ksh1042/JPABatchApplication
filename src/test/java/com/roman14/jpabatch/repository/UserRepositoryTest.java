package com.roman14.jpabatch.repository;

import com.roman14.jpabatch.entity.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest
{
  private UserRepository repository;

  @BeforeEach
  void init()
  {
    repository = new UserRepository();
  }

  @Test
  void addUser()
  {
    final User user = getUser();

    Assertions.assertDoesNotThrow(
      () -> repository.addUser(user)
    );
  }

  @Test
  void testAddUser()
  {
    final List<User> users = List.of(getUser(), getUser(), getUser());

    Assertions.assertDoesNotThrow(
      () -> repository.addUser(users)
    );
  }

  @AfterEach
  void finish()
  {
    repository.close();
  }

  private User getUser()
  {
    final User user = new User();
    user.setName(UUID.randomUUID().toString());
    user.setAddTime(LocalDateTime.now());
    user.setDescription("add by system");
    return user;
  }
}