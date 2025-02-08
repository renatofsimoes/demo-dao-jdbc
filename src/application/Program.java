package application;

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

		System.out.println("---- 1: Seller findById ----");
		Seller seller = sellerDao.findById(4);
		System.out.println(seller.toString());

		System.out.println("\n---- 2: Seller findByDepartment ----");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj.toString());
		}
		
		System.out.println("\n---- 3: Seller findAll ----");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj.toString());
		}
	}

}
