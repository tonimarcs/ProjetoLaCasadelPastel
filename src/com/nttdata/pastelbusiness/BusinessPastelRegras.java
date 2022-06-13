package com.nttdata.pastelbusiness;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.nttdata.beans.ClienteDaPastelaria;
import com.nttdata.beans.TipoDePastel;

public class BusinessPastelRegras {
	
	public int totalDePasteis = 0;
	
	public int getTotalDePasteis() {
		return totalDePasteis;
	}

	public void setTotalDePasteis(int totalDePasteis) {
		this.totalDePasteis = totalDePasteis;
	}

	/**
	 * Metodo Retorna uma data
	 * @return a data atual do sistema
	 */
	public Date retornaData() {
		return new Date();
	}
	
	public Date retornaDataString(String dataRecebida) {
		Date dataFormatada = null;
		SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
		
		try {
			dataFormatada = formato.parse(dataRecebida);
			System.out.println("dataFormatada : " + dataFormatada);
		} catch (ParseException e) {
			System.out.println("ParseException : " + e);
		}
		return dataFormatada;
	}
	
	public int somarDoisNumeros(int a, int b) {
		return a + b;
	}
	
	public int multiplicaDoisNumeros(int a, int b) {
		return a * b;
	}
	
	public String getDadosCliente(ClienteDaPastelaria cliente) {
		return cliente.toString();
	}
	
	public void tirarOsZerosDaFrente(String x ) {
		
		String temp = "";
		for (int i = 0; i < x.length(); i++) {
			if (!x.substring(i, i + 1).equals("0")) { //checa se chegou no primeiro caracter q não é 0
				temp += x.substring(i, x.length()); // temp fica com os valores correspondentes à substring da posição atual ate o fim
				break; // sai do laço
			}
		}
		System.out.println("Antes: " + x + " Depois:" + temp);
	}
	
	public int totalDePasteis(TipoDePastel tipo) {
		int total = 0;
		try {
			totalDePasteis = totalDePasteis + tipo.getQuantidade();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return total;
	}

}
