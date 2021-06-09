package kodlama.io.Hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.LinkToCVService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.LinkToCVDao;
import kodlama.io.Hrms.entities.concrete.LinkToCV;

@Service
public class LinkToCVManager implements LinkToCVService {

	private LinkToCVDao linkToCVDao;

	@Autowired
	public LinkToCVManager(LinkToCVDao linkToCVDao) {
		super();
		this.linkToCVDao = linkToCVDao;
	}

	@Override
	public Result add(LinkToCV linkToCV) {
		this.linkToCVDao.save(linkToCV);

		return new SuccessResult("link added");
	}

	@Override
	public Result update(LinkToCV linkToCV) {
		this.linkToCVDao.save(linkToCV);

		return new SuccessResult("link updated");

	}

	@Override
	public Result delete(int id) {
		this.linkToCVDao.deleteById(id);

		return new SuccessResult("link deleted");
	}

	@Override
	public DataResult<LinkToCV> getById(int id) {
		return new SuccessDataResult<LinkToCV>(this.linkToCVDao.getById(id));

	}

	@Override
	public DataResult<List<LinkToCV>> getAll() {
		return new SuccessDataResult<List<LinkToCV>>(this.linkToCVDao.findAll());
	}

	@Override
	public DataResult<List<LinkToCV>> getAllByJobseekerId(int id) {
		return new SuccessDataResult<List<LinkToCV>>(this.linkToCVDao.getAllByJobseekerId(id));
	}

}
