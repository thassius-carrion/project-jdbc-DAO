package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.impl.SellerDaoJDBC;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sDao = DaoFactory.createSellerDao();
		
		System.out.println(sDao.findById(3));
		
		
		
	}

}
