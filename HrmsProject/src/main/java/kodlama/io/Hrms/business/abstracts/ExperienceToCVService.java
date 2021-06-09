package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concrete.ExperienceToCV;

public interface ExperienceToCVService {
	DataResult<List<ExperienceToCV>> getAll();
	DataResult<List<ExperienceToCV>> getAllByJobseekerIdOrderByEndAtDesc(int id);
	DataResult<List<ExperienceToCV>> getAllByJobseekerId(int id);
	DataResult<ExperienceToCV> getById(int id);
	
	Result update(ExperienceToCV experiencetOCV);
	Result delete(int id);
	Result add(ExperienceToCV experienceToCV);

}
