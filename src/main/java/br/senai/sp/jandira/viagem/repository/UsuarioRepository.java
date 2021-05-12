package br.senai.sp.jandira.viagem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.senai.sp.jandira.viagem.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
