package kodlama.io.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.Hrms.entities.concrete.City;

public interface CityDao extends JpaRepository<City, Integer> {
	City getById(int id); 
}
