package application;

import java.util.Date;
import java.util.List;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		SellerDao sellerDao = DaoFactory.createSellerDao();

		System.out.println("---- TEST 1: Seller findById ----");
		Seller seller = sellerDao.findById(4);
		System.out.println(seller.toString());

		System.out.println("\n---- TEST 2: Seller findByDepartment ----");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj.toString());
		}
		
		System.out.println("\n---- TEST 3: Seller findAll ----");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj.toString());
		}
		
		System.out.println("\n---- TEST 4: Seller Insert ----");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
	}

}
