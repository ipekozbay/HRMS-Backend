package kodlama.io.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper=false)
@Table(name = "images_cv")
@NoArgsConstructor
@AllArgsConstructor
//@PrimaryKeyJoinColumn(name="image_id")

public class ImageToCV  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name="id")
	private int id;

	@Column(name = "url")
	private String url;

	@OneToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "jobseekerId")
	private Jobseeker jobseeker;
}
