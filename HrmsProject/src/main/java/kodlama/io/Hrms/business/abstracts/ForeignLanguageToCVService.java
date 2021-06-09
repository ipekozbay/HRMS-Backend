package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concrete.ForeignLanguageToCV;

public interface ForeignLanguageToCVService {
	Result add(ForeignLanguageToCV foreignLanguageToCV);
	Result update(ForeignLanguageToCV foreignLanguageToCV);
	Result delete(int id);
	DataResult<ForeignLanguageToCV> getById(int id);	
	DataResult<List<ForeignLanguageToCV>> getAll();
	DataResult<List<ForeignLanguageToCV>> getAllByJobseekerId(int id);


}
