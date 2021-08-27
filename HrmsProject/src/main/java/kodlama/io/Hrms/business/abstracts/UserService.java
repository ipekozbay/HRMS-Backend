package kodlama.io.Hrms.business.abstracts;

import java.util.List;

import kodlama.io.Hrms.core.utilities.results.DataResult;
import kodlama.io.Hrms.core.utilities.results.Result;
import kodlama.io.Hrms.entities.concretes.User;

public interface UserService {
	Result add(User user);
	Result delete(int id);
	Result update(User user);

	DataResult<List<User>> getAll();

	
	

}
