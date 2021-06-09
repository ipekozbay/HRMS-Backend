package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concrete.SchoolToCV;

public interface SchoolToCVService {
	Result add(SchoolToCV schoolForCV);
	Result update(SchoolToCV schoolForCV);
	Result delete(int id);
	DataResult<SchoolToCV> getById(int id);	
	DataResult<List<SchoolToCV>> getAll();
	DataResult<List<SchoolToCV>> getAllByJobseekerIdOrderByEndAtDesc(int id);
	DataResult<List<SchoolToCV>> getAllByJobseekerId(int id);

}
