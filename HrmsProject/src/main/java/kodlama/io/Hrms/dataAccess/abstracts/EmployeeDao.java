package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entities.concrete.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	Employee getById(int id);
}
