package com.gabriel.emailsenderbotafogo.service;

import com.gabriel.emailsenderbotafogo.entities.EmailUsuario;
import com.gabriel.emailsenderbotafogo.repository.EmailUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmailUsuarioService {

  @Autowired
  private EmailUsuarioRepository repository;

  public String salvarEmail(EmailUsuario emailUsuario) {
    repository.save(emailUsuario);
    return "E-mail cadastrado com sucesso.";
  }
}
