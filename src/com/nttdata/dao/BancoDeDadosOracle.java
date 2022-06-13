package com.nttdata.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.nttdata.beans.ClienteDaPastelaria;

public class BancoDeDadosOracle {
	
	public Connection conectarNoBancoOracle() throws SQLException{
		
		String usuario = "URA102HML";
		String senha = "Ura$Oi@2019";
		String host = "orahx04-scan.interno";
		String porta = "1549";
		String servico = "urahml";
		String url = "jdbc:oracle:thin:@//" + host + ":" + porta + "/" + servico;
		 
		Connection con = null;
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Abre a conexao
			con = DriverManager.getConnection(url, usuario, senha);
			
			if(con!=null) {
				System.out.println("=> CONECTOU NO BANCO");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Falha ao se conectar! ");
			e.printStackTrace();
		}
		return con;
	}
	
	/**
	 * Inserir Cliente na Tabela CLIENTE
	 * @param cliente
	 * @throws SQLException
	 */
	public void inserirCliente(ClienteDaPastelaria cliente) throws SQLException{
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			
			String sql = "INSERT INTO CLIENTE (NOME, CPF, ENDERECO, IDADE, TELEFONE) VALUES (?,?,?,?,?)";
			//Chama o metodo de criar a conexao
			con =  conectarNoBancoOracle();
			//Cria o Statemente para executar comandos
			stmt = con.prepareStatement(sql);
			//Setar as variaveis no statement
			stmt.setString(1, cliente.getNome());
			stmt.setString(2, cliente.getCpf());
			stmt.setString(3, cliente.getEndereco());
			stmt.setInt(4, cliente.getIdade());
			stmt.setString(5, cliente.getTelefone());
			
			stmt.executeUpdate();
			
			System.out.println("=> CLIENTE INSERIDO COM SUCESSO!!");
			
		} catch (SQLException e) {
			System.err.println("Ocorreu Erro!!");
			e.printStackTrace();
		}finally {
			stmt.close();
			con.close();
		}
		
	}
	
	/**
	 * Busca os Dados do Cliente
	 * @param cliente
	 * @return
	 * @throws SQLException
	 */
	public ClienteDaPastelaria buscarCliente(ClienteDaPastelaria cliente) throws SQLException{
		
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		ClienteDaPastelaria cli = null;
		
		try {
			
			String sql = "SELECT * FROM CLIENTE WHERE NOME = ?";
			//Chama o metodo de criar a conexao
			con =  conectarNoBancoOracle();
			//Cria o Statemente para executar comandos
			stmt = con.prepareStatement(sql);
			//Setar as variaveis no statement
			stmt.setString(1, cliente.getNome());
			//Pega o resultado do Statement e coloca no ResultSet	
			rs = stmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("NOME : " + rs.getString("NOME"));
				System.out.println("CPF : " + rs.getString("CPF"));
				System.out.println("ENDERECO : " + rs.getString("ENDERECO"));
				System.out.println("IDADE : " + rs.getInt("IDADE"));
				System.out.println("TELEFONE : " + rs.getString("TELEFONE"));
				
				cli = new ClienteDaPastelaria();
				cli.setNome(rs.getString("NOME"));
				cli.setCpf(rs.getString("CPF"));
				cli.setEndereco(rs.getString("ENDERECO"));
				cli.setIdade(rs.getInt("IDADE"));
				cli.setTelefone(rs.getString("TELEFONE"));
			}
			
		} catch (SQLException e) {
			System.err.println("Ocorreu Erro!!");
			e.printStackTrace();
		}finally {
			rs.close();
			stmt.close();
			con.close();
		}
		return cli;
	}
	
	/**
	 * Deleta o cliente 
	 * @param cliente
	 * @throws SQLException
	 */
	public void apagarCliente(ClienteDaPastelaria cliente) throws SQLException{
		
		Connection con = null;
		PreparedStatement stmt = null;
		
		try {
			
			String sql = "DELETE FROM CLIENTE WHERE NOME = ?";
			//Chama o metodo de criar a conexao
			con =  conectarNoBancoOracle();
			//Cria o Statemente para executar comandos
			stmt = con.prepareStatement(sql);
			//Setar as variaveis no statement
			stmt.setString(1, cliente.getNome());
			
			 
			
			System.out.println("=> CLIENTE APAGADO COM SUCESSO!!");
			
		} catch (SQLException e) {
			System.err.println("Ocorreu Erro!!");
			e.printStackTrace();
		}finally {
			stmt.close();
			con.close();
		}
		
	}

}
