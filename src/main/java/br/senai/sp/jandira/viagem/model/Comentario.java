package br.senai.sp.jandira.viagem.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comentario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Usuario usuario;
	
	@Column(length = 500)
	private String comentario;
	
	private int nota;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Destino destino;
	
	private LocalDate dataComentario;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}
	
	public Destino getDestino() {
		return destino;
	}
	
	public void setDestino(Destino destino) {
		this.destino = destino;
	}
	
	public LocalDate getDataComentario() {
		return dataComentario;
	}
	
	public void setDataComentario(LocalDate dataComentario) {
		this.dataComentario = dataComentario;
	}

	@Override
	public String toString() {
		return "Comentario [id=" + id + ", usuario=" + usuario + ", comentario=" + comentario + ", nota=" + nota + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comentario other = (Comentario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
