package com.nttdata.beans;

public class FornecedorDePastel extends TipoDePastel{
	
	private String nome;
	private String cnpj;
	private String endereco;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "FornecedorDePastel [nome=" + nome + ", cnpj=" + cnpj + ", endereco=" + endereco + ", telefone="
				+ telefone + "]";
	}
	
}
