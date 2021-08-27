package kodlama.io.Hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data

@EqualsAndHashCode(callSuper = false)

@Table(name = "experiences_cv")
@NoArgsConstructor
@AllArgsConstructor
//@PrimaryKeyJoinColumn(name="experience_id")
public class ExperienceToCV  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name="id")
	private int id;

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
