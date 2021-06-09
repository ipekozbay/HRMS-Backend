package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concrete.Employer;

public interface EmployerService {

	Result add(Employer employee);
	Result delete(int id);
	Result update(Employer employee);

	DataResult<List<Employer>> getAll();
}
