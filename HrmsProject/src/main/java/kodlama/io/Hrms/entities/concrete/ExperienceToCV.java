package kodlama.io.Hrms.entities.concrete;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "coverletters_cv")
@NoArgsConstructor
@AllArgsConstructor
public class ExperienceToCV extends Base {

	@Column(name = "details")
	private String detail;

	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private Jobseeker jobseeker;
}