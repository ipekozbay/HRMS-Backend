package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entities.concrete.CoverLetterToCV;

public interface CoverLetterToCVDao extends JpaRepository<CoverLetterToCV, Integer> {
	CoverLetterToCV getById(int Id);

}
