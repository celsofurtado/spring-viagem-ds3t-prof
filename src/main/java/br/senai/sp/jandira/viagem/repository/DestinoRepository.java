package br.senai.sp.jandira.viagem.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.senai.sp.jandira.viagem.model.Comentario;
import br.senai.sp.jandira.viagem.model.Destino;

public interface DestinoRepository extends JpaRepository<Destino, Long> {
	
	@Query("select d from Destino d where d.dataInclusao between :dataInicial and :dataFinal") 
	List<Destino> getDestinosRecentes(LocalDate dataInicial, LocalDate dataFinal);
	
}
