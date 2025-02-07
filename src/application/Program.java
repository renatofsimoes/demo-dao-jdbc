package application;

import java.util.Date;
import java.util.Locale;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Department dep = new Department(1, "Books");
		
		Seller sel = new Seller(33, "Alex", "alex@gmail.com", new Date(), 3000.0, dep);

		System.out.println(dep.toString() + "\n" + sel.toString());
	}

}
