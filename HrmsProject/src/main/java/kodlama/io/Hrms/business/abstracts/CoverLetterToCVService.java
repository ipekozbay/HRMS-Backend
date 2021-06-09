package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concrete.CoverLetterToCV;

public interface CoverLetterToCVService {
	DataResult<List<CoverLetterToCV>> getAll();
    DataResult<CoverLetterToCV> getById(int id);
    
	Result add(CoverLetterToCV coverLetterToCV);
	Result update(CoverLetterToCV coverLetterForCV);
	Result delete(int id);

	
}
