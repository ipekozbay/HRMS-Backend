package kodlama.io.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entities.concretes.SchoolToCV;

public interface SchoolToCVDao extends JpaRepository<SchoolToCV, Integer> {
	SchoolToCV getById(int id);

	List<SchoolToCV> getAllByJobseeker_idOrderByEndAtDesc(int id);
	List<SchoolToCV> getAllByJobseeker_id(int id);

}
