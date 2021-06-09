package kodlama.io.Hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.SkillToCVService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.SkillToCVDao;
import kodlama.io.Hrms.entities.concrete.SkillToCV;

@Service
public class SkillToCVManager implements SkillToCVService {
	private SkillToCVDao skillToCVDao;

	@Autowired
	public SkillToCVManager(SkillToCVDao skillToCVDao) {
		super();
		this.skillToCVDao = skillToCVDao;
	}

	@Override
	public Result add(SkillToCV skillToCV) {

		this.skillToCVDao.save(skillToCV);
		return new SuccessResult(" skill  added.");
	}

	@Override
	public Result update(SkillToCV skillToCV) {
		this.skillToCVDao.save(skillToCV);
		return new SuccessResult(" skill  updated.");
	}

	@Override
	public Result delete(int id) {
		this.skillToCVDao.deleteById(id);
		return new SuccessResult(" skill  deleted.");
	}

	@Override
	public DataResult<SkillToCV> getById(int id) {

		return new SuccessDataResult<SkillToCV>(this.skillToCVDao.getById(id));
	}

	@Override
	public DataResult<List<SkillToCV>> getAll() {
		return new SuccessDataResult<List<SkillToCV>>(this.skillToCVDao.findAll());
	}

	@Override
	public DataResult<List<SkillToCV>> getAllByJobseekerId(int id) {

		return null;
	}

}
