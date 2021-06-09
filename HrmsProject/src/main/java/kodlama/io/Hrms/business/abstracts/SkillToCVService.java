package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concrete.SkillToCV;

public interface SkillToCVService {
	Result add(SkillToCV programmingSkillForCV);
	Result update(SkillToCV programmingSkillForCV);
	Result delete(int id);
	
	DataResult<SkillToCV> getById(int id);	
	DataResult<List<SkillToCV>> getAll();
	DataResult<List<SkillToCV>> getAllByJobseekerId(int id);
}
