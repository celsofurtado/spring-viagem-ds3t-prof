package br.senai.sp.jandira.viagem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.sp.jandira.viagem.model.Usuario;
import br.senai.sp.jandira.viagem.repository.UsuarioRepository;

@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@GetMapping("/usuarios")
	public List<Usuario> getUsuarios() {
		return usuarioRepository.findAll();
	}
	
	@PostMapping("/usuarios")
	public Usuario save(@RequestBody Usuario usuario) {
		Usuario usuarioNovo = usuario;
		Optional<Usuario> usuarioAtual = usuarioRepository.findById(usuario.getId());
		if (!usuarioAtual.isPresent()) {
			usuarioNovo = usuarioRepository.save(usuario);
		}
		return usuarioNovo;
	}
	
}
