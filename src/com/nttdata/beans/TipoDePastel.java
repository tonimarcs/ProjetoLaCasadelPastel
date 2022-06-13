package com.nttdata.beans;

public class TipoDePastel {
	
	private String tipo;
	private int quantidade;
	private String formato;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	@Override
	public String toString() {
		return "TipoDePastel [tipo=" + tipo + ", quantidade=" + quantidade + ", formato=" + formato + "]";
	}

}
