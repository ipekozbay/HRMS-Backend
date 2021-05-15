package kodlama.io.Hrms.business.concrete;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import java.util.List;
import kodlama.io.Hrms.business.abstracts.JobPositionService;
import kodlama.io.Hrms.dataAccess.abstracts.JobPositionDao;
import kodlama.io.Hrms.entities.concrete.JobPosition;

@Service
public class JobPositionManager implements JobPositionService {
	private JobPositionDao jobPositionDao;

	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;

	}

	@Override
	public List<JobPosition> getAll() {
		return this.jobPositionDao.findAll();
	}

}
