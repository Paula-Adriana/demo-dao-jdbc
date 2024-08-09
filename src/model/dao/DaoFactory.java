package model.dao;

import db.DB;
import model.dao.imp.SellerDaoJDBC;

public class DaoFactory {

	// retorna o tipo da interface mas internamente
	// instancia uma implementação
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
