package kodlama.io.Hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.ExperienceToCVService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.ExperienceToCVDao;
import kodlama.io.Hrms.entities.concrete.ExperienceToCV;

@Service
public class ExperienceToCVManager implements ExperienceToCVService {

	private ExperienceToCVDao experienceToCVDao;

	@Autowired
	public ExperienceToCVManager(ExperienceToCVDao experienceToCVDao) {
		super();
		this.experienceToCVDao = experienceToCVDao;
	}

	@Override
	public Result add(ExperienceToCV experienceToCV) {
		this.experienceToCVDao.save(experienceToCV);
		return new SuccessResult("Experience added.");
	}

	@Override
	public Result update(ExperienceToCV experienceToCV) {
		this.experienceToCVDao.save(experienceToCV);
		return new SuccessResult("Experience updated.");
	}

	@Override
	public Result delete(int id) {
		this.experienceToCVDao.deleteById(id);
		return new SuccessResult("Experience deleted.");
	}

	@Override
	public DataResult<List<ExperienceToCV>> getAll() {
		return new SuccessDataResult<List<ExperienceToCV>>(this.experienceToCVDao.findAll());
	}

	@Override
	public DataResult<List<ExperienceToCV>> getAllByJobseekerIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<ExperienceToCV>>(
				this.experienceToCVDao.getAllByJobseeker_idOrderByEndAtDesc(id));
	}

	@Override
	public DataResult<List<ExperienceToCV>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<ExperienceToCV>>(this.experienceToCVDao.getAllByJobseeker_id(id));
	}

	@Override
	public DataResult<ExperienceToCV> getById(int id) {
		return new SuccessDataResult<ExperienceToCV>(this.experienceToCVDao.getById(id));
	}

}
