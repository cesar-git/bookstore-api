package com.cesar.bookstore.domain;

import java.util.Objects;

public class Livro {
	
	private Integer id;
	private String  titulo;
	private String  nome_autor;
	private String  descricao;
	private Categoria categoria;
	
	public Livro(Integer id, String titulo, String nome_autor, String descricao, Categoria categoria) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.nome_autor = nome_autor;
		this.descricao = descricao;
		this.categoria = categoria;
	}

	public Livro() {
		super();
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getNome_autor() {
		return nome_autor;
	}
	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
