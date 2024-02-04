package com.gabriel.emailsenderbotafogo.repository;

import com.gabriel.emailsenderbotafogo.entities.EmailUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailUsuarioRepository extends JpaRepository<EmailUsuario, Integer> {
}
