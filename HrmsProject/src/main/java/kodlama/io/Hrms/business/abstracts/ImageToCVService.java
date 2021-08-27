package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concretes.ImageToCV;

public interface ImageToCVService {
	Result add(ImageToCV ImageToCV);
	Result update(ImageToCV imageToCv);
	Result delete(int id);
	DataResult<ImageToCV> getById(int id);	
	DataResult<List<ImageToCV>> getAll();
	DataResult<ImageToCV> getByJobseekerId(int id);
}
