package br.senai.sp.jandira.viagem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.senai.sp.jandira.viagem.model.Foto;

public interface FotoRepository extends JpaRepository<Foto, Long> {
	
	@Query("select f from Foto f where f.destino.id = ?1")
	List<Foto> getFotosDestinos(Long id);

}
