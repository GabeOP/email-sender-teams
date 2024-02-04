package com.gabriel.emailsenderbotafogo.controller;

import com.gabriel.emailsenderbotafogo.entities.EmailUsuario;
import com.gabriel.emailsenderbotafogo.service.EmailUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailUsuarioController {

  @Autowired
  private EmailUsuarioService service;

  @PostMapping("/api/v1")
  public String salvaEmail(@RequestBody EmailUsuario emailUsuario) {
    return service.salvarEmail(emailUsuario);
  }
}
