package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("---- TEST 1: Department findById ----");
		Department department = departmentDao.findById(4);
		System.out.println(department.toString());
		
		System.out.println("\n---- TEST 2: Department findByName ----");
		department = departmentDao.findByName("Musical");
		System.out.println(department.toString());
		
		System.out.println("\n---- TEST 3: Department findAll ----");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj.toString());
		}
		
		System.out.println("\n---- TEST 4: Department Insert ----");
		Department newDepartment = new Department(null, "Tables");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n---- TEST 5: Department update ----");
		department = departmentDao.findById(6);
		department.setName("Trips");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		System.out.println("\n---- TEST 6: Department delete ----");
		departmentDao.deleteById(9);
		System.out.println("Delete completed!");
		
	}

}
