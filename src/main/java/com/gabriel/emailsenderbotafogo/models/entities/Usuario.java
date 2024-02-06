package com.gabriel.emailsenderbotafogo.models.entities;

import jakarta.persistence.*;

@Entity
public class Usuario {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(unique = true)
  private String email;
  private String time;

  public Usuario(){}

  public Usuario(Integer id, String email, String time) {
    this.id = id;
    this.email = email;
    this.time = time;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }
}
