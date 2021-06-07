package kodlama.io.Hrms.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "job_advert")
@Data

@NoArgsConstructor
@AllArgsConstructor
public class JobAdvert extends Base {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "name")
	private String name;

	@Column(name = "city_name")
	private String cityName;

	@Column(name = "salary")
	private int salary;

	@Column(name = "explanation")
	private String explanation;

	@Column(name = "is_open")
	private boolean isOpen;

	@Column(name = "is_close")
	private boolean isClose;

}
