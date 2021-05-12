package br.senai.sp.jandira.viagem.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.senai.sp.jandira.viagem.dto.FotoDTO;
import br.senai.sp.jandira.viagem.model.Foto;
import br.senai.sp.jandira.viagem.repository.FotoRepository;

@RestController
@RequestMapping("/api")
public class FotoController {
	
	@Autowired
	private FotoRepository fotoRepository;
	
	@GetMapping("/destinos/{id}/fotos")
	public List<FotoDTO> getFotosDestino(@PathVariable Long id){
				
		List<FotoDTO> fotos = new ArrayList<FotoDTO>();
		
		for (Foto foto : fotoRepository.getFotosDestinos(id)) {
			FotoDTO dto = new FotoDTO();
			dto.setId(foto.getId());
			dto.setUrl(foto.getUrl());
			dto.setDestaque(foto.isDestaque());
			fotos.add(dto);
		}
		
		return fotos;
		
	}

}
