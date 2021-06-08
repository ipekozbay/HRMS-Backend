package kodlama.io.Hrms.entities.concrete;

import java.time.LocalDate;

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
@Table(name = "jobseekers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Jobseeker extends Base {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "firsName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "job")
	private String job;

	@Column(name = "nationalIdentity")
	private String nationalIdentity;

	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;

}
