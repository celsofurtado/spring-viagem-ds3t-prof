package br.senai.sp.jandira.viagem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.senai.sp.jandira.viagem.model.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long>{

	//@Query("select d from Destino d where d.dataInclusao between :dataInicial and :dataFinal") 
	@Query("select c from Comentario c where c.destino.id = :id")
	List<Comentario> getComentariosFromDestino(Long id);

}
