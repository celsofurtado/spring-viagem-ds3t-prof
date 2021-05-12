package br.senai.sp.jandira.viagem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.sp.jandira.viagem.dto.ComentarioDTO;
import br.senai.sp.jandira.viagem.model.Comentario;
import br.senai.sp.jandira.viagem.repository.ComentarioRepository;

@RestController
@RequestMapping("/api")
public class ComentarioController {

	@Autowired
	private ComentarioRepository comentarioRepository;
	
	@GetMapping("/comentarios")
	public List<Comentario> getAll() {
		return comentarioRepository.findAll();
	}
	
	@GetMapping("/comentarios/destinos/{id}")
	public List<ComentarioDTO> getComentariosFromDestino(@PathVariable Long id) {
		
		List<Comentario> comentarios = comentarioRepository.getComentariosFromDestino(id);
		List<ComentarioDTO> comentariosDTO = new ArrayList<ComentarioDTO>();
		
		for (Comentario c : comentarios) {
			ComentarioDTO dto = new ComentarioDTO();
			dto.setIdComentario(c.getId());
			dto.setIdUsuario(c.getUsuario().getId());
			dto.setDisplayName(c.getUsuario().getDisplayName());
			dto.setPhotoUrl(c.getUsuario().getPhotoUrl());
			dto.setComentario(c.getComentario());
			dto.setNota(c.getNota());
			dto.setDataComentario(c.getDataComentario());
			comentariosDTO.add(dto);
		}
		
		return comentariosDTO;
		
	}
}
