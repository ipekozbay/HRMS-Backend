package kodlama.io.Hrms.business.abstracts;

import java.util.*;

import kodlama.io.Hrms.entities.concrete.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();
}
