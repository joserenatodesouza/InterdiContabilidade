package br.edu.unifebe.interdisciplinar.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.edu.unifebe.interdisciplinar.conexao.Conexao;
import br.edu.unifebe.interdisciplinar.model.CadUsuario;

public class UsuarioDao implements IDao<CadUsuario>{
	
	private Connection conexao = null;
	
	public UsuarioDao() throws SQLException {
		conexao = Conexao.getConection();
	}

	@Override
	public boolean setIncluir(CadUsuario e) throws SQLException {
		return false;
	}

	@Override
	public void setEditar(CadUsuario e) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CadUsuario> getListar() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setExcluir(CadUsuario e) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
