package kodlama.io.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entities.concretes.ExperienceToCV;

public interface ExperienceToCVDao extends JpaRepository<ExperienceToCV, Integer> {
	ExperienceToCV getById(int id);

	List<ExperienceToCV> getAllByJobseeker_idOrderByEndAtDesc(int id); // SORTİNG

	List<ExperienceToCV> getAllByJobseeker_id(int id);
}
