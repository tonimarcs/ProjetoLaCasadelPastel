package testes;

import java.sql.SQLException;

import com.nttdata.beans.ClienteDaPastelaria;
import com.nttdata.dao.BancoDeDadosOracle;
import com.nttdata.pastelbusiness.BusinessPastelRegras;

public class TestesDao {

	public static void main(String[] args) {

		BusinessPastelRegras bpr = new BusinessPastelRegras();
		
		ClienteDaPastelaria cliente1 = new ClienteDaPastelaria();
		cliente1.setNome("Rafael");
		cliente1.setCpf("09580193711");
		cliente1.setEndereco("Rua das Caralhas, 20");
		cliente1.setIdade(1);
		cliente1.setTelefone("123");
		
		System.out.println("Dados Cliente 1 : " + bpr.getDadosCliente(cliente1));
		
		System.out.println("----------------------------------------");
		

		BancoDeDadosOracle dao = new BancoDeDadosOracle();
		try {
			//dao.inserirCliente(cliente1);
			//dao.buscarCliente(cliente1);
			dao.apagarCliente(cliente1);
			
		} catch (SQLException e) {
			System.out.println("Deu algo errado!!");
			e.printStackTrace();
		}
		
		
	}

}
