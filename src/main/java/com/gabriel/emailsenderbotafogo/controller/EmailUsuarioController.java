package com.gabriel.emailsenderbotafogo.controller;

import com.gabriel.emailsenderbotafogo.entities.EmailUsuario;
import com.gabriel.emailsenderbotafogo.service.EmailSenderService;
import com.gabriel.emailsenderbotafogo.service.EmailUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmailUsuarioController {

  @Autowired
  private EmailUsuarioService emailUsuarioService;

  @Autowired
  private EmailSenderService emailSenderService;

  @GetMapping("/{nomeTime}")
  public void api(@PathVariable String nomeTime) {
    emailSenderService.consumirApi(nomeTime);
  }

  @PostMapping("/api/v1")
  public String salvaEmail(@RequestBody EmailUsuario emailUsuario) {
    return emailUsuarioService.salvarEmail(emailUsuario);
  }
}
