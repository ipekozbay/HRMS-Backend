package kodlama.io.Hrms.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entities.concrete.SkillToCV;

public interface SkillToCVDao extends JpaRepository<SkillToCV, Integer> {
	SkillToCV getById(int id);

	List<SkillToCV> getAllByJobseekerId(int id);

}
