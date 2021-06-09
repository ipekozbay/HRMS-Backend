package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concrete.LinkToCV;

public interface LinkToCVService {
	Result add(LinkToCV linkForCV);
	Result update(LinkToCV linkForCV);
	Result delete(int id);
	
	DataResult<LinkToCV> getById(int id);	
	DataResult<List<LinkToCV>> getAll();
	DataResult<List<LinkToCV>> getAllByJobseekerId(int id);
}
