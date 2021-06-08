package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entities.concrete.JobAdvert;

public interface JobAdvertDao extends JpaRepository<JobAdvert, Integer> {
	JobAdvert getById(int id);

}
