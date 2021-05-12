package br.senai.sp.jandira.viagem.dto;

public class DestinosRecentesDTO {

	private Long id;
	private String nome;
	private double valor;
	private String nomeCidade;
	private String siglaEstado;
	private String urlFoto;
	private String descricao;

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
