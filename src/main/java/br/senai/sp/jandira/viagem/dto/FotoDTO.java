package br.senai.sp.jandira.viagem.dto;

public class FotoDTO {

	private Long id;
	private String url;
	private boolean destaque;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public boolean isDestaque() {
		return destaque;
	}

	public void setDestaque(boolean destaque) {
		this.destaque = destaque;
	}

}
