package kodlama.io.Hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.CoverLetterToCVService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.CoverLetterToCVDao;
import kodlama.io.Hrms.entities.concretes.CoverLetterToCV;

@Service
public class CoverLetterToCVManager implements CoverLetterToCVService {
	private CoverLetterToCVDao coverLetterToCVDao;

	@Autowired
	public CoverLetterToCVManager(CoverLetterToCVDao coverLetterToCVDao) {
		super();
		this.coverLetterToCVDao = coverLetterToCVDao;
	}

	@Override
	public Result add(CoverLetterToCV coverLetterToCV) {
		this.coverLetterToCVDao.save(coverLetterToCV);
		return new SuccessResult("cover letter added.");
	}

	@Override
	public Result delete(int id) {
		this.coverLetterToCVDao.deleteById(id);
		return new SuccessResult("Cover letter deleted.");
	}

	@Override
	public Result update(CoverLetterToCV coverLetterForCV) {
		this.coverLetterToCVDao.save(coverLetterForCV);
		return new SuccessResult("Cover letter updated.");
	}

	@Override
	public DataResult<CoverLetterToCV> getById(int id) {
		return new SuccessDataResult<CoverLetterToCV>(this.coverLetterToCVDao.getById(id));
	}

	@Override
	public DataResult<List<CoverLetterToCV>> getAll() {
		return new SuccessDataResult<List<CoverLetterToCV>>(this.coverLetterToCVDao.findAll());
	}

}
