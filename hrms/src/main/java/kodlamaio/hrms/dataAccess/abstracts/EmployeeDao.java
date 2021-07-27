package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Employee;

public interface EmployeeDao  extends JpaRepository<Employee,Integer>{
	
	List<Employee> getByTck(String tck);
	
	List<Employee> getByEmail(String email); 
}