package kodlama.io.Hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.ForeignLanguageToCVService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.ForeignLanguageToCVDao;
import kodlama.io.Hrms.entities.concrete.ForeignLanguageToCV;

@Service
public class ForeignLanguageToCVManager implements ForeignLanguageToCVService {

	private ForeignLanguageToCVDao foreignLanguageToCvDao;

	@Autowired
	public ForeignLanguageToCVManager(ForeignLanguageToCVDao foreignLanguagetOCvDao) {
		super();
		this.foreignLanguageToCvDao = foreignLanguageToCvDao;
	}

	@Override
	public Result add(ForeignLanguageToCV foreignLanguageToCV) {
		this.foreignLanguageToCvDao.save(foreignLanguageToCV);
		return new SuccessResult("Foreign language  added.");

	}

	@Override
	public Result update(ForeignLanguageToCV foreignLanguageToCV) {
		this.foreignLanguageToCvDao.save(foreignLanguageToCV);
		return new SuccessResult("Foreign language  updated.");

	}

	@Override
	public Result delete(int id) {
		this.foreignLanguageToCvDao.deleteById(id);
		return new SuccessResult("Foreign language  deleted.");
	}

	@Override
	public DataResult<ForeignLanguageToCV> getById(int id) {

		return new SuccessDataResult<ForeignLanguageToCV>(this.foreignLanguageToCvDao.getById(id));
	}

	@Override
	public DataResult<List<ForeignLanguageToCV>> getAll() {

		return new SuccessDataResult<List<ForeignLanguageToCV>>(this.foreignLanguageToCvDao.findAll());
	}

	@Override
	public DataResult<List<ForeignLanguageToCV>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<ForeignLanguageToCV>>(this.foreignLanguageToCvDao.getAllByJobseeker_id(id));

	}

}
