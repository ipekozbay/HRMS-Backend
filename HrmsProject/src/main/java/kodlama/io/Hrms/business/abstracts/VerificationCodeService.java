package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concretes.VerificationCode;

public interface VerificationCodeService {
	Result add(VerificationCode code);
	Result delete(VerificationCode code);
	
	DataResult<List<VerificationCode>> getAll();

	
}