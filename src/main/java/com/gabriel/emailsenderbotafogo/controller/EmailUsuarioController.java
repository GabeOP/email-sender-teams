package com.gabriel.emailsenderbotafogo.controller;

import com.gabriel.emailsenderbotafogo.models.entities.Usuario;
import com.gabriel.emailsenderbotafogo.service.EmailSenderService;
import com.gabriel.emailsenderbotafogo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EmailUsuarioController {

  @Autowired
  private UsuarioService usuarioService;

  @Autowired
  EmailSenderService emailSenderService;

  @PostMapping
  public String salvarUsuario(@RequestBody Usuario usuario) {
    emailSenderService.enviarEmail(usuario);
    return usuarioService.salvarUsuario(usuario);
  }
}
