package com.gabriel.emailsendertimes.controller;

import com.gabriel.emailsendertimes.models.entities.Usuario;
import com.gabriel.emailsendertimes.service.UsuarioService;
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

  @PostMapping
  public String salvarUsuario(@RequestBody Usuario usuario) {
    return usuarioService.salvarUsuario(usuario);
  }
}
