package kodlama.io.Hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entities.concretes.ForeignLanguageToCV;

public interface ForeignLanguageToCVDao extends JpaRepository<ForeignLanguageToCV, Integer> {
	ForeignLanguageToCV getById(int id);

	List<ForeignLanguageToCV> getAllByJobseeker_id(int id);
}
