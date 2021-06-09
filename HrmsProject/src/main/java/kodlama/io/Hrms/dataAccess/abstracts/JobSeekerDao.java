package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import kodlama.io.Hrms.entities.concrete.Jobseeker;

public interface JobSeekerDao extends JpaRepository<Jobseeker, Integer> {
	Jobseeker findJobseekerByNationalityId(String nationalityId);

	Jobseeker getById(int id);
}
