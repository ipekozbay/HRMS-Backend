package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concretes.Employee;
import kodlama.io.Hrms.entities.concretes.ExperienceToCV;;

public interface EmployeeService {
	Result add(Employee employee);
	Result delete(int id);
	Result update(Employee employee);
	DataResult<List<Employee>> getAll();

}
