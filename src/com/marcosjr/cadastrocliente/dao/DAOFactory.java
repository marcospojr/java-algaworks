package com.marcosjr.cadastrocliente.dao;

import com.marcosjr.cadastrocliente.dao.jdbc.JdbcDAOFactory;

public abstract class DAOFactory {
	public static DAOFactory getDAOFactory() {
		return new JdbcDAOFactory();
	}
	
	public abstract ClienteDAO getClienteDAO();
	
}