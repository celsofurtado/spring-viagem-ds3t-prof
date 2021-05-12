package br.senai.sp.jandira.viagem.dto;

import java.time.LocalDate;

public class ComentarioDTO {

	private Long idComentario;
	private String idUsuario;
	private String displayName;
	private String photoUrl;
	private String comentario;
	private int nota;
	private LocalDate dataComentario;

	public Long getIdComentario() {
		return idComentario;
	}

	public void setIdComentario(Long idComentario) {
		this.idComentario = idComentario;
	}

	public String getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(String idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
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

	public LocalDate getDataComentario() {
		return dataComentario;
	}

	public void setDataComentario(LocalDate dataComentario) {
		this.dataComentario = dataComentario;
	}

	@Override
	public String toString() {
		return "ComentarioDTO [idComentario=" + idComentario + ", idUsuario=" + idUsuario + ", displayName="
				+ displayName + ", photoUrl=" + photoUrl + ", comentario=" + comentario + ", nota=" + nota
				+ ", dataComentario=" + dataComentario + "]";
	}

}
