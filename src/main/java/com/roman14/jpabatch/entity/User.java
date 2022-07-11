package com.roman14.jpabatch.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Users")
public class User
{
  @Id
  @GeneratedValue
  private Long id;

  private String name;

  @Column(name = "last_modify_time")
  private LocalDateTime lastModifyTime;

  @ManyToOne
  @JoinColumn(name = "last_modifed_user")
  private User lastModifiedUser;

  private LocalDateTime addTime;

  @Lob
  private String description;

  public Long getId()
  {
    return id;
  }

  public void setId(Long id)
  {
    this.id = id;
  }

  public String getName()
  {
    return name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public LocalDateTime getLastModifyTime()
  {
    return lastModifyTime;
  }

  public void setLastModifyTime(LocalDateTime lastModifyTime)
  {
    this.lastModifyTime = lastModifyTime;
  }

  public LocalDateTime getAddTime()
  {
    return addTime;
  }

  public void setAddTime(LocalDateTime addTime)
  {
    this.addTime = addTime;
  }

  public String getDescription()
  {
    return description;
  }

  public void setDescription(String description)
  {
    this.description = description;
  }

  public User getLastModifiedUser()
  {
    return lastModifiedUser;
  }

  public void setLastModifiedUser(User lastModifiedUser)
  {
    this.lastModifiedUser = lastModifiedUser;
  }


}
