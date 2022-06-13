package com.nttdata.beans;

public class ClienteDaPastelaria extends TipoDePastel {
	
	private String nome;
	private String cpf;
	private String endereco;
	private int idade;
	private String telefone;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "ClienteDaPastelaria [nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", idade=" + idade
				+ ", telefone=" + telefone + "]";
	}
	
	
}
