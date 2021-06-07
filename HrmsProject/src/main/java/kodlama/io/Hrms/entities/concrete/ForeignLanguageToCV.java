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
@Table(name = "foreign_languages_cv")
@NoArgsConstructor
@AllArgsConstructor

public class ForeignLanguageToCV extends Base {

	@Column(name = "language")
	private String language;

	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private Jobseeker jobseeker;
}
