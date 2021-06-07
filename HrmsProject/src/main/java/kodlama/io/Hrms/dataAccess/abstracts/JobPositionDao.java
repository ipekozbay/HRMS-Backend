package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entities.concrete.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
	JobPosition getByName(String name);

	JobPosition getByNameAndCategory(String Name, int category);
}
