package testes;

import java.sql.SQLException;

import com.nttdata.beans.ClienteDaPastelaria;
import com.nttdata.beans.TipoDePastel;
import com.nttdata.dao.BancoDeDadosOracle;
import com.nttdata.pastelbusiness.BusinessPastelRegras;

public class TesteDoPastel {

	public static void main(String[] args) {

		BusinessPastelRegras bpr = new BusinessPastelRegras();
		//System.out.println("Data de hoje : " + bpr.retornaData());
		//System.out.println("Soma : " + bpr.somarDoisNumeros(2, 9));
		//System.out.println("Multiplica : " + bpr.multiplicaDoisNumeros(2, 9));
		//System.out.println("Data Formatada : " + bpr.retornaDataString("hasdfasdf"));
		//bpr.tirarOsZerosDaFrente("00000666666");
		
		
		ClienteDaPastelaria cliente1 = new ClienteDaPastelaria();
		cliente1.setNome("Antonio");
		cliente1.setCpf("09580193711");
		cliente1.setEndereco("Rua das Caralhas, 20");
		cliente1.setIdade(90);
		cliente1.setTelefone("21986586707");
		
		System.out.println("Dados Cliente 1 : " + bpr.getDadosCliente(cliente1));
		
		System.out.println("----------------------------------------");
		
		ClienteDaPastelaria cliente2 = new ClienteDaPastelaria();
		cliente2.setNome("Rafael");
		cliente2.setCpf("00099988877");
		cliente2.setEndereco("Rua 2, 20");
		cliente2.setIdade(130);
		cliente2.setTelefone("34977665544");
		
		System.out.println("Dados Cliente 2 : " + bpr.getDadosCliente(cliente2));
		
		System.out.println("----------------------------------------");
		
		
		/*
		TipoDePastel tp1 = new TipoDePastel();
		tp1.setTipo("Carne");
		tp1.setQuantidade(10);
		tp1.setFormato("Redondo");
		bpr.totalDePasteis(tp1);
		
		TipoDePastel tp2 = new TipoDePastel();
		tp2.setTipo("Carne");
		tp2.setQuantidade(20);
		tp2.setFormato("Quadrado");
		bpr.totalDePasteis(tp2);
		
		TipoDePastel tp3 = new TipoDePastel();
		tp3.setTipo("Queijo");
		tp3.setQuantidade(10);
		tp3.setFormato("Redondo");
		bpr.totalDePasteis(tp3);
		
		TipoDePastel tp4 = new TipoDePastel();
		tp4.setTipo("Frango");
		tp4.setQuantidade(20);
		tp4.setFormato("Quadrado");
		bpr.totalDePasteis(tp4);
		
		System.out.println("Pastel tipo 1 : " + tp1.toString());
		System.out.println("Pastel tipo 2 : " + tp2.toString());
		System.out.println("Pastel tipo 3 : " + tp3.toString());
		System.out.println("Pastel tipo 4 : " + tp4.toString());
		System.out.println("Total de Pasteis : " + bpr.getTotalDePasteis());
		*/
		
		BancoDeDadosOracle dao = new BancoDeDadosOracle();
		try {
			dao.inserirCliente(cliente1);
			//dao.inserirCliente(cliente2);
		} catch (SQLException e) {
			System.out.println("Deu algo errado!!");
			e.printStackTrace();
		}
		
		
	}

}
