package kodlama.io.Hrms.entities.concrete;

import java.time.LocalDate;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
<<<<<<< HEAD
@EqualsAndHashCode(callSuper = false)
@Table(name = "coverletters_cv")
=======
@Table(name = "experiences_cv")
>>>>>>> 096b0694afdd6acbc360ec23b6f4be07e55cf29e
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceToCV extends Base {

	@Column(name = "working_place")
	private String workingPlace;

	@Column(name = "mission")
	private String mission;

	@Column(name = "start_at")
	private LocalDate startAt;

	@Column(name = "end_at", nullable = true)
	private LocalDate endAt;

	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private Jobseeker jobseeker;
}
