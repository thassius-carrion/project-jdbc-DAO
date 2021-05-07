package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sDao = DaoFactory.createSellerDao();
		
		System.out.println("==== Test 1: seller findById ====");
		System.out.println(sDao.findById(3));
		
		System.out.println("\n==== Test 2: seller findByDepartment ====");
		Department dep = new Department(2, null);
		List<Seller> list = sDao.findByDepartment(dep);
		for(Seller seller : list) {
			System.out.println(seller);
		}
		
		System.out.println("\n==== Test 3: seller findByAll ====");
		List<Seller> listAll = sDao.findAll();
		for(Seller seller : listAll) {
			System.out.println(seller);
		}
		
		System.out.println("\n==== Test 4: seller insert ====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n==== Test 5: seller update ====");
		Seller seller = new Seller();
		seller = sDao.findById(1);
		seller.setName("Thassius");
		sDao.update(seller);
		System.out.println("Update complete");
	}

}
