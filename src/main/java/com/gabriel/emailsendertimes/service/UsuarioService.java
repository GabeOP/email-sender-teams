package com.gabriel.emailsendertimes.service;

import com.gabriel.emailsendertimes.models.entities.Usuario;
import com.gabriel.emailsendertimes.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

  @Autowired
  private UsuarioRepository repository;

  @Autowired
  private EmailSenderService emailSenderService;

  public String salvarUsuario(Usuario usuario) {
    repository.save(usuario);
    //emailSenderService.enviarEmail(usuario);
    return "Usuário cadastrado com sucesso.";
  }
}
