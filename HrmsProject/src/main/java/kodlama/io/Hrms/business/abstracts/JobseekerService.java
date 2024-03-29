package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concretes.Jobseeker;
import kodlama.io.Hrms.entities.dtos.JobSeekerCVDto;

public interface JobseekerService {

	Result add(Jobseeker jobseeker);
	Result update(Jobseeker jobseeker);
	Result delete(int id);
	DataResult<Jobseeker> getById(int id);
	
	DataResult<List<Jobseeker>> getAll();
	DataResult<Jobseeker> getJobseekerByNationalId(String nationalId);
	DataResult<JobSeekerCVDto> getJobseekerCVById(int id);
}
