package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlama.io.Hrms.entities.concrete.Jobseeker;

public interface JobSkeerDao extends JpaRepository<Jobskeer, Integer> {
	Jobseeker findJobseekerByNationalityId(String nationalityId);

	Jobseeker getById(int id);
}
