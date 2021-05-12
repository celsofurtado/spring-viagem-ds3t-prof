package br.senai.sp.jandira.viagem.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Destino {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	
	@Column(length = 1000)
	private String descricao;
	private double valor;
	private LocalDate dataInclusao;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Cidade cidade;

	@JsonIgnore
	@OneToMany(mappedBy = "destino")
	private List<Foto> fotos = new ArrayList<Foto>();
	
	@JsonIgnore
	@OneToMany(mappedBy = "destino")
	private List<Comentario> comentarios = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public LocalDate getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(LocalDate dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public List<Foto> getFotos() {
		return fotos;
	}

	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}

	@Override
	public String toString() {
		return "Destino [id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor
				+ ", dataInclusao=" + dataInclusao + ", cidade=" + cidade + "]";
	}

}
