package com.humberto.deliveryapi.api.exceptionhandler;

import java.time.LocalDateTime;
import java.util.List;

public class Problema {
	
	private Integer status;
	private LocalDateTime dateHora;
	private String titulo;
	private List<Campo> campos;
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public LocalDateTime getDateHora() {
		return dateHora;
	}
	public void setDateHora(LocalDateTime dateHora) {
		this.dateHora = dateHora;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
}
