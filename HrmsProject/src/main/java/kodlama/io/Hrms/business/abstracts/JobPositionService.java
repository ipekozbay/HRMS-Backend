package kodlama.io.Hrms.business.abstracts;

import java.util.*;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concrete.JobPosition;

public interface JobPositionService {
	DataResult<List<JobPosition>> getAll();

	DataResult<List<JobPosition>> getAllSorted();

	DataResult<List<JobPosition>> getAll(int pageNo, int pageSize);

	Result add(JobPosition jobPosition);

//	DataResult<JobPosition> getByName(String name);

//	DataResult<JobPosition> getByNameAndCategory(String Name, int category);

//	DataResult<List<JobPosition>> getByNameOrCategory(String Name, int category);

	// DataResult<List<JobPosition>> getByCategoryIn(List<Integer> categories);

//	DataResult<List<JobPosition>> getByNameContains(String Name);

	// DataResult<List<JobPosition>> getByNameStartsWith(String Name, int category);

//	DataResult<List<JobPosition>> getByNameAndCategory1(String Name, int category);
}
