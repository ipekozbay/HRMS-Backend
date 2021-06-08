package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entities.concrete.ImageToCV;

public interface ImageToCVDao extends JpaRepository<ImageToCV, Integer> {
	ImageToCV getById(int id);

	ImageToCV getByJobseeker_id(int id);

}
