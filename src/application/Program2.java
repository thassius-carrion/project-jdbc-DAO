package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
	
		DepartmentDao depDao = DaoFactory.createDepDao();
		
		System.out.println("==== Test 1: department Insert ====");
		Department dep = new Department(null, "Music");
		depDao.insert(dep);
		System.out.println("Inserted! New Department" + dep);

		System.out.println("\n==== Test 2: department FindById ====");
		System.out.println(depDao.findById(2));
		
		System.out.println("\n==== Test 3: department Update ====");
		Department dep2 = depDao.findById(2);
		dep2.setName("Fones");
		depDao.update(dep2);
		System.out.println("Updated!!");
		
		System.out.println("\n==== Test 4: department FindAll ====");
		List<Department> list = depDao.findAll();
		for(Department dep3 : list) {
			System.out.println(dep3);
		}
		
		System.out.println("\n==== Test 5: department deleteById ====");
		depDao.deleteById(9);
		System.out.println("Deleted!");
	}

}
