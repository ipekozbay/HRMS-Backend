package kodlama.io.Hrms.dataAccess.abstracts;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlama.io.Hrms.entities.concrete.LinkToCV;

public interface LinkToCVDao extends JpaRepository<LinkToCV, Integer> {
	LinkToCV getById(int id);

	List<LinkToCV> getAllByJobseekerId(int id);
}
