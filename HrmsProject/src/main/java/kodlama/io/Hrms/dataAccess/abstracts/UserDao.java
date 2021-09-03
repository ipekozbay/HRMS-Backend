package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entities.concretes.User;

public interface UserDao extends JpaRepository<User, Integer> {
	User findUserBymail(String mail);

	User getById(int id);
}
