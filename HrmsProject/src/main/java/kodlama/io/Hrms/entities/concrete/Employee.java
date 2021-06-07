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
@Table(name = "employees")
@Data

@NoArgsConstructor
@AllArgsConstructor
public class Employee extends Base {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "firsName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "job")
	private String job;

}
