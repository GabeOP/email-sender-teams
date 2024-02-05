package com.gabriel.emailsenderbotafogo.repository;

import com.gabriel.emailsenderbotafogo.models.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
