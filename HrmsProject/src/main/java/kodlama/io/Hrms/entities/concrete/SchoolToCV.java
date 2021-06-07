package kodlama.io.Hrms.entities.concrete;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "schools_cv")
@Data

@NoArgsConstructor
@AllArgsConstructor
public class SchoolToCV extends Base {

	@Column(name = "name")
	private String name;

	@Column(name = "section")
	private String section;

	@Column(name = "start_at")
	private LocalDate startAt;

	@Column(name = "end_at", nullable = true)
	private LocalDate endAt;

	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private Jobseeker jobseeker;
}
