package br.senai.sp.jandira.viagem.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.senai.sp.jandira.viagem.dto.ComentarioDTO;
import br.senai.sp.jandira.viagem.dto.DestinosRecentesDTO;
import br.senai.sp.jandira.viagem.model.Comentario;
import br.senai.sp.jandira.viagem.model.Destino;
import br.senai.sp.jandira.viagem.model.Foto;
import br.senai.sp.jandira.viagem.repository.DestinoRepository;

@RestController
@RequestMapping("/api")
public class DestinoController {

	@Autowired
	private DestinoRepository destinoRepository;
	
	@GetMapping("/destinos")
	private List<DestinosRecentesDTO> getAll() {
		
		List<Destino> destinos = new ArrayList<>();
		
		List<DestinosRecentesDTO> destinosRecentes = new ArrayList<>();
		
		destinos = destinoRepository.findAll();
		
		for (Destino destino : destinos) {
			DestinosRecentesDTO dDto = new DestinosRecentesDTO();
			dDto.setId(destino.getId());
			dDto.setNome(destino.getNome());
			dDto.setNomeCidade(destino.getCidade().getNome());
			dDto.setSiglaEstado(destino.getCidade().getEstado().getSigla());
			dDto.setValor(destino.getValor());
			dDto.setDescricao(destino.getDescricao());
			dDto.setUrlFoto(getFotoDestaque(destino));
			destinosRecentes.add(dDto);
		}
		
		return destinosRecentes;
	}
	
	@GetMapping("/destinos/recentes")
	private List<DestinosRecentesDTO> getDestinosRecentes() {
		
		List<Destino> destinos = new ArrayList<>();
		
		List<DestinosRecentesDTO> destinosRecentes = new ArrayList<>();
		
		LocalDate dataFinal = LocalDate.now();
		LocalDate dataInicial = LocalDate.now().minusDays(100);
		System.out.printf("Data inicial: %s\nData final: %s", dataInicial, dataFinal);
		
		destinos = destinoRepository.getDestinosRecentes(dataInicial, dataFinal);
		
		for (Destino destino : destinos) {
			DestinosRecentesDTO dDto = new DestinosRecentesDTO();
			dDto.setId(destino.getId());
			dDto.setNome(destino.getNome());
			dDto.setNomeCidade(destino.getCidade().getNome());
			dDto.setSiglaEstado(destino.getCidade().getEstado().getSigla());
			dDto.setValor(destino.getValor());
			dDto.setDescricao(destino.getDescricao());
			dDto.setUrlFoto(getFotoDestaque(destino));
			destinosRecentes.add(dDto);
		}
		
		return destinosRecentes;
	}
	
	@GetMapping("/destinos/{id}")
	private DestinosRecentesDTO getDestino(@PathVariable Long id) {
		
		DestinosRecentesDTO dDto = new DestinosRecentesDTO();
		Destino destino = destinoRepository.findById(id).get();
		
		dDto.setId(destino.getId());
		dDto.setNome(destino.getNome());
		dDto.setValor(destino.getValor());
		dDto.setNomeCidade(destino.getCidade().getNome());
		dDto.setSiglaEstado(destino.getCidade().getEstado().getSigla());
		dDto.setUrlFoto(getFotoDestaque(destino));
		
		return dDto;
	}
	
	@PostMapping("/destinos")
	@ResponseStatus(code = HttpStatus.CREATED)
	private Destino saveDestino(@RequestBody Destino destino) {
		return destinoRepository.save(destino);
	}
	
	@PutMapping("/destinos")
	private Destino updateDestino(@RequestBody Destino destino) {
		return destinoRepository.save(destino);
	}
	
	@DeleteMapping("/destinos/{id}")
	private void deleteDestino(@PathVariable Long id) {
		destinoRepository.deleteById(id);
	}
	
	private String getFotoDestaque(Destino destino) {
		
		List<Foto> foto = destino
				.getFotos()
				.stream()
				.filter(fotoDestaque -> fotoDestaque.isDestaque())
				.collect(Collectors.toList());
		
		return foto.size() > 0 ? foto.get(0).getUrl() : "";
		
	}
	
}










