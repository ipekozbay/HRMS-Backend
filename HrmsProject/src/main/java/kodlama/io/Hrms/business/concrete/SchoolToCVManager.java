package kodlama.io.Hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.SchoolToCVService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.SchoolToCVDao;
import kodlama.io.Hrms.entities.concrete.SchoolToCV;

@Service
public class SchoolToCVManager implements SchoolToCVService {

	private SchoolToCVDao schoolToCVDao;

	@Autowired
	public SchoolToCVManager(SchoolToCVDao schoolToCVDao) {
		super();
		this.schoolToCVDao = schoolToCVDao;
	}

	@Override
	public Result add(SchoolToCV schoolToCV) {

		this.schoolToCVDao.save(schoolToCV);
		return new SuccessResult("School added.");
	}

	@Override
	public Result update(SchoolToCV schoolToCV) {
		this.schoolToCVDao.save(schoolToCV);
		return new SuccessResult("School  updated.");
	}

	@Override
	public Result delete(int id) {
		this.schoolToCVDao.deleteById(id);
		return new SuccessResult("School deleted.");
	}

	@Override
	public DataResult<SchoolToCV> getById(int id) {
		return new SuccessDataResult<SchoolToCV>(this.schoolToCVDao.getById(id));
	}

	@Override
	public DataResult<List<SchoolToCV>> getAll() {
		return new SuccessDataResult<List<SchoolToCV>>(this.schoolToCVDao.findAll());
	}

	@Override
	public DataResult<List<SchoolToCV>> getAllByJobseekerIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<SchoolToCV>>(this.schoolToCVDao.getAllByJobseeker_idOrderByEndAtDesc(id));
	}

	@Override
	public DataResult<List<SchoolToCV>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<SchoolToCV>>(this.schoolToCVDao.getAllByJobseeker_id(id));
	}

}
