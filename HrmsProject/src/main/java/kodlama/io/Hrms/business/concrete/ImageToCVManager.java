package kodlama.io.Hrms.business.concrete;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Hrms.business.abstracts.ImageToCVService;
import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.core.utilities.results.SuccessDataResult;
import kodlama.io.Hrms.core.utilities.results.SuccessResult;
import kodlama.io.Hrms.dataAccess.abstracts.ImageToCVDao;
import kodlama.io.Hrms.entities.concretes.ImageToCV;

@Service
public class ImageToCVManager implements ImageToCVService {
	private ImageToCVDao imageToCVDao;

	@Autowired
	public ImageToCVManager(ImageToCVDao imageToCVDao) {
		super();
		this.imageToCVDao = imageToCVDao;
	}

	@Override
	public Result add(ImageToCV imageToCV) {
		this.imageToCVDao.save(imageToCV);
		return new SuccessResult("Image added.");
	}

	@Override
	public Result update(ImageToCV imageToCV) {
		this.imageToCVDao.save(imageToCV);
		return new SuccessResult("Image  updated.");
	}

	@Override
	public Result delete(int id) {
		this.imageToCVDao.deleteById(id);
		return new SuccessResult("Image has been deleted.");
	}

	@Override
	public DataResult<ImageToCV> getById(int id) {
		return new SuccessDataResult<ImageToCV>(this.imageToCVDao.getById(id));
	}

	@Override
	public DataResult<List<ImageToCV>> getAll() {
		return new SuccessDataResult<List<ImageToCV>>(this.imageToCVDao.findAll());

	}

	@Override
	public DataResult<ImageToCV> getByJobseekerId(int id) {
		return new SuccessDataResult<ImageToCV>(this.imageToCVDao.getByJobseeker_id(id));
	}

}