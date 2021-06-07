package kodlama.io.Hrms.entities.concrete;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "cv_foreign_languages")
@NoArgsConstructor
@AllArgsConstructor
public class ImageToCV extends Base {

	@Column(name = "url")
	private String url;

	@OneToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "jobseekerId", referencedColumnName = "userId")
	private Jobseeker jobseeker;
}
